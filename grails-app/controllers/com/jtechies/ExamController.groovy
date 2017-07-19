package com.jtechies



import static org.springframework.http.HttpStatus.*
import grails.transaction.Transactional

@Transactional(readOnly = true)
class ExamController {

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond Exam.list(params), model:[examInstanceCount: Exam.count()]
    }
	def onlineExam(){
		
	}
	def showImage(){
		def ExamTypeInstance=ExamType.get(params.id)
		response.outputStream << ExamTypeInstance.logo
		response.outputStream.flush()
	}
	def questions(){
		
	//println params
	def candidate = Candidate.get(params.id)
	 candidate=session.setAttribute("candidate", candidate)
	def questions =Question.list();	
	//println "question"+questions
	
	model:[questions:questions,candidate:candidate]
	}
	@Transactional
 def saveAnswers(){
	// println "params"+params
	 def answerList=params.question
	 def answersList=Answers.findAllByCandidate(session.candidate)
	answerList.each{
		//Integer a=it
		//println "it"+it
		
		if(answersList.size()<=0){
		def answer=new Answers()
		answer.question=Question.get(it.key)
		answer.reply=it.value.toInteger()
		answer.candidate=session.candidate
		answer.save(flush:true);
		}
	 }
	 answersList=Answers.findAllByCandidate(session.candidate)
	def count=0	
	 def exam =new Exam();
		answersList.each{
			if(it.question.rightOption==it.reply){
				count++
				count+=count
			}
		}
		exam.candidate=session.candidate
	exam.total=count
	exam.save(flush:true)
	// def results = params.findAll {it.startsWith('employer')}.each{}
	 redirect(controller:'Exam' ,action:'result')
 }
 def result(){
	 
 }

    def show(Exam examInstance) {
        respond examInstance
    }

    def create() {
        respond new Exam(params)
    }

    @Transactional
    def save(Exam examInstance) {
        if (examInstance == null) {
            notFound()
            return
        }

        if (examInstance.hasErrors()) {
            respond examInstance.errors, view:'create'
            return
        }

        examInstance.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.created.message', args: [message(code: 'exam.label', default: 'Exam'), examInstance.id])
                redirect examInstance
            }
            '*' { respond examInstance, [status: CREATED] }
        }
    }

    def edit(Exam examInstance) {
        respond examInstance
    }

    @Transactional
    def update(Exam examInstance) {
        if (examInstance == null) {
            notFound()
            return
        }

        if (examInstance.hasErrors()) {
            respond examInstance.errors, view:'edit'
            return
        }

        examInstance.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'Exam.label', default: 'Exam'), examInstance.id])
                redirect examInstance
            }
            '*'{ respond examInstance, [status: OK] }
        }
    }

    @Transactional
    def delete(Exam examInstance) {

        if (examInstance == null) {
            notFound()
            return
        }

        examInstance.delete flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'Exam.label', default: 'Exam'), examInstance.id])
                redirect action:"index", method:"GET"
            }
            '*'{ render status: NO_CONTENT }
        }
    }

    protected void notFound() {
        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'exam.label', default: 'Exam'), params.id])
                redirect action: "index", method: "GET"
            }
            '*'{ render status: NOT_FOUND }
        }
    }
}

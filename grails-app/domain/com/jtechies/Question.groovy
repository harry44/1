package com.jtechies

class Question {
Integer id
String question 
String option1,option2,option3,option4
Integer rightOption
ExamType examType
Date dateCreated,lastUpdated
    static constraints = {
		question nullable:false
		examType nullable:true
    }
}

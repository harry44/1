package com.jtechies

class Candidate {
    Integer id
	String firstName
	String lastName
	String email
	String addressLine1
	String city
	String state
	String country
	String mobile
	Exam exam
	static belongsTo=[exam:Exam]
	static hasMany=[answers:Answers] 
    static constraints = {
		addressLine1 nullable:true
		state nullable:true
		country nullable:true
		lastName nullable:true
		exam nullable:true
		email nullable:false,unique:true
    }
	
}

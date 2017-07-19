package com.jtechies

class Answers {
Integer id
Question question
Candidate candidate
Integer reply
    static constraints = {
    }
	static belongsTo=[candidate:Candidate]
}

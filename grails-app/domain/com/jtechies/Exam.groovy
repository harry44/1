package com.jtechies

class Exam {
Integer id
Candidate candidate
//Question question
Date dateCreated ,lastUpdated
double total

    static constraints = {
    }
	static hasManny =[candidate:Candidate]
}

package com.abc;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class class2 {
	@Id
	private int answerid;
	private String answer;
	@ManyToOne
	private class1 question;
	public int getAnswerid() {
		return answerid;
	}
	public void setAnswerid(int answerid) {
		this.answerid = answerid;
	}
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	public class1 getQuestion() {
		return question;
	}
	public void setQuestion(class1 question) {
		this.question = question;
	}
	
	
}

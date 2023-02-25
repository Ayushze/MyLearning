package com.abc;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class class1 {
	@Id
	private int questionid;
	private String question;
	@OneToMany(mappedBy = "question", cascade = CascadeType.ALL)
	private List<class2> answer;

	public int getQuestionid() {
		return questionid;
	}

	public void setQuestionid(int questionid) {
		this.questionid = questionid;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public List<class2> getAnswer() {
		return answer;
	}

	public void setAnswer(List<class2> answer) {
		this.answer = answer;
	}
	
	
}

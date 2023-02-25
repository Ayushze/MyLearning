package com.cascade;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Question2 {
	@Id
	@Column(name="Question_id")
	private int questionId;
	private String question;
	@OneToMany(mappedBy = "question", fetch = FetchType.LAZY,cascade = CascadeType.ALL)
	private List<Answer2> answer;

	public int getQuestionId() {
		return questionId;
	}

	public void setQuestionId(int questionId) {
		this.questionId = questionId;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public List<Answer2> getAnswer() {
		return answer;
	}

	public void setAnswer(List<Answer2> answer) {
		this.answer = answer;
	}

	public Question2(int questionId, String question, List<Answer2> answer) {
		super();
		this.questionId = questionId;
		this.question = question;
		this.answer = answer;
	}

	public Question2() {
		super();
		// TODO Auto-generated constructor stub
	}	
	
	
}

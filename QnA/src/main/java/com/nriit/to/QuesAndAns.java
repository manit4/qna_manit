package com.nriit.to;

public class QuesAndAns {
	
	private String bookId;
	private String question;
	private String answer;
	private String category;
	public QuesAndAns() {
		super();
		// TODO Auto-generated constructor stub
	}
	public QuesAndAns(String bookId, String question, String answer, String category) {
		super();
		this.bookId = bookId;
		this.question = question;
		this.answer = answer;
		this.category = category;
	}
	public String getBookId() {
		return bookId;
	}
	public void setBookId(String bookId) {
		this.bookId = bookId;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
}

package com.nriit.repository;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.nriit.db.DBConnection;
import com.nriit.to.QuesAndAns;

@Repository
public class QuesAndAnswerRepository {
	
	public List<QuesAndAns> getBooks() {
		
		ArrayList<QuesAndAns> books = new ArrayList<>();
		
		try {
			
			Connection conn = DBConnection.getConnection();
			
			PreparedStatement statement =  conn.prepareStatement("select * from question_answer");
			
			ResultSet set = statement.executeQuery();
			
			while(set.next()) {
				
				String bookId = set.getString(1);
				String question = set.getString(2);
				String answer = set.getString(3);
				String category = set.getString(4);
				QuesAndAns book = new QuesAndAns(bookId, question, answer, category);
				books.add(book);
			}
			
		}catch (Exception e) {
			System.out.println("inside catch of getAllBooks");
			e.printStackTrace();
		}
		
		return books;
	}
	
	public void delete(String questionId) {
		
		try {
			
			Connection conn = DBConnection.getConnection();
			PreparedStatement statement = conn.prepareStatement("delete from question_answer where id = ?");
			
			statement.setString(1, questionId);
			statement.executeUpdate();
			
		}catch (Exception e) {
			System.out.println("Inside catch of deleteQuestion...");
			e.printStackTrace();
		}
		
		
	}

	public QuesAndAns get(String questionId) {
		
		QuesAndAns quesAndAns = null;
		
		try {
			
			Connection conn = DBConnection.getConnection();
			PreparedStatement preparedStatement = conn.prepareStatement("select * from question_answer where id = ?");
			
			preparedStatement.setString(1, questionId);
			
			ResultSet resultSet = preparedStatement.executeQuery();
			
			if(resultSet.next()) {
				
				String qId = resultSet.getString(1);
				String question = resultSet.getString(2);
				String answer = resultSet.getString(3);
				String category = resultSet.getString(4);
				
				quesAndAns = new QuesAndAns(qId, question, answer, category);
			}
		}catch (Exception e) {
			System.out.println("inside catch of get()");
			e.printStackTrace();
		}
		
		return quesAndAns;
	}
	
	public void update(String questionId, String question , String answer, String category) {
		
		try {
			Connection conn = DBConnection.getConnection();
			PreparedStatement preparedStatement = conn.prepareStatement("update question_answer set "
					+ "question = ?, answer = ?, category = ? where id = ?");
			
			preparedStatement.setString(1, question);
			preparedStatement.setString(2, answer);
			preparedStatement.setString(3, category);
			preparedStatement.setString(4, questionId);
			
			preparedStatement.executeUpdate();
			
		}catch (Exception e) {
			System.out.println("Inside update of QuestionAndAnswer");
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
		
		
	}
}

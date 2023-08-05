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
public class BookRepository {
	
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

}

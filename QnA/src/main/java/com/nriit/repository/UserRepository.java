package com.nriit.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;

import org.springframework.stereotype.Repository;

import com.nriit.db.DBConnection;
import com.nriit.to.User;

@Repository
public class UserRepository {

//	public void saveUser(String uname, String password, String name, String email) {
//		
//		try {
//			
//			Connection conn = DBConnection.getConnection();
//
//			PreparedStatement statement = conn.prepareStatement("insert into user values(?, ?, ?, ?)");
//
//			statement.setString(1, uname);
//			statement.setString(2, password);
//			statement.setString(3, name);
//			statement.setString(4, email);
//
//			statement.executeUpdate();
//		}catch (Exception e) {
//			System.out.println("inside catch of saveUser of UserRepository..");
//			e.printStackTrace();
//		}
//
//		
//	}
	
public void saveUser(User user) {
		
		try {
			
			Connection conn = DBConnection.getConnection();

			PreparedStatement statement = conn.prepareStatement("insert into user values(?, ?, ?, ?)");

			statement.setString(1, user.getUsername());
			statement.setString(2, user.getPassword());
			statement.setString(3, user.getName());
			statement.setString(4, user.getEmail());

			statement.executeUpdate();
		}catch (Exception e) {
			System.out.println("inside catch of saveUser of UserRepository..");
			e.printStackTrace();
		}

		
	}

}

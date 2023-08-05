package com.nriit.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

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

			PreparedStatement statement = conn.prepareStatement("insert into user values(?, ?, ?, ?, ?)");

			statement.setString(1, user.getUsername());
			statement.setString(2, user.getPassword());
			statement.setString(3, user.getName());
			statement.setString(4, user.getEmail());
			statement.setString(5, user.getRole());

			statement.executeUpdate();
		} catch (Exception e) {
			System.out.println("inside catch of saveUser of UserRepository..");
			e.printStackTrace();
		}

	}

	public User findUser(String username, String password) {

		//String message = null;
		User user = null;

		try {

			Connection conn = DBConnection.getConnection();

			PreparedStatement statement = conn
					.prepareStatement("select * from user where username = ? and password = ?");

			statement.setString(1, username);
			statement.setString(2, password);

			ResultSet resultSet = statement.executeQuery();

			if (resultSet.next()) {
				//message = "Login Successfull";
				String uname = resultSet.getString(1);
				String pwd = resultSet.getString(2);
				String name = resultSet.getString(3);
				String email = resultSet.getString(4);
				String role = resultSet.getString(5);
				user = new User(uname, pwd, name, email, role);
			}
		} catch (Exception e) {
			System.out.println("insdie catch of findUser()");
			e.printStackTrace();
		}
		return user;
	}

}

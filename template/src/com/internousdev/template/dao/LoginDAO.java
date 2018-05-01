package com.internousdev.template.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import com.internousdev.template.dto.LoginDTO;
import com.internousdev.template.util.DBConnector;

public class LoginDAO {
	private DBConnector dbConnector = new DBConnector();
	private Connection connection = dbConnector.getConnection();
	private LoginDTO loginDTO = new LoginDTO();

	public LoginDTO getLoginUserInfo(String loginUserId,String loginPassword){
		String sql = "SELECT * FROM login_user_transaction where login_id = ? AND login_pass = ?";

		       try{
		    	      PreparedStatement preparedStatement = connection.prepareStatement(sql);
		    	      PreparedStatemen.setString(1,loginUserId);
		    	      PreparedStatemen.setString(2,loginPassword);

		    	      ResultSet resultSet = PreparedStatemen.executeQuery();

		    	      if(resultSet.next()){
		    	    	       loginDTO.setLoginId(result.getString("login_id"));
		    	    	       loginDTO.setLoginPassword(resultSet.getString("login_pass"));
		    	    	       loginDTO.setUserName(resultSet.getString("user_name"));

		    	    	       if(!(resultSet.getString("login_id").equals(null))){
		    	    	    	   loginDTO.setLoginFlg(true);
		    	    	       }

		    	      }catch(Exception e){
		    	    	     e.printStackTrace();
		    	      }
		    	      return loginDTO;


		         public LoginDTO getloginDTO(){
		        	 return loginDTO;
		         }
	}


}

package com.fssa.ShareToRise.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.LocalDate;

import com.fssa.ShareToRise.model.FundingRaiser;

import day11.practice.DAOException;

public class ShareToRiseDao {
	
	
	public static boolean createTask(FundingRaiser fundingRaiser) throws DAOException {

		if (fundingRaiser == null) {
			throw new DAOException("Fundraiser object cannot be null");

		}
		
	
		String url = "jdbc:mysql://localhost:3306/sharetorise";
		String userName = "root";
		String password = "123456";
//		Connection con = null;

		try (Connection con = DriverManager.getConnection(url, userName, password)){
			String sql = "INSERT INTO fundraiser (personID, title, description, FundingGoal, FundEndingDate, NoOfDaysRequired) VALUES (?, ?, ?, ?, ?, ?)";

	        try {
	        	
	             PreparedStatement preparedStatement = con.prepareStatement(sql) ;

	             
		        preparedStatement.setInt(1, fundingRaiser.getId());
	            preparedStatement.setString(2, fundingRaiser.getTitle());
	            preparedStatement.setString(3, fundingRaiser.getDescription());
	            preparedStatement.setDouble(4, fundingRaiser.getFundingGoal());
	            preparedStatement.setObject(5, fundingRaiser.getFundEndingDate());
	            preparedStatement.setInt(6, fundingRaiser.getNoOfDaysRequired());

	            preparedStatement.executeUpdate();

	            System.out.println("FundingRaiser inserted successfully!");
	             

	        } 
	        
	        catch (SQLException e) {
	            System.err.println("Failed to insert FundingRaiser into the database.");
	            e.printStackTrace();
	        }
	        return true;  

		}
		catch (SQLException ex) {
			throw new DAOException("Connection is not created");
		}
		 	

	}
  
    public static void main(String[] args) {
        FundingRaiser fundraiser = new FundingRaiser(1, "Project XYZ", "A great project description",
                5000.0, LocalDate.of(2023, 12, 31), 30);
        
        try {
			ShareToRiseDao.createTask(fundraiser);
		} catch (DAOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        
    }
}

package com.example.demo.service;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Books;
import com.example.demo.repository.BooksRepositoryInterface;

@Service
public class BooksService {
  @Autowired
  BooksRepositoryInterface itr;
  @Autowired DataSource datasource;
  //Get all items
  public List<Books> getAll(){
	  return (List<Books>) itr.findAll();
  }
  //Get average price
  public Double getAvg() {
	  try(Connection conn1 = datasource.getConnection();) {
		System.out.println("Schema name is "+conn1.getSchema());
	} catch (SQLException e1) {
		e1.printStackTrace();
	}
	  
	  Double avgPrice = null;
	  try(Connection conn = datasource.getConnection();
		  Statement stmt = conn.createStatement();){
		String sql = "select avg(book_price) avg from books";
		ResultSet rst = stmt.executeQuery(sql);
		while(rst.next()) {
			avgPrice = rst.getDouble(1);
		}
	  } catch (SQLException e) {
		e.printStackTrace();
	  }
	  return avgPrice;
  }
  
}

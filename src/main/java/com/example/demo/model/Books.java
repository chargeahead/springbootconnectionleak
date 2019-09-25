package com.example.demo.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Books implements Serializable{
  /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
@Id
  @GeneratedValue(strategy=GenerationType.IDENTITY)
  private int bookId;
  private String bookName;
  private Double bookPrice;
  private int bookQty;
  public Books(){}
  public Books(int bookId, String bookName, Double bookPrice, int bookQty) {
	super();
	this.bookId = bookId;
	this.bookName = bookName;
	this.bookPrice = bookPrice;
	this.bookQty = bookQty;
  }
public int getBookId() {
	return bookId;
}
public void setBookId(int bookId) {
	this.bookId = bookId;
}
public String getBookName() {
	return bookName;
}
public void setBookName(String bookName) {
	this.bookName = bookName;
}
public Double getBookPrice() {
	return bookPrice;
}
public void setBookPrice(Double bookPrice) {
	this.bookPrice = bookPrice;
}
public int getBookQty() {
	return bookQty;
}
public void setBookQty(int bookQty) {
	this.bookQty = bookQty;
}
  
  
  
}

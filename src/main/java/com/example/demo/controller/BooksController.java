package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Books;
import com.example.demo.service.BooksService;

@RestController

@RequestMapping("/api")
public class BooksController {
	@Autowired
	BooksService its;
	
	//Get All items
	@GetMapping(value= {"/books"})
	public List<Books> getAll(){
		List<Books> books = its.getAll();
		System.out.println("Getall: books retrieved "+books.size());
		return books;
	}
	
	//Get All items
	@GetMapping(value= {"/getAvg"})
	public Double getAvg(){
		Double avg = its.getAvg();
		System.out.println("Getall: avg price "+avg);
		return avg;
	}

}

package com.controller;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;


@Service
public class BookService {
	
	 @Autowired
	    BookRepository repository;
	
	

		public void addBook(Book book) {
			repository.save(book);
			
		}
		
		
		
		
		
	    public List<Book> findAll(){
	    		//return books;
	    	List<Book> books=	new ArrayList<>();
	    		
	           repository.findAll()
	           .forEach(books::add);
	           return books;
	 
	    }
	    
	    
	    public Book findById(@PathVariable String bookid){	    	
	    		return repository.findById(bookid).orElse(null);
	    		
	    }

	
	    public void updateBook(String bookid, Book book) {
	    	repository.save(book);	
	    	}
	    
	    
	    public String deleteByBookId( String bookid){
	        
	          
	         repository.deleteById(bookid);
	         return "deleted";     
	      
	    }





		public Book findByBookName(String bookname) {
	
	           return repository.findByBookname(bookname);
			
		}


		public List<Book> findByAuthorName(String authorname) {
			List<Book> books=	new ArrayList<>();
    		
	           repository.findByAuthorname(authorname)
	           .forEach(books::add);
	           return books;
			
		}


		public List<Book> findByGenre(String genre) {
			List<Book> books=	new ArrayList<>();
    		
	           repository.findByGenre(genre)
	           .forEach(books::add);
	           return books;
		}
	
	


	


}
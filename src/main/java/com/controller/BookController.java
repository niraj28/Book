package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import org.springframework.web.bind.annotation.RestController;




 

@CrossOrigin(origins="*",maxAge=3600)
@RestController
public class BookController {
    @Autowired
    BookService bookservice;
      
    @RequestMapping(method=RequestMethod.POST, value="/book/save")
    public void addBook(@RequestBody Book book){
        bookservice.addBook(book);
        
    }
      
      
    @RequestMapping("/book/findall")
    public List<Book> findAll(){
     return bookservice.findAll();
    }
      
    @RequestMapping("/book/findby/{bookid}")
    public Book findById(@PathVariable String bookid){
       return bookservice.findById(bookid);
    }
    
    @Modifying(clearAutomatically = true)
    @RequestMapping(method=RequestMethod.PUT,value="/book/updateby/{bookid}")
	public void upateBook(@RequestBody Book book,@PathVariable String bookid) {
	
	bookservice.updateBook(bookid, book);
	}
      
    @RequestMapping("/book//deleteby/{bookid}")
    public void deleteByBookId(@PathVariable String bookid){
        
          
        bookservice.deleteByBookId(bookid);   
      
    }
    
    
    @RequestMapping("/book/findBookBy/{bookname}")
    public Book findByBookName(@PathVariable String bookname){
       return bookservice.findByBookName(bookname);
    }
    @RequestMapping("/book/findByAuthorName/{authorname}")
    public List<Book> findByAuthorName(@PathVariable String authorname){
       return bookservice.findByAuthorName(authorname);
    }
    @RequestMapping("/book/findBy/Genre/{genre}")
    public List<Book> findByGenre(@PathVariable String genre){
       return bookservice.findByGenre(genre);
    }
   
}

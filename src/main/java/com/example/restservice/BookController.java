package com.example.restservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController 
public class BookController {

	@GetMapping("/")
	public String help() {
		return 
			"<table>"+
			"<tr><td>/ </td><td>list all REST requests</td></tr>" + 
			"<tr><td><a href='/list-books'>/list-books</a></td><td>GET list all books</td></tr>" +
			"<tr><td><a href='/get-book/1'>/get-book/{id}</a></td><td>GET book with id</td></tr>" +
			"<tr><td><a href='/create-book'>/create-book + json</a></td><td>CREATE new book</td></tr>" +
			"<tr><td><a href='/update-book/1'>/update-book/{id} + json</a></td><td>PUT book with id</td></tr>" +
			"<tr><td><a href='/delete-book/1'>/delete-book/{id}</a></td><td>DELETE book with id</td></tr>" +
			"</table>";

	}
	@GetMapping("/list-books")
	public String getBooks() {
		return "get list of all books";
	}

	@GetMapping("/get-book/{id}")
	public String getBookById(@PathVariable String id) {
		return "get book with id:" + id;
	}

	@PostMapping(value = "/create-book", consumes = "application/json", produces = "application/json")
	public Book createBook(@RequestBody Book book) {
		return book;
	}

	@PutMapping(value = "/update-book/{id}", consumes = "application/json", produces = "application/json")
	public Book updateBookWithId(@PathVariable String id, @RequestBody Book book) {
		return book;
	}

	@DeleteMapping("/delete-book/{id}")
	public String deleteBookWithId(@PathVariable String id) {
		return "deleted book with id:" + id;
	}

}

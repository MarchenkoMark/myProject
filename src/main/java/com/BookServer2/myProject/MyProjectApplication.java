package com.BookServer2.myProject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MyProjectApplication implements CommandLineRunner {


	@Autowired
	private BookService bookService;


	public static void main(String[] args) {
		SpringApplication.run(MyProjectApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		demo1();
	}

	private void demo1() {
		for (Book book : bookService.findAll()) {
			System.out.println("id: " + book.getId());
		}
	}
}

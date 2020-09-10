package com.BookServer2.myProject;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BookController {

    private final BookServiceImpl repository;

    public BookController(BookServiceImpl repository) {
                this.repository = repository;
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/books")
    Iterable<Book> all() {
        return repository.findAll();
    }
    /*
    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping("/books")
    Book newBook(@RequestBody Book newBook) {
        return repository.save(newBook);
    }

     */
}

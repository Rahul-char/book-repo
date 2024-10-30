package com.TuesdayProject.books.Controller;

import com.TuesdayProject.books.Model.bookModel;
import com.TuesdayProject.books.Service.bookService;
import com.netflix.discovery.converters.Auto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/project")
public class bookController {

    @Autowired
    private bookService book;

    @PostMapping("/addbook")
    public ResponseEntity<bookModel> addBook(@RequestBody bookModel bookModel){
        return new ResponseEntity<>(book.addBook(bookModel), HttpStatus.CREATED);
    }

    @GetMapping("/getbookByName/{title}")
    public ResponseEntity<bookModel> getBookById(@PathVariable("title") String title){
        return new ResponseEntity<>(book.getBookById(title), HttpStatus.OK);
    }

    @GetMapping("/getAllUniversebooks/{bookUniverse}")
    public ResponseEntity<List<bookModel>> getAllUniverseBooks(@PathVariable("bookUniverse") String bookUniverse){
        return new ResponseEntity<>(book.getAllUniverseBooks(bookUniverse), HttpStatus.OK);
    }

    @GetMapping("/getbooksByauthor/{author}")
    public ResponseEntity<List<bookModel>> getbookModelbyAuthorName(@PathVariable("author") String author){
        return new ResponseEntity<>(book.getbooksbyauthor(author), HttpStatus.OK);
    }

//    @GetMapping("/getAllUniversebooks/{bookUniverse}")
//    public ResponseEntity<List<bookModel>> getAllUniverseBooks(@PathVariable("bookUniverse") String bookUniverse){
//        return new ResponseEntity<>(book.getAllUniverseBooks(bookUniverse), HttpStatus.OK);
//    }
//
//    @GetMapping("/getbooksByauthor/{author}")
//    public ResponseEntity<List<bookModel>> getbookModelbyAuthorName(@PathVariable("author") String author){
//        return new ResponseEntity<>(book.getbooksbyauthor(author), HttpStatus.OK);
//    }
}

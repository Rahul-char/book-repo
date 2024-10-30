package com.TuesdayProject.books.Service;

import com.TuesdayProject.books.Model.bookModel;
import com.TuesdayProject.books.Repository.bookDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class bookService {

    @Autowired
    private bookDto repo;

    public bookModel addBook(bookModel bookModel) {
        return repo.save(bookModel);
    }

    public bookModel getBookById(String title) {
        return repo.findByTitle(title).orElseThrow(() -> new RuntimeException("Book not found"));
    }

    public List<bookModel> getAllUniverseBooks(String bookUniverse) {
        List<bookModel> booklist = repo.findAll();
        return booklist.stream()
                .filter(book -> book.getBookUniverse().equals(bookUniverse))
                .collect(Collectors.toList());
    }

    public List<bookModel> getbooksbyauthor(String author) {
        List<bookModel> booklist = repo.findAll();
        return booklist.stream()
                .filter(book -> book.getAuthor().equals(author))
                .collect(Collectors.toList());
    }
}

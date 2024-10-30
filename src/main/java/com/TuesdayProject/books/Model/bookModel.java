package com.TuesdayProject.books.Model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class bookModel {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int bookId;
    private String title;
    private String author;
    private String bookUniverse;
    private String genre;
    private LocalDate publicationDate;
}

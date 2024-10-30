package com.TuesdayProject.books.Repository;

import com.TuesdayProject.books.Model.bookModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface bookDto extends JpaRepository<bookModel, Integer> {

    Optional<bookModel> findByTitle(String title);
}

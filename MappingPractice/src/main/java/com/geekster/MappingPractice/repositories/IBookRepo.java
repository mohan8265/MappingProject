package com.geekster.MappingPractice.repositories;

import com.geekster.MappingPractice.models.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IBookRepo extends JpaRepository<Book,String> {
}

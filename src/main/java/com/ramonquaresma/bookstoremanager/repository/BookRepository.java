package com.ramonquaresma.bookstoremanager.repository;

import com.ramonquaresma.bookstoremanager.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}

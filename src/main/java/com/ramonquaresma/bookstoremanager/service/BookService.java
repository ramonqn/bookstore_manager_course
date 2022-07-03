package com.ramonquaresma.bookstoremanager.service;

import com.ramonquaresma.bookstoremanager.dto.MessageResponseDTO;
import com.ramonquaresma.bookstoremanager.entity.Book;
import com.ramonquaresma.bookstoremanager.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class BookService {

    private BookRepository bookRepository;

    @Autowired
    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public MessageResponseDTO create(Book book) {
        Book savedBook = bookRepository.save(book);
        return MessageResponseDTO.builder()
                .message("Created book with ID " + savedBook.getId())
                .build();
    }
}

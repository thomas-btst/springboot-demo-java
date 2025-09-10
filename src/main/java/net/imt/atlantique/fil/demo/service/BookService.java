package net.imt.atlantique.fil.demo.service;

import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import net.imt.atlantique.fil.demo.domain.Book;
import net.imt.atlantique.fil.demo.mapper.BookMapper;
import net.imt.atlantique.fil.demo.repository.BookRepository;
import net.imt.atlantique.fil.demo.web.dto.book.BookDto;
import net.imt.atlantique.fil.demo.web.dto.book.CreateOrUpdateBookDto;

@Service
public class BookService {
    @Autowired
    private BookRepository bookRepository;

    @Autowired
    private BookMapper bookMapper;

    public void addBook(CreateOrUpdateBookDto bookDto) {
        bookRepository.save(bookMapper.toBook(bookDto));
    }

    public List<BookDto> listBooks() {
        return bookRepository
            .findAll()
            .stream()
            .map(bookMapper::toBookDto)
            .toList();
    } 

    public BookDto findBookById(String bookId) {
        Book book = bookRepository
            .findById(new ObjectId(bookId))
            .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
        return bookMapper.toBookDto(book);
    }

    public void updateBook(String bookId, CreateOrUpdateBookDto bookDto) {
        bookRepository.save(bookMapper.toBook(bookId, bookDto));
    }

    public void deleteBook(String bookId) {
        bookRepository.deleteById(new ObjectId(bookId));
    }
}

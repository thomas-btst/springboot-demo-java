package net.imt.atlantique.fil.demo.web.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.imt.atlantique.fil.demo.service.BookService;
import net.imt.atlantique.fil.demo.web.dto.book.BookDto;
import net.imt.atlantique.fil.demo.web.dto.book.CreateOrUpdateBookDto;

@RestController
@RequestMapping("/books")
public class BookController {
    @Autowired
    private BookService bookService;

    @PostMapping
    public void createBook(@RequestBody CreateOrUpdateBookDto bookDto) {
        bookService.addBook(bookDto);
    }

    @GetMapping
    public List<BookDto> listBooks() {
        return bookService.listBooks();
    }

    @GetMapping("/{bookId}")
    public BookDto getBook(@PathVariable String bookId) {
        return bookService.findBookById(bookId);
    }

    @PutMapping("/{bookId}")
    public void updateBook(@PathVariable String bookId, @RequestBody CreateOrUpdateBookDto bookDto) {
        bookService.updateBook(bookId, bookDto);
    }

    @DeleteMapping("/{bookId}")
    public void deleteBook(@PathVariable String bookId) {
        bookService.deleteBook(bookId);
    }
}

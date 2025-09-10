package net.imt.atlantique.fil.demo.mapper;

import org.bson.types.ObjectId;
import org.springframework.stereotype.Component;

import net.imt.atlantique.fil.demo.domain.Book;
import net.imt.atlantique.fil.demo.web.dto.book.BookDto;
import net.imt.atlantique.fil.demo.web.dto.book.CreateOrUpdateBookDto;

@Component
public class BookMapper {
    public Book toBook(ObjectId bookId, CreateOrUpdateBookDto bookDto) {
        return new Book(bookId, bookDto.name, bookDto.author);
    }

    public Book toBook(String bookId, CreateOrUpdateBookDto bookDto) {
        return toBook(new ObjectId(bookId), bookDto);
    }

    public Book toBook(CreateOrUpdateBookDto bookDto) {
        return toBook(new ObjectId(), bookDto);
    }

    public BookDto toBookDto(Book book) {
        return new BookDto(book.id.toHexString(), book.name, book.author);
    }
}

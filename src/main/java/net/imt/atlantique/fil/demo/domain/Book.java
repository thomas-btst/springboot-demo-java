package net.imt.atlantique.fil.demo.domain;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(Book.DOCUMENT_NAME)
public class Book {
    public static final String DOCUMENT_NAME = "books";

    @Id
    public ObjectId id;

    public String name;

    public String author;

    public Book(ObjectId id, String name, String author) {
        this.id = id;
        this.name = name;
        this.author = author;
    }
}

package net.imt.atlantique.fil.demo.web.dto.book;

public class CreateOrUpdateBookDto {
    
    public String name;

    public String author;

    public CreateOrUpdateBookDto(String name, String author) {
        this.name = name;
        this.author = author;
    }
}

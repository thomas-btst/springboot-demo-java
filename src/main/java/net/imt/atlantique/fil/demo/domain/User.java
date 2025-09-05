package net.imt.atlantique.fil.demo.domain;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(User.DOCUMENT_NAME)
public class User {
    public static final String DOCUMENT_NAME = "users";

    @Id
    public ObjectId id;

    public String name;

    @Indexed(unique = true) 
    public String email;

    public User(ObjectId id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }
}
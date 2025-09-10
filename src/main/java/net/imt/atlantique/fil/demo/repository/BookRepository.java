package net.imt.atlantique.fil.demo.repository;

import org.springframework.stereotype.Repository;

import net.imt.atlantique.fil.demo.domain.Book;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

@Repository
public interface BookRepository extends MongoRepository<Book, ObjectId> {}

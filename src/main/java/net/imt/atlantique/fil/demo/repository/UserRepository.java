package net.imt.atlantique.fil.demo.repository;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import net.imt.atlantique.fil.demo.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, ObjectId> {
    // public User findByEmail(String email); // TODO
}

package net.imt.atlantique.fil.demo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import net.imt.atlantique.fil.demo.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {
    // public User findByEmail(String email); // TODO
}

package com.spring.chat.user;

import com.spring.chat.enums.Status;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepo extends MongoRepository<User, String> {

    List<User> findAllByStatus(Status status);

}

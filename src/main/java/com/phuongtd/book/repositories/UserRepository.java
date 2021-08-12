package com.phuongtd.book.repositories;

import com.phuongtd.book.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Integer> {
    User findByEmail(String email);

    List<User> findAllByOrderById();
}

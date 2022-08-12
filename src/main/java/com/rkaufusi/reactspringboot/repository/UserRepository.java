package com.rkaufusi.reactspringboot.repository;

import com.rkaufusi.reactspringboot.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}

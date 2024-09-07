package com.fullstack_Backend.store.repository;

import com.fullstack_Backend.store.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}

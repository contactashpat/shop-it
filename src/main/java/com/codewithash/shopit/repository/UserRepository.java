package com.codewithash.shopit.repository;

import com.codewithash.shopit.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {}

package com.csaba79coder.databaseanett.repository;

import com.csaba79coder.databaseanett.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}

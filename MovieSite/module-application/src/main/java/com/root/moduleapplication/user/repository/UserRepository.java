package com.root.moduleapplication.user.repository;

import com.root.moduledomain.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}

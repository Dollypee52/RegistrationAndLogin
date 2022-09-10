package com.semicolon.KIoskRegAndLogin.repository;

import com.semicolon.KIoskRegAndLogin.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository  extends JpaRepository<User,Long> {
    User findByEmail(String email);
}

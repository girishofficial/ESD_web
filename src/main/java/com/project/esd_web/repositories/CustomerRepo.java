package com.project.esd_web.repositories;

import com.project.esd_web.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CustomerRepo extends JpaRepository<User, String> {
    public Optional<User> findByEmail(String email);
}

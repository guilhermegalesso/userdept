package com.guilhermegalesso.userdept.repositories;

import com.guilhermegalesso.userdept.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}

package org.springframework.samples.petclinic.repository;

import org.springframework.samples.petclinic.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}

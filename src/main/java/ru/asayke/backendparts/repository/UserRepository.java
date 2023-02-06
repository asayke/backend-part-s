package ru.asayke.backendparts.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.asayke.backendparts.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
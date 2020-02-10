package ru.Eltex.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.Eltex.domain.User;

public interface UserRepo extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
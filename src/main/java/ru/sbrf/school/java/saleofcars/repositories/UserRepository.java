package ru.sbrf.school.java.saleofcars.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.sbrf.school.java.saleofcars.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}

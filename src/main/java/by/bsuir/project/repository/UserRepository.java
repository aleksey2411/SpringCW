package by.bsuir.project.repository;

import by.bsuir.project.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository
public interface UserRepository extends JpaRepository<User, String> {
    List<User> findAll();
    Optional<User> findUserById(UUID id);
    Optional<User> findUserByEmail(String email);
}

package sit.int210.docker_backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import sit.int210.docker_backend.entities.User;

public interface UserRepository extends JpaRepository<User, Integer> {
}
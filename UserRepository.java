package springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import springboot.model.user;

public interface UserRepository extends JpaRepository<user, Long> {

    user findByPhone(String phone);

}
package springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import springboot.model.payment;

public interface PaymentRepository extends JpaRepository<payment, Long> {

}

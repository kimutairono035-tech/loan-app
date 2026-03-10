package springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import springboot.model.loan;

public interface loanRepository extends JpaRepository<loan, Long> {

}

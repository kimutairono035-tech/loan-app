package springboot.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class payment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Double amount;

    private String mpesaCode;

    private String status;

    @ManyToOne
    private loan loan;

}
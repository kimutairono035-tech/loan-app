package springboot.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class loan {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Double amount;

    private Double fee;

    private String status;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private user user;

}

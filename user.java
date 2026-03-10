package springboot.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class user {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String fullName;

    @Column(unique = true)
    private String phone;

    private String idNumber;

}
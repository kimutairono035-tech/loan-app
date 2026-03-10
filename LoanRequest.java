package springboot.dto;

import lombok.Data;

@Data
public class LoanRequest {

    private String fullName;
    private String phone;
    private String idNumber;
    private String loanType;

}

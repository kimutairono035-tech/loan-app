package springboot.controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import springboot.dto.*;
import springboot.service.loanService;

import java.util.List;

@RestController
@RequestMapping("/api/loans")
@CrossOrigin
public class loanController {

    @Autowired
    loanService loanService;

    @PostMapping("/apply")
    public List<LoanOption> applyLoan(@RequestBody LoanRequest request) {

        return loanService.checkEligibility(request);

    }

}

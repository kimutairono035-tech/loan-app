package springboot.service;

import org.springframework.stereotype.Service;
import springboot.dto.*;
import java.util.*;

@Service
public class loanService {

    public List<LoanOption> checkEligibility(LoanRequest request) {

        List<LoanOption> options = new ArrayList<>();

        options.add(new LoanOption(5500, 100));
        options.add(new LoanOption(6800, 130));
        options.add(new LoanOption(7800, 170));
        options.add(new LoanOption(9800, 190));
        options.add(new LoanOption(11200, 230));
        options.add(new LoanOption(16800, 250));
        options.add(new LoanOption(21200, 270));
        options.add(new LoanOption(25600, 400));
        options.add(new LoanOption(30000, 470));

        return options;

    }

}
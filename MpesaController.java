package springboot.controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import springboot.service.MpesaService;

@RestController
@RequestMapping("/api/mpesa")
public class MpesaController {

    @Autowired
    MpesaService mpesaService;

    @PostMapping("/pay")
    public String pay(@RequestParam String phone,
            @RequestParam double amount) {

        return mpesaService.stkPush(phone, amount);

    }

}

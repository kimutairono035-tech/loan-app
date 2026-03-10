package springboot.service;

import org.springframework.stereotype.Service;

@Service
public class MpesaService {

public String stkPush(String phone, double amount){

// Real Daraja integration logic here

System.out.println("Sending STK Push to "+phone);

return "STK Push Sent";

}

}
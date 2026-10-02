package com.example.date1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @GetMapping("/")
    public String getDate() {
        LocalDate today = LocalDate.now();
        LocalDate futureDate = today.plusDays(100);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        return futureDate.format(formatter);
    }
}
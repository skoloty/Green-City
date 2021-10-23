package com.example.demo.controller;


import com.example.demo.domain.Company;
import com.example.demo.service.CompanyService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController("/company")
public class CompanyController {

    private CompanyService companyService;

    @GetMapping("/{id}")
    public Company fingById(@RequestParam(value = "id", defaultValue = "0") Long id) {
        return companyService.findById(id);
    }
}

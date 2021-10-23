package com.example.demo.service;


import com.example.demo.dao.ICompanyDao;
import com.example.demo.domain.Company;
import org.springframework.stereotype.Service;


@Service
public class CompanyService {

    private ICompanyDao companyDao;

    public Company findById(Long id) {
        return companyDao.findById(id).orElseGet(null);
    }
}

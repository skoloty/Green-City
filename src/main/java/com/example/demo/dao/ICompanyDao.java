package com.example.demo.dao;

import com.example.demo.domain.Company;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICompanyDao extends PagingAndSortingRepository<Company, Long> {
}

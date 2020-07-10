package com.stockManager.service;

import com.stockManager.entity.Company;

import java.util.List;
//import java.util.Optional;

public interface ICompany {
    List<Company> GetAllCompany();
    Company FindCompany(String compId);
    Company Create(Company objCompany);
    void update(String compId, Company objCompany);
    void Delete(String compId);
}

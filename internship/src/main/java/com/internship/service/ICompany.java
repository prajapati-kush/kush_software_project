package com.internship.service;

import java.util.List;
import com.internship.entity.Company;
public interface ICompany {
    List <Company> GetAllCompanies();
    Company FindCompany(Integer compId);
    Company Create (Company objComp);
    Company Update (Integer compId, Company objComp);
    void Delete (Integer compId);
}

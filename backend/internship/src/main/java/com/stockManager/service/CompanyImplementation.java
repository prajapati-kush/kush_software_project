package com.stockManager.service;

import com.stockManager.entity.Company;
import com.stockManager.exception.notFoundException;
import com.stockManager.repository.ICompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;
//import java.util.Optional;

@Service
public class CompanyImplementation implements ICompany{

    @Autowired
    private ICompanyRepository compRepo;
    //private Company Optional;

    @Override
    @Transactional(readOnly = true)
    public List<Company> GetAllCompany() {
        return (List<Company>) compRepo.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Company FindCompany(String compId) {
      Optional  <Company> v1 = compRepo.findById(compId);
        if (!v1.isPresent()) {
            throw new notFoundException("Company with id :" + compId + " not found");
        }
            return v1.get();
    }

    @Override
    @Transactional
    public Company Create(Company objCompany) {
        return compRepo.save ( objCompany );
    }

    @Override
    @Transactional
    public void update(String compId, Company objCompany) {
        Optional<Company> v1 = compRepo.findById(compId);
        if(!v1.isPresent ())
        {
            throw new notFoundException ("Company with id :" + compId +" not found");
        }
        compRepo.save( objCompany);
    }

    @Override
    @Transactional
    public void Delete(String compId) {
        Optional<Company> v1;
        v1 = compRepo.findById(compId);
        if(!v1.isPresent ())
            throw new notFoundException("Company with id :" + compId + " not found");
        compRepo.delete ( v1.get () );
    }
}

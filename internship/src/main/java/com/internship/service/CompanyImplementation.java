package com.internship.service;
import com.internship.entity.Company;
import com.internship.exception.*;
import com.internship.repositary.ICompanyRepositary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;
@Service
public class CompanyImplementation implements ICompany{

  // @Autowired(required=true)
    ICompanyRepositary compRepo;

    public CompanyImplementation(ICompanyRepositary compRepo) {
        this.compRepo = compRepo;
    }

    @Override
    @Transactional (readOnly = true)
    public List<Company> GetAllCompanies() {
        return (List<Company>) compRepo.findAll();
    }

    @Override
    @Transactional (readOnly = true)
    public Company FindCompany(Integer compId) {
  //      Optional<Company> c1 = compRepo.findById(compId);
        Optional<Company> c1 = compRepo.findById(compId);
        if(!c1.isPresent ())
        {
            throw new CompanyNotFoundException ("Company with id :" + compId +" not found");
        }
        return c1.get();
    }

    @Override
    @Transactional
    public Company Create(Company objComp) {
        Company v1 = compRepo.save ( objComp );
        if(v1 == null)
        {
            throw new BadRequestException ("Company not created successfully:" + objComp.getCompanyName () +" not found");
        }
        return v1;
    }

    @Override
    @Transactional
    public Company Update(Integer compId, Company objComp) {
        Optional<Company> v1 = compRepo.findById(compId);
        if(!v1.isPresent ())
        {
            throw new CompanyNotFoundException("Company with id :" + compId +" not found");
        }
        return   compRepo.save( objComp);

    }

    @Override
    @Transactional
    public void Delete(Integer compId) {
        Optional<Company> v1 = compRepo.findById(compId);
        if(!v1.isPresent ())
        {
            throw new CompanyNotFoundException ("Company with id :" + compId +" not found");
        }
        compRepo.delete ( v1.get () );
    }
}

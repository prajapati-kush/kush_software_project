package com.stockManager.repository;

import com.stockManager.entity.Company;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface ICompanyRepository extends CrudRepository<Company, String> {



}

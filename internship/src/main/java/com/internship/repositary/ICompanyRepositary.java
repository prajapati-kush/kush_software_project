package com.internship.repositary;
import com.internship.entity.Company;
import org.springframework.data.repository.CrudRepository;
public interface ICompanyRepositary extends CrudRepository<Company, Integer> {

}

package com.internship.repositary;
import com.internship.entity.Company;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface ICompanyRepositary extends CrudRepository<Company, Integer> {

}

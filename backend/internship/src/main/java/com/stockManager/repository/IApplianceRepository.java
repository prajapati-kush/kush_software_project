package com.stockManager.repository;

import com.stockManager.entity.Appliance;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IApplianceRepository extends CrudRepository<Appliance, String> {
}

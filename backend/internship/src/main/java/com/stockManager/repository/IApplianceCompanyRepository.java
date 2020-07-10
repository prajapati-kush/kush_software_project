package com.stockManager.repository;

import com.stockManager.entity.ApplianceCompany;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
public interface IApplianceCompanyRepository extends JpaRepository<ApplianceCompany, String> {
    @Modifying
    @Transactional
    @Query(value = "insert into appliance_company value (:appliance_company_id, :stock, :appliance_id, :company_id);", nativeQuery = true)
    void insertStock (@Param("appliance_company_id") String appliance_company_id,@Param("stock") Integer stock,@Param("appliance_id") String appliance_id,@Param("company_id") String company_id);
    @Query(value= "select c.company_name as 'Company name', a.appliance_name as 'Appliance name', ar.stock as'Stock' from Company as c,Appliance as a, appliance_company as ar where ((a.appliance_id =ar.appliance_id)and(c.company_id=ar.company_id))",nativeQuery = true)
    List<Object[]> displayAll();
    @Query(value = "update appliance_company set stock =:stock where (appliance_id=:application_id and company_id=:company_id);",nativeQuery = true)
    void updateStock(@Param("appliance_id") String appliance_id,@Param("company_id") String company_id,@Param("stock") Integer stock);
    @Query(value= "delete from appliance_company where appliance_company_id=:appliance_company_id",nativeQuery = true)
    void deleteStock (@Param ("appliance_company_id") String appliance_company_id);

}

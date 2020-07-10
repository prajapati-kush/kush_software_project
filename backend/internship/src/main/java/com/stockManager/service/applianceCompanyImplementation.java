package com.stockManager.service;

import com.stockManager.repository.IApplianceCompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import java.util.List;

@Service
public class applianceCompanyImplementation {
    IApplianceCompanyRepository applianceCompanyRepository;

    //@Autowired
    //EntityManager entityManager;

    public applianceCompanyImplementation (IApplianceCompanyRepository applianceCompanyRepository)
    {
        this.applianceCompanyRepository=applianceCompanyRepository;
    }
    public void createStock(String appliance_company_id, Integer stock, String appliance_id, String company_id)
    {
        applianceCompanyRepository.insertStock(appliance_company_id, stock, appliance_id, company_id);
    }
    public List<Object[]> displayStock ()
    {
        return applianceCompanyRepository.displayAll();
    }
    public void updateStockEntry (String appliance_id, String company_id, Integer stock)
    {
        applianceCompanyRepository.updateStock(appliance_id,company_id,stock);

    }
    public void deleteStockEntry(String appliance_company_id)
    {
        applianceCompanyRepository.deleteStock(appliance_company_id);
    }

}

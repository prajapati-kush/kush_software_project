package com.stockManager.controller;

import com.stockManager.service.applianceCompanyImplementation;
import org.springframework.data.repository.query.Param;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
@RequestMapping(value = "stock")
public class applianceCompanyContoller {
    applianceCompanyImplementation ApplianceCompanyImplementation;

    public applianceCompanyContoller (applianceCompanyImplementation ApplianceCompanyImplementation)
    {
        this.ApplianceCompanyImplementation =ApplianceCompanyImplementation;

    }
    @RequestMapping(method = RequestMethod.GET,path="create", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public void createStock (@Param("appliance_company_id") String appliance_company_id, @Param("stock") Integer stock, @Param("appliance_id") String appliance_id, @Param("company_id") String company_id)
    {
        ApplianceCompanyImplementation.createStock(appliance_company_id, stock, appliance_id, company_id);
    }
    @RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public List<Object[]> displayStock ()
    {
        return ApplianceCompanyImplementation.displayStock();
    }
    @RequestMapping(method = RequestMethod.GET, path="update", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public void updateStock(@Param("appliance_id") String appliance_id,@Param("company_id") String company_id,@Param("stock") Integer stock)
    {
        ApplianceCompanyImplementation.updateStockEntry(appliance_id, company_id, stock);
    }
    @RequestMapping(method = RequestMethod.GET, path="delete", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public void deleteStock(@Param ("appliance_company_id") String appliance_company_id)
    {
        ApplianceCompanyImplementation.deleteStockEntry(appliance_company_id);
    }
}

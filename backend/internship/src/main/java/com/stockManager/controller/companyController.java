package com.stockManager.controller;

import com.stockManager.entity.Company;
import com.stockManager.service.CompanyImplementation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;



@RestController
@RequestMapping(value = "companies")
public class companyController {
    @Autowired
    private CompanyImplementation companyService;

    @RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public List<Company> GetAllCompany(){
        return companyService.GetAllCompany ();
    }

    @RequestMapping(method = RequestMethod.GET, value = "{companyId}",produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public Company FindCompany(@PathVariable("companyId") String compId)
    {

        return (companyService.FindCompany ( compId ));
    }

    @RequestMapping(method = RequestMethod.POST, consumes =MediaType.APPLICATION_JSON_UTF8_VALUE ,produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public Company Create(@RequestBody Company objCompany)
    {
        return companyService.Create ( objCompany );
    }

    @RequestMapping(method = RequestMethod.PUT, value = "{companyId}", consumes = MediaType.APPLICATION_JSON_UTF8_VALUE ,produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public void update(@PathVariable("companyId") String compId, @RequestBody Company objCompany)
    {
         companyService.update ( compId,objCompany );
    }

    @RequestMapping(method = RequestMethod.DELETE,value = "{companyId}")
    public void Delete(@PathVariable("companyId") String compId)
    {
        companyService.Delete ( compId );

    }
}

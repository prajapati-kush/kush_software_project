package com.internship.contoller;

import com.internship.entity.Company;
import com.internship.service.CompanyImplementation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "company")
public class CompanyController {
    @Autowired
    private CompanyImplementation compService;
    @RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public List<Company> GetAllCompanies(){
        return compService.GetAllCompanies ();
    }

    @RequestMapping(method = RequestMethod.GET, value = "{companyId}",produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public Company FindCompany(@PathVariable("companyId") Integer compId)
    {
        return compService.FindCompany ( compId );
    }

    @RequestMapping(method = RequestMethod.POST, consumes =MediaType.APPLICATION_JSON_UTF8_VALUE ,produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public Company Create(@RequestBody Company objComp)
    {
        return compService.Create ( objComp );
    }

    @RequestMapping(method = RequestMethod.PUT, value = "{compId}", consumes =MediaType.APPLICATION_JSON_UTF8_VALUE ,produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public Company update(@PathVariable("companyId") Integer compId,@RequestBody Company objCompany)
    {
        return compService.Update ( compId,objCompany );
    }

    @RequestMapping(method = RequestMethod.DELETE,value = "{companyId}")
    public void Delete(@PathVariable("companyId") Integer compId)
    {
        compService.Delete ( compId );

    }



}


package com.stockManager.controller;

import com.stockManager.entity.Appliance;
import com.stockManager.service.ApplianceImplementation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "appliances")
public class applianceContoller {
    @Autowired
    private ApplianceImplementation applianceService;

    @RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public List<Appliance> GetAllAppliance(){
        return applianceService.GetAllAppliance ();
    }

    @RequestMapping(method = RequestMethod.GET, value = "{applianceId}",produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public Appliance FindAppliance(@PathVariable("applianceId") String compId)
    {

        return (applianceService.FindAppliance ( compId ));
    }

    @RequestMapping(method = RequestMethod.POST, consumes =MediaType.APPLICATION_JSON_UTF8_VALUE ,produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public Appliance Create(@RequestBody Appliance objCompany)
    {
        return applianceService.Create ( objCompany );
    }

    @RequestMapping(method = RequestMethod.PUT, value = "{applianceId}", consumes = MediaType.APPLICATION_JSON_UTF8_VALUE ,produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public void update(@PathVariable("applianceId") String compId, @RequestBody Appliance objCompany)
    {
        applianceService.update ( compId,objCompany );
    }

    @RequestMapping(method = RequestMethod.DELETE,value = "{applianceId}")
    public void Delete(@PathVariable("applianceId") String compId)
    {
        applianceService.Delete ( compId );

    }
}

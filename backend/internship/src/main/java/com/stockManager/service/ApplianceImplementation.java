package com.stockManager.service;


import com.stockManager.entity.Appliance;
import com.stockManager.exception.notFoundException;
import com.stockManager.repository.IApplianceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;
@Service
public class ApplianceImplementation implements IAppliance {
    @Autowired
    private IApplianceRepository appRepo;
    @Override
    @Transactional(readOnly= true)
    public List<Appliance> GetAllAppliance() {
        return (List<Appliance>) appRepo.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Appliance FindAppliance(String appId) {
        Optional<Appliance> v1 = appRepo.findById(appId);
        if (!v1.isPresent()) {
            throw new notFoundException("Appliance with id :" + appId + " not found");
        }
        return v1.get();
    }

    @Override
    @Transactional
    public Appliance Create(Appliance objApp) {
        return appRepo.save( objApp);
    }

    @Override
    @Transactional
    public void update(String appId, Appliance objApp) {
        Optional<Appliance> v1 = appRepo.findById(appId);
        if(!v1.isPresent ())
        {
            throw new notFoundException ("Appliance with id :" + appId +" not found");
        }
        appRepo.save( objApp);
    }

    @Override
    public void Delete(String appId) {
        Optional<Appliance> v1;
        v1 = appRepo.findById(appId);
        if(!v1.isPresent ())
            throw new notFoundException("Appliance with id :" + appId + " not found");
        appRepo.delete ( v1.get () );
    }
}

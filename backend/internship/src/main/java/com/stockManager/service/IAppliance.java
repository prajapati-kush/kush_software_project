package com.stockManager.service;

import com.stockManager.entity.Appliance;

import java.util.List;

public interface IAppliance {
    List<Appliance> GetAllAppliance();
    Appliance FindAppliance(String appId);
    Appliance Create(Appliance objApp);
    void update(String appId, Appliance objApp);
    void Delete(String appId);
}

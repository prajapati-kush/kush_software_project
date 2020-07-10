package com.stockManager.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "appliance")
public class Appliance {
    @Id
    @Column(columnDefinition = "varchar(36)")
    private String applianceId;
    @Column(name ="appliance_name")
    private String applianceName;
    @Column(name = "appliance_type")
    private String applianceType;

    public Appliance() {
    }

    @OneToMany

    private List<ApplianceCompany> applianceCompanyList;

    public List<ApplianceCompany> getApplianceCompanyList() {
        return applianceCompanyList;
    }

    public void setApplianceCompanyList(List<ApplianceCompany> applianceCompanyList) {
        this.applianceCompanyList = applianceCompanyList;
    }

    public String getApplianceId() {
        return applianceId;
    }

    public void setApplianceId(String applianceId) {
        this.applianceId = applianceId;
    }

    public String getApplianceName() {
        return applianceName;
    }

    public void setApplianceName(String applianceName) {
        this.applianceName = applianceName;
    }

    public String getApplianceType() {
        return applianceType;
    }

    public void setApplianceType(String applianceType) {
        this.applianceType = applianceType;
    }

    @Override
    public String toString() {
        return "Appliance{" +
                "applianceId='" + applianceId + '\'' +
                ", applianceName='" + applianceName + '\'' +
                ", applianceType='" + applianceType + '\'' +
                '}';
    }
}

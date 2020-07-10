package com.stockManager.entity;

import javax.persistence.*;

@Entity
@Table(name="appliance_company")
public class ApplianceCompany {
    @Id
    @Column(columnDefinition = "varchar(36)")
    private String applainceCompanyId;
    @Column(name="stock")
    private Integer stock;
    @JoinColumn(name="company_id")
    String companyId;
    @JoinColumn(name = "appliance_id")
    String applianceId;

    public String getApplainceCompanyId() {
        return applainceCompanyId;
    }

    public void setApplainceCompanyId(String applainceCompanyId) {
        this.applainceCompanyId = applainceCompanyId;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public String getCompanyId() {
        return companyId;
    }

    public void setCompanyId(String companyId) {
        this.companyId = companyId;
    }

    public String getApplianceId() {
        return applianceId;
    }

    public void setApplianceId(String applianceId) {
        this.applianceId = applianceId;
    }
}

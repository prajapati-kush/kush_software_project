package com.stockManager.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name ="Company")
public class Company {
    @Id
    @Column(columnDefinition = "varchar(36)")
    private String companyId;
    @Column(name = "company_name")
    private String companyName;
    @Column(name="company_registration_number")
    private Integer companyRegistrationNumber;
    @Column(name="no_of_appliances")
    private Integer noOfAppliances;
    @OneToMany
    private List<ApplianceCompany> applianceCompanies;

    public List<ApplianceCompany> getApplianceCompanies() {
        return applianceCompanies;
    }

    public void setApplianceCompanies(List<ApplianceCompany> applianceCompanies) {
        this.applianceCompanies = applianceCompanies;
    }

    public String getCompanyId() {
        return companyId;
    }

    public void setCompanyId(String companyId) {
        this.companyId = companyId;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public Integer getCompanyRegistrationNumber() {
        return companyRegistrationNumber;
    }

    public void setCompanyRegistrationNumber(Integer companyRegistrationNumber) {
        this.companyRegistrationNumber = companyRegistrationNumber;
    }

    public Integer getNoOfAppliances() {
        return noOfAppliances;
    }

    public void setNoOfAppliances(Integer noOfAppliances) {
        this.noOfAppliances = noOfAppliances;
    }

    @Override
    public String toString() {
        return "Company{" +
                "companyId='" + companyId + '\'' +
                ", companyName='" + companyName + '\'' +
                ", companyRegistrationNumber=" + companyRegistrationNumber +
                ", noOfAppliances=" + noOfAppliances +
                '}';
    }
}

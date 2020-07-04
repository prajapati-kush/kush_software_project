package com.internship.entity;
import javax.persistence.Id;

import javax.persistence.Column;
import javax.persistence.Entity;
//import java.util.Date;
//import java.util.UUID;
@Entity
public class Company {
    @Id
    @Column(columnDefinition = "int")
    private Integer companyId;
    private String companyName;
    private Integer noOfAppliances;

    public Integer getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
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
                "companyId=" + companyId +
                ", companyName='" + companyName + '\'' +
                ", noOfAppliances=" + noOfAppliances +
                '}';
    }
}

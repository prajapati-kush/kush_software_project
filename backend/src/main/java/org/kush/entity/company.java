package org.kush.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.UUID;

@Entity
public class company {
    @Id
    @Column
    private int company_id;
    private String company_name;
    private int no_of_appliances;

    public int getCompany_id () {
        return company_id;
    }

    public String getCompany_name () {
        return company_name;
    }

    public int getNo_of_appliances() {
        return no_of_appliances;
    }

    public void setCompany_id(int company_id) {
        this.company_id = company_id;
    }

    public void setCompany_name(String company_name) {
        this.company_name = company_name;
    }

    public void setNo_of_appliances(int no_of_appliances) {
        this.no_of_appliances = no_of_appliances;
    }

    @Override
    public String toString() {
        return "company{" +
                "company_id=" + company_id +
                ", company_name='" + company_name + '\'' +
                ", no_of_appliances=" + no_of_appliances +
                '}';
    }
}


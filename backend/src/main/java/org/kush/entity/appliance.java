package org.kush.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.UUID;

@Entity
public class appliance {

    @Id
    @Column
    private int appliance_id;
    private String appliance_name;
    private String appliance_type;

    public int getAppliance_id() {
        return appliance_id;
    }

    public String getAppliance_name() {
        return appliance_name;
    }

    public String getAppliance_type() {
        return appliance_type;
    }

    public void setAppliance_id(int appliance_id) {
        this.appliance_id = appliance_id;
    }

    public void setAppliance_name(String appliance_name) {
        this.appliance_name = appliance_name;
    }

    public void setAppliance_type(String appliance_type) {
        this.appliance_type = appliance_type;
    }

    @Override
    public String toString() {
        return "appliance{" +
                "appliance_id=" + appliance_id +
                ", appliance_name='" + appliance_name + '\'' +
                ", appliance_type='" + appliance_type + '\'' +
                '}';
    }
}

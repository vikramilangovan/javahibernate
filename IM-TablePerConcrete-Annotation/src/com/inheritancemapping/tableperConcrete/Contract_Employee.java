package com.inheritancemapping.tableperConcrete;

import javax.persistence.*;  
@Entity  
@Table(name="tpc_contemp_annotation")  
@AttributeOverrides({  
    @AttributeOverride(name="id", column=@Column(name="id")),  
    @AttributeOverride(name="name", column=@Column(name="name"))  
})  
public class Contract_Employee extends Employee{  
      
    @Column(name="payperhour")  
    private float payperhour;  
      
    @Column(name="contractduration")  
    private String contractduration;  
  
    public float getpayperhour() {  
        return payperhour;  
    }  
    public void setpayperhour(float payPerHour) {  
        payperhour = payPerHour;  
    }  
    public String getcontractduration() {  
        return contractduration;  
    }  
    public void setcontractduration(String contractDuration) {  
        contractduration = contractDuration;  
    }  
}  
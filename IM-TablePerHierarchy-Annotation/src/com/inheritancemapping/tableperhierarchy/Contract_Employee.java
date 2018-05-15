package com.inheritancemapping.tableperhierarchy;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity  
@DiscriminatorValue("contractemployee")
public class Contract_Employee extends Employee{
	@Column(name="payperhour")   
    private float payperhour;  
	@Column(name="contractduration")
    private String contractduration;
	public float getPayperhour() {
		return payperhour;
	}
	public void setPayperhour(float payperhour) {
		this.payperhour = payperhour;
	}
	public String getcontractduration() {
		return contractduration;
	}
	public void setcontractduration(String contractduration) {
		this.contractduration = contractduration;
	}  
}

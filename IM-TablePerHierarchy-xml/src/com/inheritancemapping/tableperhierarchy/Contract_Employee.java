package com.inheritancemapping.tableperhierarchy;

public class Contract_Employee extends Employee{  
    private float payperhour;  
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

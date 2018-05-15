package com.inheritancemapping.tableperConcrete;

public class Contract_Employee extends Employee{  
    private float payperhour;  
    private String contractduration;
	public float getPayperhour() {
		return payperhour;
	}
	public void setPayperhour(float payperhour) {
		this.payperhour = payperhour;
	}
	public String getContractduration() {
		return contractduration;
	}
	public void setContractduration(String contractduration) {
		this.contractduration = contractduration;
	}  
  
  
}  

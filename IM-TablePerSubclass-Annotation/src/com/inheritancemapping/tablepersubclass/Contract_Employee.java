package com.inheritancemapping.tablepersubclass;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity  
@Table(name="tps_contemp_annotation")  
@PrimaryKeyJoinColumn(name="ID")  
public class Contract_Employee extends Employee{  
      
    public float getpayperhour() {
		return payperhour;
	}

	public void setpayperhour(float payperhour) {
		this.payperhour = payperhour;
	}

	public String getcontractduration() {
		return contractduration;
	}

	public void setcontractduration(String contractduration) {
		this.contractduration = contractduration;
	}

	@Column(name="payperhour")  
    private float payperhour;  
      
    @Column(name="contractduration")  
    private String contractduration;  
  
    //setters and getters  
}

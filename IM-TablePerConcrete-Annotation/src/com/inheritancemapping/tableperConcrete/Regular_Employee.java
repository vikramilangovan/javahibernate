package com.inheritancemapping.tableperConcrete;

import javax.persistence.*;

@Entity  
@Table(name="tpc_regemp_annotation")  
@AttributeOverrides({  
    @AttributeOverride(name="id", column=@Column(name="id")),  
    @AttributeOverride(name="name", column=@Column(name="name"))  
})  
public class Regular_Employee extends Employee{
      
public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	public int getBonus() {
		return bonus;
	}

	public void setBonus(int bonus) {
		this.bonus = bonus;
	}

@Column(name="salary")
private float salary;
  
@Column(name="bonus")
private int bonus;  
  

}  

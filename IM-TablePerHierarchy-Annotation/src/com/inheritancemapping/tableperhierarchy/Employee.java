package com.inheritancemapping.tableperhierarchy;
import javax.persistence.*;

import org.hibernate.annotations.GenericGenerator;  

@Entity
 
@Table(name = "tph_emp_annotation")  
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)  
@DiscriminatorColumn(name="type",discriminatorType=DiscriminatorType.STRING)  
@DiscriminatorValue(value="employee")

public class Employee {  
@Id 
@GenericGenerator(name="idgenerator" , strategy="increment")
@GeneratedValue(generator="idgenerator")

@Column(name = "id")
private int id;

@Column(name = "name")
private String name;

public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}  
  
}  


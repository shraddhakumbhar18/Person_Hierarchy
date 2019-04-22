package com.capgemini.PersonHierarchy.entity;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table(name="Person")
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="type" , discriminatorType=DiscriminatorType.STRING)
@DiscriminatorValue(value="person")

public class Person 
{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)  
	
	@Column(name="id")
	private  int personId;
	
	@Column(name="name")
	private String personName;
	
	public Person() 
	{
		super();
	}
	public Person(int personId, String personName) 
	{
		super();
		this.personId = personId;
		this.personName = personName;
	}
	public int getPersonId() 
	{
		return personId;
	}
	public void setPersonId(int personId) 
	{
		this.personId = personId;
	}
	public String getPersonName() 
	{
		return personName;
	}
	public void setPersonName(String personName) 
	{
		this.personName = personName;
	}
	@Override
	public String toString() 
	{
		return "Person [personId=" + personId + ", personName=" + personName + "]";
	}	
	
}

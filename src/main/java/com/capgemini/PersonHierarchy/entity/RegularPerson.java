package com.capgemini.PersonHierarchy.entity;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("RegularPerson")
public class RegularPerson extends Person 
{
	@Column(name="salary")
	private float salary;
	
	@Column(name="bonus")
	private int bonus;

	public RegularPerson() 
	{
		super();
	}

	public RegularPerson(int personId, String personName , float salary , int bonus) 
	{
		super(personId, personName);
		this.salary=salary;
		this.bonus=bonus;
	}

	public float getSalary() 
	{
		return salary;
	}

	public void setSalary(float salary) 
	{
		this.salary = salary;
	}

	public int getBonus() 
	{
		return bonus;
	}

	public void setBonus(int bonus) 
	{
		this.bonus = bonus;
	}

	@Override
	public String toString() {
		return "RegularPerson [salary=" + salary + ", bonus=" + bonus + "]";
	}
	
	
}

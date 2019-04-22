package com.capgemini.PersonHierarchy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.PersonHierarchy.entity.ContractPerson;
import com.capgemini.PersonHierarchy.entity.Person;
import com.capgemini.PersonHierarchy.entity.RegularPerson;
import com.capgemini.PersonHierarchy.service.PersonService;

@RestController
public class PersonController 
{
	@Autowired
	private PersonService service;
	
	@RequestMapping("/")
	public Person addPerson()
	{
//		Person person = new Person(101, "Shraddha");
//		service.addNew(person);
//		ContractPerson cperson = new ContractPerson(201, "Kalpana", 3000, "2");
//		service.addNew(cperson);
//		RegularPerson rperson = new RegularPerson(301, "Pradnya", 4000, 5000);
//		service.addNew(rperson);
//		return person;
//		
		
		Person person = new ContractPerson(101, "Shraddha", 300.0, "three");
		service.addNew(person);
		
		Person person1 = new RegularPerson(301, "Kiwi", 5000, 23000);
		service.addNew(person1);
		return person;
	}
}

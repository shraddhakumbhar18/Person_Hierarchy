package com.capgemini.PersonHierarchy.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capgemini.PersonHierarchy.entity.Person;

@Repository
public interface PersonDao extends JpaRepository<Person, Integer>
{

}

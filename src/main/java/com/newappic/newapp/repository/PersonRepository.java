package com.newappic.newapp.repository;

import java.io.Serializable;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import com.newappic.newapp.domain.Person;

@RepositoryRestResource(path = "/persons")
public interface PersonRepository extends Serializable,PagingAndSortingRepository<Person, Long> {

	
	
}

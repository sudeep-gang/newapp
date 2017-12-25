package com.newappic.newapp.web;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.newappic.newapp.domain.Person;

import com.newappic.newapp.repository.PersonRepository;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;


@RestController
@RequestMapping("/api/persons")
@Api(value="/api",description="This class will give detials of person.")
public class PersonController {
	
	@Autowired
	PersonRepository personRespository;
	
	@ApiOperation(value="This url will give the detail of the person",response=Person.class,notes="give the detial of the person")
	@ApiResponses(value= {
			@ApiResponse(code=200, message="Successfully retrieved list"),
			@ApiResponse(code=401, message="You are not authorized to view the resource"),
			@ApiResponse(code=403, message="Accessing the resource you were trying to reach is forbidden"),
			@ApiResponse(code=404, message="The resource you were trying to reach is not found")
	})
	@RequestMapping(method= RequestMethod.GET, produces=MediaType.APPLICATION_JSON_VALUE)
	public Iterable<Person> getAllPerson() {
		
		return personRespository.findAll();
	}
	@ApiOperation(value="This url will give the detail of the person by the id of person",response=Person.class,notes="give the detial of the person by the id of person")
	@ApiResponses(value= {
			@ApiResponse(code=200, message="Successfully retrieved list"),
			@ApiResponse(code=401, message="You are not authorized to view the resource"),
			@ApiResponse(code=403, message="Accessing the resource you were trying to reach is forbidden"),
			@ApiResponse(code=404, message="The resource you were trying to reach is not found")
	})
	
	@RequestMapping(method= RequestMethod.GET, produces=MediaType.APPLICATION_JSON_VALUE, value= "/{id}")
	public Person getPerson(@PathVariable ("id") Long id) {
		
		return personRespository.findOne(id);
	}
	
	@ApiOperation(value="This url will create the detial of the person",response=Person.class,notes="create the detials of the person")
	@ApiResponses(value= {
			@ApiResponse(code=200, message="Successfully retrieved list"),
			@ApiResponse(code=401, message="You are not authorized to view the resource"),
			@ApiResponse(code=403, message="Accessing the resource you were trying to reach is forbidden"),
			@ApiResponse(code=404, message="The resource you were trying to reach is not found")
	})
	@RequestMapping(method=RequestMethod.POST, produces= MediaType.APPLICATION_JSON_UTF8_VALUE, consumes=MediaType.APPLICATION_JSON_UTF8_VALUE)
	public Person createPerson(@RequestBody Person person) {
		
		return personRespository.save(person);
	}
	
	@ApiOperation(value="This url will update the detial of the person",response=Person.class,notes="update the detial of the person")
	@ApiResponses(value= {
			@ApiResponse(code=200, message="Successfully retrieved list"),
			@ApiResponse(code=401, message="You are not authorized to view the resource"),
			@ApiResponse(code=403, message="Accessing the resource you were trying to reach is forbidden"),
			@ApiResponse(code=404, message="The resource you were trying to reach is not found")
	})
	@RequestMapping(method=RequestMethod.PUT, produces= MediaType.APPLICATION_JSON_UTF8_VALUE, consumes=MediaType.APPLICATION_JSON_UTF8_VALUE)
	public Person updatePerson(@RequestBody Person person) {
		
		return personRespository.save(person);
	}
	
	@ApiOperation(value="This url will delete the detials of the person",response=Boolean.class,notes="delete the detials of the person")
	@ApiResponses(value= {
			@ApiResponse(code=200, message="Successfully retrieved list"),
			@ApiResponse(code=401, message="You are not authorized to view the resource"),
			@ApiResponse(code=403, message="Accessing the resource you were trying to reach is forbidden"),
			@ApiResponse(code=404, message="The resource you were trying to reach is not found")
	})
	@RequestMapping(method= RequestMethod.DELETE, produces= MediaType.APPLICATION_JSON_UTF8_VALUE, value= "/{id}")
	public boolean deletePerson(@PathVariable ("id") long id){
		
		personRespository.delete(id);
		
		return true;
	}
	
	
	
	

}

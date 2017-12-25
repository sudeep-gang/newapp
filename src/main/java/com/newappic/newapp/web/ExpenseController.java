package com.newappic.newapp.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.newappic.newapp.domain.Expense;
import com.newappic.newapp.repository.ExpenseRepository;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;


@RestController
@RequestMapping("/api/expenses")
@Api(value="/api",description="This class will give the detials of Expense.",
consumes=MediaType.APPLICATION_JSON_VALUE,produces=MediaType.APPLICATION_JSON_VALUE,basePath="http://localhost:8080")
public class ExpenseController {
	
	@Autowired 
	ExpenseRepository expenseRepository;
	
	@ApiOperation(notes="This URL will return all the expense values",response=Expense.class,value="View list of avaiable expenses.")
	@ApiResponses(value= {
			@ApiResponse(code=200, message="Successfully retrieved list"),
			@ApiResponse(code=401, message="You are not authorized to view the resource"),
			@ApiResponse(code=403, message="Accessing the resource you were trying to reach is forbidden"),
			@ApiResponse(code=404, message="The resource you were trying to reach is not found")
			})
	
	@RequestMapping(method = RequestMethod.GET, produces= MediaType.APPLICATION_JSON_UTF8_VALUE )
	public Iterable<Expense> getAllPerson() {
		
		return expenseRepository.findAll();
	}
	
	@ApiOperation(notes="This method will create new expense account.",response=Expense.class,value="creating new expense account")
	@ApiResponses(value= {
			@ApiResponse(code=200, message="Successfully retrieved list"),
			@ApiResponse(code=401, message="You are not authorized to view the resource"),
			@ApiResponse(code=403, message="Accessing the resource you were trying to reach is forbidden"),
			@ApiResponse(code=404, message="The resource you were trying to reach is not found")
			})
	@RequestMapping(method=RequestMethod.POST, produces= MediaType.APPLICATION_JSON_UTF8_VALUE, consumes=MediaType.APPLICATION_JSON_UTF8_VALUE)
	public Expense createExpense(@RequestBody Expense expense) {
		
		return expenseRepository.save(expense);
	}
	
	@ApiOperation(notes="This method will update expense account.",response=Expense.class,value="updating expense account")
	@ApiResponses(value= {
			@ApiResponse(code=200, message="Successfully retrieved list"),
			@ApiResponse(code=401, message="You are not authorized to view the resource"),
			@ApiResponse(code=403, message="Accessing the resource you were trying to reach is forbidden"),
			@ApiResponse(code=404, message="The resource you were trying to reach is not found")
			})
	@RequestMapping(method=RequestMethod.PUT, produces= MediaType.APPLICATION_JSON_UTF8_VALUE, consumes=MediaType.APPLICATION_JSON_UTF8_VALUE)
	public Expense updateExpense(@RequestBody Expense expense) {
		
		return expenseRepository.save(expense);
	}
	
	@ApiOperation(notes="This method will delete expense account.",response=Boolean.class,value="delete expense account")
	@ApiResponses(value= {
			@ApiResponse(code=200, message="Successfully retrieved list"),
			@ApiResponse(code=401, message="You are not authorized to view the resource"),
			@ApiResponse(code=403, message="Accessing the resource you were trying to reach is forbidden"),
			@ApiResponse(code=404, message="The resource you were trying to reach is not found")
			})
	@RequestMapping(method= RequestMethod.DELETE, produces= MediaType.APPLICATION_JSON_UTF8_VALUE, value= "/{id}")
	public boolean deleteExpense(@PathVariable ("id") long id){
		
		expenseRepository.delete(id);
		
		return true;
	}

}

package com.newappic.newapp.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.newappic.newapp.domain.Account;
import com.newappic.newapp.repository.AccountRepository;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@RequestMapping("/api/accounts")
@Api(value="/api",description="This class will give detials of account of the person.")
public class AccountController {
	
	@Autowired
	AccountRepository accountRepository;
	

	@ApiOperation(value="Get the list of accounts.",response=Account.class,notes="Give the list of all accounts.",nickname="sudeep")
	@ApiResponses(value= {
			@ApiResponse(code=200, message="Successfully retrieved list"),
			@ApiResponse(code=401, message="You are not authorized to view the resource"),
			@ApiResponse(code=403, message="Accessing the resource you were trying to reach is forbidden"),
			@ApiResponse(code=404, message="The resource you were trying to reach is not found")
	})
	@RequestMapping(method = RequestMethod.GET, produces= MediaType.APPLICATION_JSON_UTF8_VALUE )
	public Iterable<Account> getAllAccount() {
		
		return accountRepository.findAll();
	}
	
	@ApiOperation(value="It will Create the new account",response=Account.class,notes="creating new account")
	@ApiResponses(value= {
			@ApiResponse(code=200, message="Successfully retrieved list"),
			@ApiResponse(code=401, message="You are not authorized to view the resource"),
			@ApiResponse(code=403, message="Accessing the resource you were trying to reach is forbidden"),
			@ApiResponse(code=404, message="The resource you were trying to reach is not found")
	})
	
	@RequestMapping(method=RequestMethod.POST, produces= MediaType.APPLICATION_JSON_UTF8_VALUE, consumes=MediaType.APPLICATION_JSON_UTF8_VALUE)
	public Account createAccount(@RequestBody Account account) {
		
		return accountRepository.save(account);
	}
	
	@ApiOperation(value="It will update the existing account",response=Account.class,notes="updating the existing account")
	@ApiResponses(value= {
			@ApiResponse(code=200, message="Successfully retrieved list"),
			@ApiResponse(code=401, message="You are not authorized to view the resource"),
			@ApiResponse(code=403, message="Accessing the resource you were trying to reach is forbidden"),
			@ApiResponse(code=404, message="The resource you were trying to reach is not found")
	})
	@RequestMapping(method=RequestMethod.PUT, produces= MediaType.APPLICATION_JSON_UTF8_VALUE, consumes=MediaType.APPLICATION_JSON_UTF8_VALUE)
	public Account updateAccount(@RequestBody Account account) {
		
		return accountRepository.save(account);
	}
	
	@ApiOperation(value="It will delete the existing account",response=Boolean.class,notes="deleting the existing account")
	@ApiResponses(value= {
			@ApiResponse(code=200, message="Successfully retrieved list"),
			@ApiResponse(code=401, message="You are not authorized to view the resource"),
			@ApiResponse(code=403, message="Accessing the resource you were trying to reach is forbidden"),
			@ApiResponse(code=404, message="The resource you were trying to reach is not found")
	})
	@RequestMapping(method= RequestMethod.DELETE, produces= MediaType.APPLICATION_JSON_UTF8_VALUE, value= "/{id}")
	public boolean deleteAccount(@PathVariable ("id") long id){
		
		accountRepository.delete(id);
		
		return true;
	}

}

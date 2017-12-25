package com.newappic.newapp.repository;

import java.io.Serializable;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.newappic.newapp.domain.Expense;

@RepositoryRestResource(path="/expenses")
public interface ExpenseRepository extends Serializable,PagingAndSortingRepository<Expense , Long>{

}

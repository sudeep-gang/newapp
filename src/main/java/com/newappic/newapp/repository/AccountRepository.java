package com.newappic.newapp.repository;

import java.io.Serializable;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.newappic.newapp.domain.Account;

@RepositoryRestResource(path="/accounts")
public interface AccountRepository extends Serializable,PagingAndSortingRepository<Account, Long>{

}

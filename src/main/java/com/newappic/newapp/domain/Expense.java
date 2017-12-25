package com.newappic.newapp.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import io.swagger.annotations.ApiModelProperty;



/**
 * This is related to {@link Expense}
 *
 * @author sudeep
 *
 */

@Entity
@Table(name="expenses")
public class Expense {
	
	/**
	 * This is the id of {@link Expense}}
	 */
	@ApiModelProperty(notes="Auto-Generated Id of Expense")
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id")
	private long id;
	

	/**
	 * This is the name of {@link Expense}}
	 */
	@ApiModelProperty(notes="Name of the account holder")
	@Column(name="name")
	private String name;
	

	/**
	 * This is the type of {@link Expense}}
	 */
	@ApiModelProperty(notes="Type of Expense")
	@Column(name="type")
	private String type;
	

	/**
	 * This is the description of {@link Expense}}
	 */
	@ApiModelProperty(notes="Description of Expense")
	@Column(name="description")
	private String description;
	
	/**
	 * This is the amount of {@link Expense}}
	 */
	
	@ApiModelProperty(notes="Amount of Expense")
	@Column(name="amount")
	private long amount;
	
	/**
	 * This is the data of {@link Expense}}
	 */
	
	@ApiModelProperty(notes="data of Expense")
	@Column(name="data")
	private String data;
	
	/**
	 * This is the personId of {@link Expense}}
	 */
	
	@ApiModelProperty(notes="PersonId of Expense")
	@Column(name="person_id")
	private long personId;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public long getAmount() {
		return amount;
	}

	public void setAmount(long amount) {
		this.amount = amount;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public long getPersonId() {
		return personId;
	}

	public void setPersonId(long personId) {
		this.personId = personId;
	}
	
	
	
	

}

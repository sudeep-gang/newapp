package com.newappic.newapp.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.Table;

import io.swagger.annotations.ApiModelProperty;



/**
 * This is related to {@link Person}
 *
 * @author sudeep
 *
 */

@Entity
@Table(name="persons")
public class Person {

	/**
	 * This is id of the person {@link Person}
	 * 
	 */
	@ApiModelProperty(notes="Auto-Generated Id of person")
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="id")
	private long id;
	
	/**
	 * This is first_name of the person {@link Person}
	 * 
	 */
	@ApiModelProperty(notes="First name of the of person")
	@Column(name="first_name")
	private String firstName;
	
	/**
	 * This is last_name of the person {@link Person}
	 * 
	 */
	@ApiModelProperty(notes="Last name of the of person")
	@Column(name="last_name")
	private String lastName;
	
	/**
	 * This is Date_of_Birth of the person {@link Person}
	 * 
	 */
	@Column(name="dob")
	private long dob;
	
	public enum Type{
		MALE,FEMALE,OTHERS
	}
	/**
	 * This is Gender of the person {@link Person}
	 * 
	 */
	@ApiModelProperty(notes="Gender of the of person")
	@Column(name="gender")
	private Type gender;
	
	/**
	 * This is emailAddress of the person {@link Person}
	 * 
	 */
	@ApiModelProperty(notes="EmailAddress of the of person")
	@Column(name="email_address")
	private String emailAddress;
	
	/**
	 * This is location of the person {@link Person}
	 * 
	 */
	@ApiModelProperty(notes="Location of the of person")
	@Column(name="location")
	private String location;
	
	/**
	 * This is createdTime of the person's account {@link Person}
	 * 
	 */
	@ApiModelProperty(notes="CreatedTime of the of person's account")
	@Column(name="created_time")
	private long createdTime;
	 
	/**
	 * This is updatedTime of the person's account {@link Person}
	 * 
	 */	
	@ApiModelProperty(notes="updatedTime of the of person's account")
	 @Column(name="updated_time")
	 private long updatedTime;
	 
	 /**
	  * This person's account is createdBy {@link Person}
	  * 
	  */	
	@ApiModelProperty(notes="CreatedBy account of the person")
	 @Column(name="created_by")
	 private String createdBy;
	 
	 /**
	  * 
	  */
	 @PrePersist
		public void prePersist() {
		 
		if(this.id>0L) {
			
			this.updatedTime=System.currentTimeMillis()/1000;
		}
		else
			this.createdTime = System.currentTimeMillis()/1000;	
			
		}
	 
	 /**
	  * This is mobileNo of the person {@link Person}
	  * 
	  */	
	 @Column(name="mobile_no")
	 private String mobileNo;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public long getDob() {
		return dob;
	}

	public void setDob(long dob) {
		this.dob = dob;
	}

	public Type getGender() {
		return gender;
	}

	public void setGender(Type gender) {
		this.gender = gender;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public long getCreatedTime() {
		return createdTime;
	}

	public void setCreatedTime(long createdTime) {
		this.createdTime = createdTime;
	}

	public long getUpdatedTime() {
		return updatedTime;
	}

	public void setUpdatedTime(long updatedTime) {
		this.updatedTime = updatedTime;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	 
	
	
	
	
}

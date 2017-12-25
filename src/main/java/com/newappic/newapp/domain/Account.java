package com.newappic.newapp.domain;

import java.util.logging.Level;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.Table;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.extern.java.Log;

/**
 * This is related to {@link Account}
 *
 * @author sudeep
 *
 */
@Entity
@Table(name = "accounts")
@Data
@Log
public class Account {

	/**
	 * This is the id of {@link Account}}
	 */
	@ApiModelProperty(notes = "auto-generated Id of the account", required = true)
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private long id;

	/**
	 * This is the personId of {@link Account}}
	 */

	@ApiModelProperty(notes = "person Id of the account")
	@Column(name = "person_id")
	private long personId;

	/**
	 * This is the amount of {@link Account}}
	 */
	@ApiModelProperty(notes = "amount of the account")
	@Column(name = "amount")
	private long amount;

	/**
	 * This is the transcationType of {@link Account}}
	 */

	public enum Type {
		DEBITED, CREDITED
	}

	@ApiModelProperty(notes = "TranscationType of the account")
	@Column(name = "transcation_type")
	private Type transcationType;

	/**
	 * This is the transcationData of {@link Account}}
	 */

	@ApiModelProperty(notes = "transcationData of the account")
	@Column(name = "transcation_data")
	private String transcationData;

	
/**
 * 
 * @param args
 */
public static void main(String[] args) {
	
	Account account=new Account();

	account.setId(12345L);
	account.setTranscationData("Chicken");
	account.setAmount(500);
	account.setTranscationType(Type.CREDITED);
	
	System.out.println(account.toString());
	
	log.info(account.toString());
	
	
	
}
}
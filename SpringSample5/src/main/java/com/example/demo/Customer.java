package com.example.demo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;

/**
 * Class for storing information retrieved from the DB
 */
@Entity
@Table(name="customer_table")
@Getter
public class Customer {

	/**
	 * PRIMARY KEY
	 */
	@Id
	@Column(name="cus_Num")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long num;

	/**
	 * Customer's name
	 */
	@Column(name="Cus_Name")
	private String name;

	/**
	 * Customer's Address
	 */
	@Column(name="cus_Address")
	private String address;

	/**
	 * Customer's phone number
	 */
	@Column(name="cus_Telno")
	private String telno;
}

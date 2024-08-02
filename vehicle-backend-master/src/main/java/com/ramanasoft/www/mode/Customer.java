package com.ramanasoft.www.mode;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table
@Data
public class Customer 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private long customerid;
	private String fullName;
	private String address;
	private String state;
	private String mobile;
	private String email;
}

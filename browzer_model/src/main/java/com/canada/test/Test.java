package com.canada.test;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "TEST")
public class Test {
	
	@Id
	@Column(name="Id")
	@GeneratedValue
	private long id;
	
	@Column(name="name")
	private String name;

}

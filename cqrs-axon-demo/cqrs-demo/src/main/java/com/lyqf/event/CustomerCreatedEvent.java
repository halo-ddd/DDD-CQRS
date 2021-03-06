package com.lyqf.event;

import java.io.Serializable;

import org.axonframework.eventsourcing.annotation.AggregateIdentifier;

public class CustomerCreatedEvent implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 3682075358286689379L;
	
	@AggregateIdentifier
	private String id;
	
	private String name;
	
	private String pwd;

	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	
	
	
}

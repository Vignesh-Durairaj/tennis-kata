package com.test.model;

public class Department {

	private long id;
	private String name;
	private boolean isActive;
	
	public Department(long id, String name, boolean isActive) {
		super();
		this.id = id;
		this.name = name;
		this.isActive = isActive;
	}

	public long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public boolean isActive() {
		return isActive;
	}
	
	
}

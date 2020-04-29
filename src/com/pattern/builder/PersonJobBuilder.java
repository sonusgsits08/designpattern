package com.pattern.builder;

public class PersonJobBuilder extends PersonBuilder{

	public PersonJobBuilder(Person person) {
	this.person = person;
	}
	public PersonJobBuilder jobType(String jobType) {
		this.person.jobType = jobType;
		return this;
	}
	public PersonJobBuilder salary(int salary) {
		this.person.salary = salary;
		return this;
	}
}

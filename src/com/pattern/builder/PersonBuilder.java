package com.pattern.builder;

public class PersonBuilder {
	protected Person person = new Person();
	
	public PersonAddressBuilder at(Person person) {		
		return new PersonAddressBuilder(person);
	}
	public PersonJobBuilder job(Person person) {
		return new PersonJobBuilder(person);
	}
	public Person build() {
		return person;
	}

}

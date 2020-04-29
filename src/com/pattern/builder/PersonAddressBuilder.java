package com.pattern.builder;

public class PersonAddressBuilder extends PersonBuilder {

	public PersonAddressBuilder(Person person) {
		this.person = person;
	}
	public PersonAddressBuilder city(String city) {
		this.person.city = city;
		return  this;
	}
	public PersonAddressBuilder code(String code) {
		this.person.code = code;
		return this;
	}
}

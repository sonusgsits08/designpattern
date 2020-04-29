package com.pattern.builder;

public class TestBuilder {
public static void main(String[] args) {
	Person person = new Person();
	PersonBuilder pb = new PersonBuilder();
	Person buildPerson = pb.at(person).city("Pune").code("411033")
		    .job(person).jobType("Developer").salary(123456)
			.build();		
	System.out.println("**********Below Object is created using Builder Pattern***********");
	System.out.println(buildPerson);
}
}
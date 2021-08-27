package de.gagan.spring.domain;

public class PersonFactory {
	
	public Person createPerson(int id, String name)
	{
		System.out.println("Creating person using factory bean.");
		return new Person(id, name);
	}

}

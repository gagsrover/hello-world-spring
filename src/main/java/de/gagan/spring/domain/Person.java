package de.gagan.spring.domain;

public class Person {
	
	private int id;
	
	private String name;
	
	private int taxId;
	
	private Address address;
	
	public static Person getInstance(int id, String name)
	{
		System.out.println("Creating object via factory");
		return new Person(id, name);
	}
	
	public Person(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public void onCreate()
	{
		System.out.println("Person Created");
	}
	
	public void onDestroy()
	{
		System.out.println("Person Destroyed");
	}
	
	public Address getAddress() {
		return address;
	}



	public void setAddress(Address address) {
		this.address = address;
	}



	public int getTaxId() {
		return taxId;
	}



	public void setTaxId(int taxId) {
		this.taxId = taxId;
	}



	public void speak()
	{
		System.out.println("Hello, I am a person!!!");
	}



	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", taxId=" + taxId + ", address=" + address + "]";
	}
	
}

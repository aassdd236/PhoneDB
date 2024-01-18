package com.javaex.ex01;

public class Person {
	private String name;
	private String hp;
	private String company;
	
	public Person(String[] split) {
		super();
		this.name = split[0];
		this.hp = split[1];
		this.company =split[2];
	}

	public Person(String name, String hp, String company) {
		super();
		this.name = name;
		this.hp = hp;
		this.company = company;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getHp() {
		return hp;
	}

	public void setHp(String hp) {
		this.hp = hp;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	@Override
	public String toString() {
		return  name + ", " + hp + ", " + company+"\n";
	}

	public void showInfo() {
		System.out.println(name+"\t"+hp+"\t"+company);
	}
	
	
	
}

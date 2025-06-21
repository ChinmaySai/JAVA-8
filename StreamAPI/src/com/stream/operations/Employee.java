package com.stream.operations;

public class Employee {
	private int id;
	private String name;
	private String city;
	private int age;
	private String gender;
	private String department;
	private int yearofJoining;
	private double salary;
	public Employee(int id, String name, String city, int age, String gender, String department, int yearofJoining,
			double salary) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
		this.age = age;
		this.gender = gender;
		this.department = department;
		this.yearofJoining = yearofJoining;
		this.salary = salary;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getCity() {
		return city;
	}
	public int getAge() {
		return age;
	}
	public String getGender() {
		return gender;
	}
	public String getDepartment() {
		return department;
	}
	public int getYearofJoining() {
		return yearofJoining;
	}
	public double getSalary() {
		return salary;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", city=" + city + ", age=" + age + ", gender=" + gender
				+ ", department=" + department + ", yearofJoining=" + yearofJoining + ", salary=" + salary + "]";
	}
	
	
	

}

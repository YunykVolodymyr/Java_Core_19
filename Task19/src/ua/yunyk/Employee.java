package ua.yunyk;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Employee implements Serializable{

	private static int n = 0;
	private String name;
	private int id;
	private transient int salary;
	
	public Employee(String name , int salary) {
		super();
		this.name = name;
		this.id = n;
		this.salary = salary;
		n++;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + ", salary=" + salary + "]";
	}

}

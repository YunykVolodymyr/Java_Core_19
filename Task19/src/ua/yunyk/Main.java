package ua.yunyk;

import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		File file = new File("serialization1.txt");
		Employee employee = new Employee("Ivan", 4200);
		Methods.serialize(employee, file);
		System.out.println(Methods.deserialize(file));
		
		File file2 = new File("serialization2.txt");
		List<Employee> list = new ArrayList<Employee>();
		
		list.add(employee);
		list.add(new Employee("Petro", 3900));
		list.add(new Employee("Nazar", 4600));
		list.add(new Employee("Anton", 3000));
		list.add(new Employee("Roman", 2900));
		
		
		Methods.serialize((Serializable)list, file2);
		System.out.println(Methods.deserialize(file2));
		
	}
	
}

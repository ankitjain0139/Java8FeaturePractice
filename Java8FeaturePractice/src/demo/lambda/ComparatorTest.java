package demo.lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparatorTest {

	public static void main(String[] args) {

		List<Employee> employees = new ArrayList<>();
		employees.add(new Employee(1, "Ram"));
		employees.add(new Employee(2, "Shyaam"));
		employees.add(new Employee(3, "Mohan"));
		employees.add(new Employee(4, "Aaam"));
		employees.add(new Employee(5, "Zuul"));
		
		System.out.println("List before sorting==="+employees);
		
		Collections.sort(employees, (e1, e2) -> ((e1.getEmpNo()>e2.getEmpNo()) ? -1 : (e1.getEmpNo()<e2.getEmpNo()) ? 1 : 0 ));
		
		System.out.println("List after sorting==="+employees);
		
	}
}

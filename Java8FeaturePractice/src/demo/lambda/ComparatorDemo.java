package demo.lambda;

import java.util.Comparator;

public class ComparatorDemo implements Comparator<Employee> {

	@Override
	public int compare(Employee e1, Employee e2) {
		return ((e1.getEmpNo()>e2.getEmpNo()) ? -1 : (e1.getEmpNo()<e2.getEmpNo()) ? 1 : 0 );
	}
}


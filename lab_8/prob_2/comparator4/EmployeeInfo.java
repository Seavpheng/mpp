package lab_8.prob_2.comparator4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class EmployeeInfo {
	static enum SortMethod {BYNAME, BYSALARY};
	private SortMethod sortMethod = SortMethod.BYNAME;

	public static void sort(List<Employee> emps, SortMethod method) {

		Collections.sort(emps, (e1, e2) -> {
			if (method == SortMethod.BYNAME) {
				if (e1.equals(e2)) return 0;
				if (e1.name.compareTo(e2.name) == 0) {
					if (e1.salary > e2.salary) return 1;
					if (e1.salary < e2.salary) return -1;
				}
				return e1.name.compareTo(e2.name);
			} else {
				if (e1.equals(e2)) return 0;
				if(e1.salary == e2.salary){
					return e1.name.compareTo(e2.name);
				}else
					return e1.salary - e2.salary > 0 ? 1 : -1;
			}
		});
	}

	
	public static void main(String[] args) {
		List<Employee> emps = new ArrayList<>();
		emps.add(new Employee("Joe", 100000));
		emps.add(new Employee("Tim", 50000));
		emps.add(new Employee("Andy", 60000));
		EmployeeInfo ei = new EmployeeInfo();
		ei.sort(emps, EmployeeInfo.SortMethod.BYNAME);
		System.out.println(emps);


		ei.sort(emps, SortMethod.BYSALARY);
		System.out.println(emps);
	}
}

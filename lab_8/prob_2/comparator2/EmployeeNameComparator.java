package lab_8.prob_2.comparator2;

import java.util.Comparator;

/* A functor, but not a closure */
public class EmployeeNameComparator implements Comparator<Employee> {
	@Override
	public int compare(Employee e1, Employee e2) {
		if( e1.name.compareTo(e2.name) != 0){
			return 1;
		}else if(e1.name.compareTo(e2.name) == 0){
			return e1.salary == e2.salary ? 0 : 1;
		}
		return 1;
	}
}

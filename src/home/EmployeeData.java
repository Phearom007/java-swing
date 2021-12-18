package home;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EmployeeData {
	private static Map<String, Employee> employees = new HashMap<>();
	
	public Employee insert(Employee data) {
		if (data!=null) {
			employees.put(""+data.getId(), data);
		}
		return data;
	}
	
	public Employee update(Employee data) {
		if (data!=null) {
			employees.put(""+data.getId(), data);
		}
		return data;
	}
	
	public boolean delete(Employee data) {
		if (data!=null) {
			employees.remove(data);
			return true;
		}
		return false;
	}
	
	public boolean deleteById(String id) {
		if (id !=null) {
			employees.remove(id);
			return true;
		}
		return false;
	}
	
	public Employee find(String key) throws EmployeeNotFound {
		if (employees.size()> 0 && employees.get(key) != null) {
			System.out.println("Employee: " + employees.get(key));
			return employees.get(key);
		} else {
			throw new EmployeeNotFound("I can't find the employee with id " + key);
		}
	}
	
	public List<Employee> list() {
		return (List<Employee>) employees.values();
	}

}

package home;

public class EmployeeNotFound extends Exception {
	public EmployeeNotFound() {
		super();
	}
	
	public EmployeeNotFound(String message) {
		super("EmployeeNotFound: " + message);
	}
}

package home;

public class Employee {
	private int id;
	  private String name;
	  private double salary;

	  public Employee() {
	    id = 1;
	    name = "sok san";
	    salary = 500;

	  }

	  public Employee(int i, String n, double s) {
	    setId(i);
	    setName(n);
	    setSalary(s);

	  }

	  public int getId() {
	    return id;
	  }

	  public void setId(int id) {
	    this.id = id;

	  }

	  public String getName() {
	    return name;
	  }

	  public void setName(String name) {
	    this.name = name;

	  }

	  public double getSalary() {
	    return salary;
	  }

	  public void setSalary(double salary) {
	    this.salary = salary;
	  }

	  public String toString() {
	    return getId() + " " + getName() + " " + getSalary() + "\n";
	  }
	}



package home;

import javax.swing.*;
import java.util.*;

public class TestEmployee{
  private Vector<Employee>list=new Vector<Employee>();

  void out(String I) {
    JTextArea d = new JTextArea(I, 10, 60);
    JOptionPane.showMessageDialog(null, d);

  }

  void addEmployees() {
    do {
      list.add(getEmployee());
    } while (readString("Yes or No").equalsIgnoreCase("yes"));

  }

  void showEmployees(){
    /*out(list.toString()); */
    String report=" All Employees\n";
    for(Object a:list)report+=a.toString();
    out(report);

  }

  public TestEmployee() {
    addEmployees();
    showEmployees();

  }

  public static void main(String[] args) {
    new TestEmployee();

  }

  String readString(String I) {
    return JOptionPane.showInputDialog(I);
  }

  int readInt(String I) {
    return Integer.parseInt(readString(I));

  }

  double readDouble(String I) {
    return Double.parseDouble(readString(I));

  }

  Employee getEmployee() {
    int id = readInt("Enter ID");
    String name = readString("Enter Name");
    double salary = readDouble("Enter Salary");
    return new Employee(id, name, salary);
  }

}
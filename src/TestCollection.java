import java.util.*;

public class TestCollection {

  public TestCollection() {
    //ArrayList
    List a1 = new ArrayList();
    a1.add("Zara");
    a1.add("Manhnaz");
    a1.add("ayan");
    a1.addAll(a1);
    System.out.println("ArrayList Element.length = " + a1.size());
    System.out.println("\t" + a1);
 
  }

  public void pirntClassName() {
    System.out.println("TestCollection.pirntClassName");
  }

  public static void printStaticMethod() {
    System.out.println("TestCollection.printStaticMethod");
  }

  public static void main(String[] args) {
    TestCollection collect = new TestCollection();
    collect.pirntClassName();
    System.out.println("TestCollection.main");
  }

}
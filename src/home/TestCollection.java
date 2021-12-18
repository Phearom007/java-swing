package home;

import java.util.ArrayList;
import javax.swing.*;

public class TestCollection {
  private ArrayList<String> list;

  String readString(String I) {
    return JOptionPane.showInputDialog(I);
  }

  void out(String m) {
    JTextArea d = new JTextArea(m, 10, 50);
    JOptionPane.showMessageDialog(null, d);
  }

  void addNames(){
    do{
      list.add(readString("Enter Name"));
    }while(readString("Yes or No?").equalsIgnoreCase("yes"));
  }

  void showNames() {
    out(list.toString());
  }

  public TestCollection() {
    list=new ArrayList<String>();
    /*
     * list.add("Sok"); list.add("Dara"); list.add("Chan"); out(list.toString());
     * list.add(1,"Rupp"); out(list.toString()); list.set(2,"Kong");
     * out(list.toString()); list.remove(0); out(list.toString());
     */
    addNames();
    showNames();

  }

  public static void main(String[] args) {
    new TestCollection();
  }
}
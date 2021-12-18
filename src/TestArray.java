class TestArray {

  public TestArray() {

    String[] array1 = new String[3];

    array1[0] = "a";
    array1[1] = "b";
    array1[2] = "c";

    
    for(String item: array1) {
      System.out.println("Array1: " + item);
    }

    for(int i=0; i<array1.length; i++) {
      System.out.println("Array1[" + i + "]"+ array1[i]);
    }


  }
  
}
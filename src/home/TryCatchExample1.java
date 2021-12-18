package home;

public class TryCatchExample1 {

	public static void main (String[] args) {
		try {
			int[] a = {5,6,7,8};
			System.out.println(a[3]);
		} catch (Exception ex) {
			System.out.println("An exception happened");
		}
	}
}

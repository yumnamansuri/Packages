package employeeData;
import java.util.Scanner;

public class ScannerClass {

	public static void main(String[] args) {
		
		
		
		Scanner a = new Scanner(System.in);
		System.out.println("Enter Your Name ==> ");
		String name = a.nextLine();
		System.out.println("Enter Your Designation ==> ");
		String designation = a.nextLine();
		System.out.println("Enter Your Mobile No ==> ");
		int mobileno = a.nextInt();
		
		System.out.println(name);
		System.out.println(designation);
		System.out.println(mobileno);
		
		

	}

}

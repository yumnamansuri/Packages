package employeeData;
import java.util.Scanner;
public class ExceptionHandling {

	public static void main(String[] args) {
	
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Your Number 1==> ");
		int a = s.nextInt();
		System.out.println("Enter Your Number 2 ==> ");
		int b = s.nextInt();
		
		try
		{
		
			int c = a/b;
			System.out.println(c);
		}
		catch(Exception e)
		{
			System.out.println("Can't divide by zero");
		}
		

	}

}

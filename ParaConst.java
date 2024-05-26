package employeeData;

public class ParaConst {

	private int age;
	private String name;
	
	
	
	public ParaConst(String name, int age) {
		
		this.name = name;
		this.age = age;
		
	}
	
	public void displayDetails()
	{
		System.out.println("Student Details");
		System.out.println("Name => "+name);
		System.out.println("Age => "+age);
	}

	public static void main(String[] args) {
	
		ParaConst obj= new ParaConst("Alex",20);
		ParaConst obj1= new ParaConst("Siddharth",22);
		
		System.out.println("Details for Student 1 => ");
		obj.displayDetails();
		System.out.println("Details for Student 2 => ");
		obj1.displayDetails();
		
	}

}

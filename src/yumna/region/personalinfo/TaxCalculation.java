package yumna.region.personalinfo;

public class TaxCalculation {

	public void calculateTax(PersonalInfo info)
	{
		double tax=0.0;
		if(info.getAge() >=18)
		{
			if(info.getIncome()>=50000 && info.getIncome()<70000)
			{
				tax = info.getIncome() *0.05;
				
			}
		
			else if(info.getIncome()>=70000 && info.getIncome()<100000)
			{
				tax = info.getIncome() *0.10;
			}
			else if(info.getIncome()>=100000)
			{
				tax = info.getIncome() *0.15;
			}
			else
			{
				System.out.println("No need to pay tax");
			}
		
		}
		else
		{
			System.out.println("No Tax");
		}
		System.out.println("Tax ==> " +tax);
	}

}

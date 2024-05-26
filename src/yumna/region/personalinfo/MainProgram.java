package yumna.region.personalinfo;

import tnsif.region.countrystatepack.City;
import tnsif.region.countrystatepack.Country;

public class MainProgram {

	public static void main(String[] args) {
		
		Country cnt = new Country("India");
		City c = new City("Ahmedabad");
		PersonalInfo info = new PersonalInfo("Yumna",cnt,c,19,60000,"y123@gmail.com");

		System.out.println(info);
		
		TaxCalculation tc = new TaxCalculation();
		tc.calculateTax(info);
	}

}

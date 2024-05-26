package yumna.region.personalinfo;

import tnsif.region.countrystatepack.*;
public class PersonalInfo {
	
	private String name;
	private Country coutryName;
	private City  Cityname;
	private int age;
	private int income;
	private String email;
	
	PersonalInfo()
	{
		//Default Constructor
	}
	
	

	public PersonalInfo(String name, Country coutryName, City cityname, int age, int income, String email) 
	{
		//Parameterized Construtor
		
		super();
		this.name = name;
		this.coutryName = coutryName;
		this.Cityname = cityname;
		this.age = age;
		this.income = income;
		this.email = email;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public Country getCoutryName() {
		return coutryName;
	}



	public void setCoutryName(Country coutryName) {
		this.coutryName = coutryName;
	}



	public City getCityname() {
		return Cityname;
	}



	public void setCityname(City cityname) {
		Cityname = cityname;
	}



	public int getAge() {
		return age;
	}



	public void setAge(int age) {
		this.age = age;
	}



	public int getIncome() {
		return income;
	}



	public void setIncome(int income) {
		this.income = income;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}


	

	@Override
	public String toString() {
		return "PersonalInfo [name=" + name +", "
				+ "coutryName=" + coutryName + ","
				+ " Cityname=" + Cityname + ", age=" + age
				+ ", income=" + income + ", email=" + email + "]";
	}



	public static void main(String[] args) {
		

	}

}

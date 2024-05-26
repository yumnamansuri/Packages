package tnsif.region.countrystatepack;

public class Country {
	
	private String countryName;
	
	public Country()
	{
		
	}
	
	

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}
	

	public Country(String countryName) {
	
		this.countryName = countryName;
	}



	@Override
	public String toString() {
		return "Country [countryName=" + countryName + "]";
	}

	public static void main(String[] args) {
		Country cnt = new Country();
		cnt.setCountryName("LONDON");
		System.out.println(cnt.getCountryName());

	}

}

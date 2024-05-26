package tnsif.region.countrystatepack;

public class City {
	
	private String Cityname;
	
	public City() //Default Constructor
	{
		
	}

	
	public String getCityname() {
		return Cityname;
	}


	public void setCityname(String cityname) {
		this.Cityname = cityname;
	}

	public City(String cityname)
	{
		this.Cityname = cityname;
	}
	

	@Override
	public String toString() {
		return "City [Cityname=" + Cityname + "]";
	}

	public static void main(String args[])
	{
		City c = new City();
		c.setCityname("Ahmedabad");
		
		 System.out.println(c.getCityname());


	}
	
}

public class Address
{
	private String streetAddress ="";
	private String city;
	private String state;
	private String zip;

	//deafult constructor 
	public Address()
	{
		streetAddress = "st";
        city = "cty";
        state = "st";
        zip = "21286";
	}
	
	public Address(String sAddress, String city2, String state2, String zipCode)
	{
		streetAddress = sAddress;
        city = city2;
        state = state2;
        zip = zipCode;
	}
	
	public void print()
	{
		System.out.println(streetAddress + "\t" + city + "\t" + state + "\t" + zip);
	}
	
	public String toString()
	{
		String totalString = (streetAddress + "\t" + city + "\t" + state + "\t" + zip);
        return totalString;
	}
	
	public void setAddress(String sAddress, String c, String s, String z)
	{
		streetAddress = sAddress;
        city = c;
        state = s;
        zip = z;
	}

	public void setStreetAdd(String sAddy){
		streetAddress = sAddy;
	}
	public void setCity(String city2){
		city = city2;
	}
	public void setState(String state2){
		state = state2;
	}
	public void setZip(String zip2){
		zip = zip2;
	}
	
	public String getStreetAddress()
	{
		return streetAddress;
	}

	public String getCity()
	{
		return city;
	}

	public String getState()
	{
		return state;
	}

	public String getZip()
	{
		return zip;
	}
	//copy method 
	public void copyAddress(Address otherAddress)
	{
		otherAddress = new Address();
        otherAddress.streetAddress = streetAddress;
        otherAddress.city = city;
        otherAddress.state = state;
        otherAddress.zip = zip;    
	}
}
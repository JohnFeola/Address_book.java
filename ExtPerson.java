public class ExtPerson extends Person2
{
	private Address address;
	private Date dob;
	private String phoneNumber;
	private String personStatus;
	//default constructor to initialize element under an object ExtPerson, 
	//including inherence of the Person class default constructor, initialize address dob phoneNumber personStatus
	public ExtPerson(){
	
		address.setAddress("exampleST", "exampleCTY", "exampleState", "exampleZIP");
		dob.setDate(1, 1, 1000);
        phoneNumber = "410";
        personStatus = "Empty";
	}
	//constructor with parameters to set address dob phoneNumber personStatus and all the elements inherent from the Person class
	public ExtPerson(String fName, String lName, int month, int day, int year,
					  String street, String c, String s, String z,
					  String phone, String pStatus)
	{
     super.setName(fName, lName);
	 dob = new Date(month, day, year);
	 address = new Address(street, c, s, z);
	 address.setStreetAdd(street);
	//  address.setCity(c);
	//  address.setState(s);
	//  address.setZip(z);
     phoneNumber = phone;
     personStatus = pStatus;
	}
	//method to print address info and person's name inherent from class Person
	public void printAddress()
	{
      address.print();
	}
	//method to print person's info in current class and person's name inherent from class Person
	public void printInfo()
	{
      String name = super.toString();
      System.out.println(name);
      System.out.println(dob);
      System.out.println(phoneNumber);
      address.print();
      System.out.println(personStatus);
	}
	//method to print person's info including name in class Person using setName() setDate() and setAddress()
	public void setInfo(String fName, String lName,
				int month, int day, int year,
				String street, String c, String s,
				String z, String phone, String pStatus)
	{
      super.setName(fName, lName);
      address.setAddress(street, c, s, z);
      dob.setDate(month, day, year);
      phoneNumber = phone;
      personStatus = pStatus;
	}
	//method to copy two person's info
	public void copyExtPerson(ExtPerson otherExtP)
	{
      otherExtP = new ExtPerson();
      otherExtP.setInfo(super.getFirstName(), super.getLastName(), dob.getMonth(), dob.getDay(), dob.getYear(), address.getStreetAddress(),
       address.getCity(), address.getState(), address.getZip(), phoneNumber, personStatus); //idk if this is correct
	}
	//method to used in search() method in class AddressBook to check whether the person's last name exists.
	//Postcondition: name match true, not match false
	public boolean isLastName(String lName)
	{
		if(lName == super.getLastName()){
            return true;
        }else{
            return false;
        }
	}
	//return elements in this class
	public String getStatus()
	{
		return personStatus;
	}

	public String getPhoneNumber()
	{
		return phoneNumber;
	}
	//method to judge if the person's status exists
	//Postcondition: exists true, not exist false
	public boolean isStatus(String status)
	{
		if(status.equals(personStatus)){
            return true;
        }else{
            return false;
        }
        //Hint: you can use the equals() function
	}
	//methods to get elements in this class
	public int getMonth()
	{
	 	return dob.getMonth();
	}

	public int getDay()
	{
	 	return dob.getDay();
	}


	public int getYear()
	{
	 	return dob.getYear();
    }

    public String getStreetAddress()
	{
		return address.getStreetAddress();
	}

	public String getCity()
	{
		return address.getCity();
	}

	public String getState()
	{
		return address.getState();
	}

	public String getZip()
	{
		return address.getZip();
	}

	public void printExtPerson(){
		System.out.println("Name: " + super.getFirstName()+ " " + super.getLastName());
		//String c = address.getCity(); String s = address.getStreetAddress() ; String st = address.getState() ; String z = address.getZip();
		//String str2 = ("Address : " + address.getStreetAddress() + " " + address.getCity() + " " + address.getState() + " " + address.getZip());
		String str2 = address.toString();
		System.out.println(str2);
		//System.out.println("Address : " + address.getStreetAddress() + " " + address.getCity() + " " + address.getState() + " " + address.getZip());
		System.out.println("Birthday : " + dob.toString());
		System.out.println("Phone Number : " + phoneNumber);
		System.out.println("Status : " + personStatus);
		System.out.println("_____________________________________________");
	}
	public String toString(){
		String addy = address.toString();

		return ("Name: " + super.getFirstName()+ " " + super.getLastName() + "\n"
		+ addy + "\n" +
		"Birthday : " + dob.toString() + "\n" +
		"Phone Number : " + phoneNumber + "\n" +
		"Status : " + personStatus + "\n" + 
		"_____________________________________________\n" 
		);


	}
	public void outputExtPerson(String fileName1){
		//use the same techniques as I did in GradeReport


	}
}

//this class was given and is completely finished 
//it has fields for first and last name and the associated methods for setting, getting, etc
public class Person2
{
    private String firstName; //store the first name
    private String lastName;  //store the last name

		//Default constructor
  		//Initialize firstName and lastName to empty string
  	    //Postcondition: firstName = ""; lastName = "";
    public Person2()
    {
 	    firstName = "";
        lastName = "";
    }

      	//Constructor with parameters
      	//Set firstName and lastName according to the parameters
      	//Postcondition: firstName = first; lastName = last;
    public Person2(String first, String last)
    {
 	    firstName = first;
        lastName = last;
    }

	    //Method to output the first name and last name
	    //in the form firstName lastName
    public String toString()
    {
	      return (firstName + " " + lastName);
    }

	      //Method to set firstName and lastName according to
 	      //the parameters
	      //Postcondition: firstName = first; lastName = last;
    public void setName(String first, String last)
    {
          firstName = first;
	      lastName = last;
    }

      //Method to return the firstName
	    //Postcondition: the value of firstName is returned
    public String getFirstName()
    {
        return firstName;
    }

      //Method to return the lastName
	    //Postcondition: the value of lastName is returned
    public String getLastName()
    {
        return lastName;
    }
}

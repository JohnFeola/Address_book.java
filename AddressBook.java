import java.io.*;
import java.util.*;

public class AddressBook
{
	// private ExtPerson pers91 = new ExtPerson("ex", "ex", 1, 12, 13, "ex", "ex", "ex", "ex", "ex", "ex");
	// private ExtPerson pers92 = new ExtPerson("ex", "ex", 1, 12, 13, "ex", "ex", "ex", "ex", "ex", "ex");
	// private ExtPerson pers93 = new ExtPerson("ex", "ex", 1, 12, 13, "ex", "ex", "ex", "ex", "ex", "ex");



	// private ExtPerson[] list = {pers91, pers92, pers93};
	private ExtPerson[] list;

	public AddressBook()
	{
		int x = 6;
		list = new ExtPerson[x];
	}
	//parameterized constructor
	public AddressBook(ExtPerson[] arrayofExtPeople){
           list = arrayofExtPeople;
	}
	//print() prints all content, as is
	public void print()
	{	
		for(int i = 0; i < ((list.length)-2); i++){
			ExtPerson pers = list[i];
			System.out.println(pers.toString());
		}
	}
	//method to print all the content of a person's info in the address book according to a person's lastname
	public void printInfoOf(String lName)
	{
      for(int i = 0; i < (list.length-2); i++){
		  if(list[i].getLastName().equalsIgnoreCase(lName)){
			  list[i].printExtPerson();
		  }
	  }
		
	}//end PrintInfoOf(lName)

	//method to print the first and last name of a person based on his/her status (Person Type in AddressBook.txt)
	public void printNamesWithStatus(String status)
	//throws FileNotFoundException
	{
		for(int i = 0; i < (list.length-3); i++){
			if(list[i].getStatus().equalsIgnoreCase(status)){
				list[i].printExtPerson();
			}
		}
		  
	}//end printnamesw/Status
	
	//method to print a person's info accoring to the index of the array list
	//for example, int 5 in parameter will print the 5th person in the addressbook
	public void printAt(int i)
	{
		list[i-1].printExtPerson();
	}

	//method used to insert the person's info to the array list
	public void insertAt(ExtPerson  eP, int i)
	{
		ExtPerson[] newList = new ExtPerson[list.length+1];
		for(int p = 0; p < i; p++){
			newList[p] = list[p];
		}
		newList[i] = eP;
		for(int b = (i+1); b < list.length; b++){
			newList[b] = list[b-1];
		}
		list = newList;
	}

	//method to return the index of a person's info in the array list according to a person's lastname
	//Post(list[i].getLastName().startsWith("A")): if found return the index of the list, not found return -1
	public int search(String lName)
	{
		for(int i = 0; i < list.length; i++){
			if(list[i].getLastName().equalsIgnoreCase(lName)){
				int x = (i+1);
				return x;
			}
		}
		return (-1);
	}
    //adding search lastName that will return string that says the index
	public String searchlastNameandreturnString(String lName)
	{
		for(int i = 0; i < list.length; i++){
			if(list[i].getLastName().equalsIgnoreCase(lName)){
				String rString = ("The last name you searched for, " + lName + " is index " + (i+1) + "In the Address Book");
				return rString;
			}
		}
		return ("Last Name not Found");
	}

	//sort according to person's lastname
	public void sort()
	{
		int x;
		int Q;
		//if(list.length!=0 && list.length != 1){
		for(int i = 0; i < (list.length-1); i++){
			for(int p = i+1; p < (list.length-2); p++){
				//beginning massive if else to assign int value to first letter or last name for sorting algo below
				if (list[i].getLastName().startsWith("A")){
					 x = 1;
				} else if ((list[i].getLastName().startsWith("B"))) {
					 x = 2;
				} else if ((list[i].getLastName().startsWith("C"))) {
					 x = 3;
				} else if ((list[i].getLastName().startsWith("D"))) {
					 x = 4;
				} else if ((list[i].getLastName().startsWith("E"))) {
					 x = 5;
				} else if ((list[i].getLastName().startsWith("F"))) {
					 x = 6;
				} else if ((list[i].getLastName().startsWith("G"))) {
					 x = 7;
				} else if ((list[i].getLastName().startsWith("H"))) {
					 x = 8;
				} else if ((list[i].getLastName().startsWith("I"))) {
					 x = 9;
				} else if ((list[i].getLastName().startsWith("J"))) {
					 x = 10;
				} else if ((list[i].getLastName().startsWith("K"))) {
					 x = 11;
				} else if ((list[i].getLastName().startsWith("L"))) {
					 x = 12;
				} else if ((list[i].getLastName().startsWith("M"))) {
					 x = 13;
				} else if ((list[i].getLastName().startsWith("N"))) {
					 x = 14;
				} else if ((list[i].getLastName().startsWith("O"))) {
					 x = 15;
				} else if ((list[i].getLastName().startsWith("P"))) {
					 x = 16;
				} else if ((list[i].getLastName().startsWith("Q"))) {
					 x = 17;
				} else if ((list[i].getLastName().startsWith("R"))) {
					 x = 18;
				} else if ((list[i].getLastName().startsWith("S"))) {
					 x = 19;
				} else if ((list[i].getLastName().startsWith("T"))) {
					 x = 20;
				} else if ((list[i].getLastName().startsWith("U"))) {
					 x = 21;
				} else if ((list[i].getLastName().startsWith("V"))) {
					 x = 22;
				} else if ((list[i].getLastName().startsWith("W"))) {
					 x = 23;
				} else if ((list[i].getLastName().startsWith("X"))) {
					 x = 24;
				} else if ((list[i].getLastName().startsWith("Y"))) {
					 x = 25;
				} else if ((list[i].getLastName().startsWith("Z"))) {
					 x = 26;
				} else{
					x = 0;//end if-else for list[i] ...beginning selecting a integer for list[p]
				}
				if (list[p].getLastName().startsWith("A")){
					 Q = 1;
				} else if ((list[p].getLastName().startsWith("B"))) {
					 Q = 2;
				} else if ((list[p].getLastName().startsWith("C"))) {
					 Q = 3;
				} else if ((list[p].getLastName().startsWith("D"))) {
					 Q = 4;
				} else if ((list[p].getLastName().startsWith("E"))) {
					 Q = 5;
				} else if ((list[p].getLastName().startsWith("F"))) {
					 Q = 6;
				} else if ((list[p].getLastName().startsWith("G"))) {
					 Q = 7;
				} else if ((list[p].getLastName().startsWith("H"))) {
					 Q = 8;
				} else if ((list[p].getLastName().startsWith("I"))) {
					 Q = 9;
				} else if ((list[p].getLastName().startsWith("J"))) {
					 Q = 10;
				} else if ((list[p].getLastName().startsWith("K"))) {
					 Q = 11;
				} else if ((list[p].getLastName().startsWith("L"))) {
					 Q = 12;
				} else if ((list[p].getLastName().startsWith("M"))) {
					 Q = 13;
				} else if ((list[p].getLastName().startsWith("N"))) {
					 Q = 14;
				} else if ((list[p].getLastName().startsWith("O"))) {
					 Q = 15;
				} else if ((list[p].getLastName().startsWith("P"))) {
					 Q = 16;
				} else if ((list[p].getLastName().startsWith("Q"))) {
					 Q = 17;
				} else if ((list[p].getLastName().startsWith("R"))) {
					 Q = 18;
				} else if ((list[p].getLastName().startsWith("S"))) {
					 Q = 19;
				} else if ((list[p].getLastName().startsWith("T"))) {
					 Q = 20;
				} else if ((list[p].getLastName().startsWith("U"))) {
					 Q = 21;
				} else if ((list[p].getLastName().startsWith("V"))) {
					 Q = 22;
				} else if ((list[p].getLastName().startsWith("W"))) {
					 Q = 23;
				} else if ((list[p].getLastName().startsWith("X"))) {
					 Q = 24;
				} else if ((list[p].getLastName().startsWith("Y"))) {
					 Q = 25;
				} else if ((list[p].getLastName().startsWith("Z"))) {
					 Q = 26;
				}else{
					Q = 0;
				}
				if(x > Q){
					ExtPerson pHperson = new ExtPerson("ex", "ex", 1, 12, 13, "ex", "ex", "ex", "ex", "ex", "ex");
					pHperson = list[i];
					list[i] = list[p];
					list[p] = pHperson;
				}
			}

			}
		//}else{
			//System.out.println("List empty");
		}
	}



//psuedocode ---
//for above addressBook.java - parse all the information within the given addressData file, and then once all that information is 
//in its proper shits, 

//then I can properly search through an array of people for whatever parameters I am looking for!!!!!



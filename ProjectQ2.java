import java.util.*;
import java.io.*;

public class ProjectQ2{
    public static void main(String[] args)
       throws FileNotFoundException{
        Scanner inFile = new Scanner(new File("AddressData.txt"));
        int i = 0;
        while(inFile.hasNextLine()){
            i++;
        inFile.nextLine();
        }
        int numofEntries = (i/8);
        //System.out.println(numofEntries); //six people in the given txt file for addressbook

        ExtPerson[] ArrayAddressBook = new ExtPerson[8];
        
        inFile = new Scanner(new File("AddressData.txt"));
        //System.out.println(numofEntries); - testing, should be six, WORKS
       for(int z = 0; z < numofEntries; z++){
           //PARSING INFO
            //String[] name = inFile.nextLine().split(" ");
            //String firstName1 = name[0];
            //String lastName2 =name[1];
            if(inFile.hasNext()){
            String firstName1 = inFile.next();
            String lastName2 = inFile.next();
            //System.out.println(firstName1 + " " + lastName2);
            int month1 = inFile.nextInt();
            //System.out.println("month: " + month1);
            int day1 = inFile.nextInt();
            //System.out.println("day :" + day1);
            int year1 = inFile.nextInt();
            //System.out.println("year: " + year1);
            inFile.nextLine();
            String streetAddress = inFile.nextLine();
            //System.out.println("streetAddress: " + streetAddress);
            String city1 = inFile.nextLine();
            //System.out.println("city :" + city1);
            String state1 = inFile.nextLine();
            //System.out.println("State: " + state1);
            String zip1 = inFile.next();
            //System.out.println("zip:" + zip1);
            String phoneNumber1 = inFile.next();
            //System.out.println("phone num : " + phoneNumber1);
            String status = inFile.next();
            //System.out.println("status : "+ status);
            //System.out.println(streetAddress);
            ExtPerson Person5 = new ExtPerson(firstName1, lastName2, month1, day1, year1, streetAddress, city1, state1, zip1, phoneNumber1, status);

            ArrayAddressBook[z] = Person5; 
        }
    }
    //System.out.println(ArrayAddressBook[0]);
    // for (int j = 0; j < ArrayAddressBook.length; j++) {
      // System.out.println(ArrayAddressBook[j]);
    //}
     AddressBook aBook = new AddressBook(ArrayAddressBook);
     Scanner cin = new Scanner(System.in);
     //MENU
     System.out.println("ADDRESS BOOK");
     System.out.println("_____________");
     System.out.println("Please make your selection:");
     System.out.println("____________________________");
     System.out.println("1. Search by last Name");
     System.out.println("2. Sort Alphabetically by last Name");
     System.out.println("3. Add another person");
     System.out.println("4. Print all people of a certain status");
     System.out.println("Please enter, 1, 2, 3, or 4");
     int x = cin.nextInt();
     cin.nextLine();
     while(x < 1 || x > 4){
      System.out.println("Invalid entry, re-enter your selection");
      x = cin.nextInt();
      cin.nextLine();
       }
     if (x == 1) {
       System.out.println("Enter Last Name:");
       String name = cin.nextLine();
       System.out.println("_____________________________"); 
       aBook.printInfoOf(name);
       displayMenu(aBook);
     } else if (x == 2) {
       aBook.sort();
       System.out.println("Your address Book has been sorted by last name, enter 2 if you want to view the sorted Address Book");
       int p = cin.nextInt();
       if(p == 2){
         aBook.print();
         displayMenu(aBook);
       }else{
         //System.out.println("You didn't enter 2, exiting program...");
         displayMenu(aBook);
       }
     } else if (x == 3){
       System.out.println("Enter first name for your new person");
       String fName = cin.nextLine();
       System.out.println("Enter Last name");
       String lName = cin.nextLine();
       System.out.println("Enter dob(MONTH), as integer");
       int month = cin.nextInt();
       cin.nextLine();
       System.out.println("Enter dob(DAY), as integer");
       int day = cin.nextInt();
       cin.nextLine();
       System.out.println("Enter dob(YEAR), as integer");
       int year = cin.nextInt();
       cin.nextLine();
       System.out.println("Enter Street Address");
       String street = cin.nextLine();
       System.out.println("Enter City");
       String c = cin.nextLine();
       System.out.println("Enter State");
       String s = cin.nextLine();
       System.out.println("Enter Zip Code");
       String z = cin.nextLine();
       System.out.println("Enter Phone number");
       String phone = cin.nextLine();
       System.out.println("Enter Status .. ex: Family, Friend, or Business");
       String pStatus = cin.nextLine();
       System.out.println("At what index should this person be entered? : ");
       int o = cin.nextInt();
       while(o < 0 || o > 5){
         System.out.println("Invalid index, try again : enter 0-5");
         o = cin.nextInt();
       }
       ExtPerson newp = new ExtPerson(fName, lName, month, day, year, street, c, s, z, phone, pStatus);
       aBook.insertAt(newp, o);
       System.out.println("Enter 2 to view the address book, with your new entry, if not, you will return to menu");
       int m = cin.nextInt();
       if(m == 2){
         aBook.print();
         displayMenu(aBook);
       }else{
         displayMenu(aBook);
       }
      }else if (x == 4) {
       System.out.println("Enter the status group you want to view: (Family, Friend, or Business");
       String stat = cin.nextLine();
       aBook.printNamesWithStatus(stat);
       displayMenu(aBook);
     }else{
      while(x < 1 || x > 4){
       System.out.println("Invalid entry, re-run program");
       x = cin.nextInt();
       cin.nextLine();
        }
      } // END OF MAIN
    }
  
    //displayMenu, same as above main method, recrusively called within main so that user will be returned to main menu after
    //making the relevant selections and entering the relevant data
  public static void displayMenu(AddressBook aBook) {
    Scanner cin = new Scanner(System.in);
    // MENU
    System.out.println("___________________");
    System.out.println("ADDRESS BOOK MENU");
    System.out.println("___________________");
    System.out.println("Please make your selection:");
    System.out.println("____________________________");
    System.out.println("1. Search by last Name");
    System.out.println("2. Sort Alphabetically by last Name");
    System.out.println("3. Add another person");
    System.out.println("4. Print all people of a certain status");
    System.out.println("Please enter, 1, 2, 3, or 4");
    int x = cin.nextInt();
    cin.nextLine();
    while (x < 1 || x > 4) {
      System.out.println("Invalid entry, re-enter your selection");
      x = cin.nextInt();
      cin.nextLine();
    }
    if (x == 1) {
      System.out.println("Enter Last Name:");
      String name = cin.nextLine();
      System.out.println("_____________________________");
      aBook.printInfoOf(name);
      displayMenu(aBook);
    } else if (x == 2) {
      aBook.sort();
      System.out.println("Your address Book has been sorted by last name! enter 2 if you want to view the sorted Address Book");
      System.out.println("enter any other value, and you will be returned to main menu");
      int p = cin.nextInt();
      if (p == 2) {
        aBook.print();
        displayMenu(aBook);
      } else {
        displayMenu(aBook);
      }
    } else if (x == 3) {
      System.out.println("Enter first name for your new person");
      String fName = cin.nextLine();
      System.out.println("Enter Last name");
      String lName = cin.nextLine();
      System.out.println("Enter dob(MONTH), as integer");
      int month = cin.nextInt();
      cin.nextLine();
      System.out.println("Enter dob(DAY), as integer");
      int day = cin.nextInt();
      cin.nextLine();
      System.out.println("Enter dob(YEAR), as integer");
      int year = cin.nextInt();
      cin.nextLine();
      System.out.println("Enter Street Address");
      String street = cin.nextLine();
      System.out.println("Enter City");
      String c = cin.nextLine();
      System.out.println("Enter State");
      String s = cin.nextLine();
      System.out.println("Enter Zip Code");
      String z = cin.nextLine();
      System.out.println("Enter Phone number");
      String phone = cin.nextLine();
      System.out.println("Enter Status .. ex: Family, Friend, or Business");
      String pStatus = cin.nextLine();
      System.out.println("At what index should this person be entered? : ");
      int o = cin.nextInt();
      while (o < 0 || o > 5) {
        System.out.println("Invalid index, try again : enter 0-5");
        o = cin.nextInt();
      }
      ExtPerson newp = new ExtPerson(fName, lName, month, day, year, street, c, s, z, phone, pStatus);
      aBook.insertAt(newp, o);
      System.out.println("Enter 2 to view the address book, with your new entry");
      int m = cin.nextInt();
      if (m == 2) {
        aBook.print();
        displayMenu(aBook);
      }else{
        displayMenu(aBook);
      }
    } else if (x == 4) {
      System.out.println("Enter the status group you want to view: (Family, Friend, or Business");
      String stat = cin.nextLine();
      aBook.printNamesWithStatus(stat);
      displayMenu(aBook);
    } else {
      while (x < 1 || x > 4) {
        System.out.println("Invalid entry, re-run program");
        x = cin.nextInt();
        cin.nextLine();
      }
    }
  }


    




     //aBook.print();   //works
     //aBook.printInfoOf("Tomek"); //works
     //aBook.printNamesWithStatus("Family"); //works
     //ExtPerson newPerson2 = new ExtPerson("Billy", "Bob", 12, 1, 1999, "West", "Baltimore", "MD", "21286", "4432029091", "family");
     //aBook.insertAt(newPerson2, 2); // works
     //aBook.print();
     //aBook.sort(); //works
     //aBook.print();

     //then implement and call sortbyLastName method
     //then implement and call insertAt method

     
    //String diditwork = ArrayAddressBook[0].getLastName();  //works
    //System.out.println(diditwork);  //works
     //String testing22 = ArrayAddressBook[3].getCity(); //testing - 
     //System.out.println(testing22); //testing - works // so all information is parsed correctly into an array of ExtPersons
     //System.out.println(numofEntries); ///testing - 6 people



       }
      
    
    

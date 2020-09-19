package com.company;

import java.util.Scanner;

public class MainAddressBookClass
{
public static void main (String args[])
{
    //System.out.println("Welcome in AddressBook");
    Scanner scanner = new Scanner(System.in);
     AddressBookImplementation adress = new AddressBookImplementation();
        boolean check = true;
        while (check == true)
        {
            System.out.println("1.ADD  2.DISPLAY  3.EDIT  4.DELETE  5.SORT BY NAME/ZIP  6.Sort BY ZIP 7.view by city or state  8.search person in city or state6.QUIT");
            int option = scanner.nextInt();
            switch (option)

            {
                case 1:
                    adress.add();
                    break;

                case 2:
                    adress.display();
                    break;
               case 3:
                    System.out.println("enter person's frist name");
                    String name=scanner.next();
                    adress.edit(name);
                    break;

                case 4:
                    System.out.println("enter person's name");
                    String firstName=scanner.next();
                    adress.deletePersonData(firstName);
                    System.out.println("You have sucessfully deleted person's data");
                    break;
               
               case 5:
                    adress.sortByfirstName();

                case 6:
                    adress.sortByZipCode();

                case 7:
                    System.out.println("press 1 for view by city and 2 for view by state");
                    int localOption= scanner.nextInt();
                    if (localOption == 1)
                    {
                        System.out.println("enter city name");
                        String city = scanner.next();
                        adress.viewByCity(city);
                        break;
                    }
                    else
                    {
                        System.out.println("enter state name");
                        String state = scanner.next();
                        adress.viewByState(state);
                        break;
                    }
                case 8:
                    System.out.println("press 1 for search person in city and 2 for search person in  state");
                    int localOption1 = scanner.nextInt();
                    if (localOption1 == 1)
                    {
                        System.out.println("enter person firstName");
                        String firstname = scanner.next();
                        adress.searchPersonInCity(firstname);
                        break;
                    }
                    else {
                        System.out.println("enter state firstName");
                        String firstname = scanner.next();
                        adress.searchPersonInState(firstname);
                        break;
                    }  

                case 9:
                    check = false;
                    break;

            }
        }
}
}

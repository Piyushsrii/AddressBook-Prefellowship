package com.company;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class AddressBookImplementation implements InterFaceAddressBook  {

    Scanner scanner = new Scanner(System.in);
    List<PersonInfo> list = new LinkedList<PersonInfo>();

    public void addMultiplePerson() {
        System.out.println("enter your first name:");
        String firstName = scanner.nextLine();
         for(int i=0; i<list.size(); i++)
        {
            if(list.get(i).getFirstName().equalsIgnoreCase(firstName)){
                System.out.println("This name is already exist");
                return;
            }
        }
        System.out.println("enter your last name:");
        String lastName = scanner.nextLine();
        System.out.println("enter your address");
        String address = scanner.nextLine();
        System.out.println("enter your city");
        String city = scanner.nextLine();
        System.out.println("enter your state");
        String state = scanner.nextLine();
        System.out.println("enter your phone");
        long mobileNo = scanner.nextLong();
        System.out.println("enter your zip code");
        scanner.next();
        String zip = scanner.next();

        PersonInfo person = new PersonInfo(firstName, lastName, address, city, state, mobileNo, zip);
        list.add(person);
    }

       public void edit(String firstName)
    {
            for (int i = 0; i < list.size(); i++) {
            PersonInfo person = list.get(i);
            Scanner scanner = new Scanner(System.in);

            System.out.println("Hi " + person.getFirstName() + " please enter your  new Address");
            String address = scanner.nextLine();
            person.setAddress(address);

            System.out.println("Hi " + person.getFirstName() + " please enter your  new city");
            String city = scanner.nextLine();
            person.setCity(city);

            System.out.println("Hi " + person.getFirstName() + " please enter your  new state");
            String state = scanner.nextLine();
            person.setState(state);

            System.out.println("Hi " + person.getFirstName() + " please enter your  new Zip Code");
            String zip = scanner.nextLine();
            person.setPincode(zip);

            System.out.println("Hi " + person.getFirstName() + " please enter your  new Phone No");
            int PhoneNo = scanner.nextInt();
            person.setMobileNo(PhoneNo);


            System.out.println("Hi " + person.getFirstName() + " you have sucessfully updated");
        }

    }


      @Override
    public void deletePersonData(String firstName) 
    {
            for (int i = 0; i < list.size(); i++)
            {
                if (list.get(i).getFirstName().equalsIgnoreCase(firstName))
                {
                    PersonInfo person = list.get(i);
                    list.remove(person);
                }
            }
        }

        @Override
        public void sortByfirstName()
        {
        Collections.sort(list,(p1, p2)  -> p1.getFirstName().compareTo(p2.getFirstName()));
        System.out.println(list);
    }

    public void display() {

        for (PersonInfo person : list)
        {
            System.out.println(person);
        }

    }

    }

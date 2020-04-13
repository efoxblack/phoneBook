package com.zipcodewilmington.phonebook;

public class PhoneBookTester {

    public static void main(String[] args) {
        // Initialization of phonebook object
        PhoneBook phoneBook = new PhoneBook();

        String name = "Joey";
        String[] phoneNumbers = {"(506) 406-1934", "(617) 567-5818", "(506) 489-8278", "(617) 689-7692"};
        // Adding the user "Joey" to the phoneBook object along with his array of phone numbers
        phoneBook.addAll(name, phoneNumbers);

        System.out.println(phoneBook.toString());
        System.out.println("=============================");
        // Adding the phonebook user "Louise"
        phoneBook.add("Louise", "(304) 561-6812");

        System.out.println(phoneBook.toString());
        System.out.println("=============================");
        // Removing the phonebook user by the set name
        phoneBook.remove("Louise");

        System.out.println(phoneBook.toString());
        System.out.println("=============================");
        // Checking if there is a user by the given name
        System.out.println(phoneBook.hasEntry("Joe"));
        System.out.println("=============================");

        phoneBook.add("Devin", "(506) 196-2681");
        phoneBook.add("Mariyam", "(706) 782-6891");
        phoneBook.add("Mert", "(455) 625-1968");
        // Finding the phone number associated with the given name
        System.out.println(phoneBook.lookup("Mariyam"));
        System.out.println("=============================");

        // Finding the name associated with the given phone number
        System.out.println(phoneBook.reverseLookup("(455) 625-1968"));
        System.out.println("=============================");

        // Listing out all of the users names in an array
        System.out.println(phoneBook.getAllContactNames());
        System.out.println("=============================");

        // Returns out the current map object
        System.out.println(phoneBook.getMap());
        System.out.println("=============================");

    }
}

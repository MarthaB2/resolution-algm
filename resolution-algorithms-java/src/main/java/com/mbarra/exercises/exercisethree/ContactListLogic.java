package com.mbarra.exercises.exercisethree;

import java.util.Scanner;

public class ContactListLogic {
    public static void exerciseThree() {
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter("\n");
        ContactList cl = new ContactList(3);

        String name;
        int phone;
        Contact c;

        int option;

        do {
            showMenuC();
            option = sc.nextInt();

            switch (option) {
                case 1:
                    System.out.print("Enter name: ");
                    name = sc.next();

                    System.out.print("Enter phone: ");
                    phone = sc.nextInt();

                    c = new Contact(name, phone);

                    cl.addContact(c);
                    break;


                case 2:
                    System.out.print("Enter name: ");
                    name = sc.next();
                    c = new Contact(name);
                    if (cl.contactExists(c) != 0)
                        System.out.println("Contact exists");
                    else
                        System.out.println("No contact exists");

                    break;

                case 3:
                    cl.listContacts();
                    break;

                case 4:
                    System.out.print("Enter name: ");
                    name = sc.next();

                    cl.searchContact(name);
                    break;

                case 5:
                    System.out.print("Enter name: ");
                    name = sc.next();
                    c = new Contact(name);

                    cl.deleteContact(c);

                    break;

                case 6:
                    if (cl.fullList() != 0)
                        System.out.println("The list is full");
                    else
                        System.out.println("The list is not full");

                    break;

                case 7:
                    System.out.println("There are" + cl.hollowFree() + " free contacts");
                    break;

                case 8:
                    System.out.println("Exiting the program.");
                    break;

                default:
                    System.out.println("Invalid option. Please try again.");
            }
        } while (option != 8);

    }

    public static void showMenuC() {
        System.out.println("--------------------Exercise three--------------------");
        System.out.println("1. Add contact");
        System.out.println("2. Contact exists");
        System.out.println("3. List contacts");
        System.out.println("4. Search contact");
        System.out.println("5. Delete contact ");
        System.out.println("6. Full list");
        System.out.println("7. Contacts available");
        System.out.println("8. Exit");
        System.out.print("Select an option:");
    }


}

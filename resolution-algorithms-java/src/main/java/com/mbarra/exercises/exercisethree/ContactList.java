package com.mbarra.exercises.exercisethree;

public class ContactList {

    private Contact[] contacts;


    public ContactList() {
        this.contacts = new Contact[10]; //by default
    }

    public ContactList(int ce) {
        this.contacts = new Contact[ce]; //the size we want.
    }


    public void addContact(Contact c) {
        if (contactExists(c) == 1) {
            System.out.println("The contact with this name already exists");
        } else if (fullList() != 0) {
            System.out.println("The contact list is full, no more contacts can be entered.");
        } else {

            int found = 0;
            for (int i = 0; i < contacts.length && found != 1; i++) //The length property of an array in Java returns the length of the array, that is, the number of elements it can contain.
            {
                if (contacts[i] == null) // Inside the loop, it checks if the element at position i of the array contacts is null, that is, if there is no Contact object at that position.
                {
                    contacts[i] = c;
                    found = 1;
                }
            }

            if (found != 0) {
                System.out.println("Added.");
            } else {
                System.out.println("Could not be added.");
            }
        }

    }

    public int contactExists(Contact c) {

        for (int i = 0; i < contacts.length; i++) {

            if (contacts[i] != null && c.equals(contacts[i]) != 0) {
                return 1;
            }
        }
        return 0;

    }

    public int fullList() {

        for (int i = 0; i < contacts.length; i++) {
            if (contacts[i] == null) {
                return 0;
            }
        }

        return 1;

    }

    public void listContacts() {
        int i, amount;
        amount = hollowFree();
        if (amount == contacts.length) {
            System.out.println("No contacts");
        } else {
            for (i = 0; i < contacts.length; i++) {
                if (contacts[i] != null) {
                    System.out.println(contacts[i]);
                }
            }
        }
    }

    public int hollowFree() {
        int i, amount = 0;

        for (i = 0; i < contacts.length; i++) {
            if (contacts[i] == null)
                amount++;
        }
        return amount;
    }

    public void searchContact(String nombre) {
        int i, found = 0;
        for (i = 0; i < contacts.length && found == 0; i++) {
            if (contacts[i] != null && contacts[i].getName().trim().equalsIgnoreCase(nombre.trim())) {
                System.out.println("Phone: " + contacts[i].getPhone());
                found = 1;
            }
        }

        if (found == 0) {
            System.out.println("Contact not found");
        }
    }

    public void deleteContact(Contact c) {
        int found = 0, i;

        for (i = 0; i < contacts.length && found == 0; i++) {
            if (contacts[i] != null && contacts[i].equals(c) == 1) {
                //deleteContactInPosition(i);
                contacts[i] = null;
                found = 1;
            }
        }

        if (found != 0) {
            System.out.println("The contact has been removed.");
        } else {
            System.out.println("The contact has not been deleted because it does not exist in the list.");
        }
    }


/*
    private void deleteContactInPosition(int position)
    {
        if (position >= 0 && position < contacts.length) {
            System.arraycopy(contacts, position + 1, contacts, position, contacts.length - 1 - position);
            contacts[contacts.length - 1] = null;
        }
    }

*/


}

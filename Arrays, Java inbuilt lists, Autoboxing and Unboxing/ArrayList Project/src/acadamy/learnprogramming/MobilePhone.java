package acadamy.learnprogramming;

import java.util.ArrayList;

public class MobilePhone {
    private String myNumber;
    private ArrayList<Contacts> myContacts;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.myContacts = new ArrayList<Contacts>();
    }

    //Store contacts function
    public boolean addNewContact(Contacts contact){
        if(findContact(contact.getName()) >= 0){
            System.out.println("Contact is already on file.");
            return false;
        }
        myContacts.add(contact);
        return true;
    }

    //Modify contacts function
    public boolean updateContact(Contacts oldContact, Contacts newContact){
        int foundPosition = findContact(oldContact);
        if(foundPosition < 0){
            System.out.println(oldContact.getName() + ", was not found");
            return false;
        }else if(findContact(newContact.getName()) != -1){
            System.out.println("Contact with name + " + newContact.getName() +
                    " already exists. Updated failed.");
            return false;
        }

        this.myContacts.set(foundPosition, newContact);
        System.out.println(oldContact.getName() + ", was replaced with " + newContact.getName());
        return true;
    }

    //Remove contacts functions
    public boolean removeContact(Contacts contact){
        int foundPosition = findContact(contact);
        if(foundPosition < 0){
            System.out.println(contact.getName() + ", was not found");
            return false;
        }
        removeContact(foundPosition);
        System.out.println(contact.getName() + " was deleted.");
        return true;
    }

    private void removeContact(int position){
        this.myContacts.remove(position);
    }

    //Query contacts functions
    private int findContact(String contactName){
        for(int i = 0; i < myContacts.size(); i++){
            Contacts contact = this.myContacts.get(i);
            if(contact.getName().equals(contactName)){
                return i;
            }
        }
        return -1; //if it wasn't found
    }

    private int findContact(Contacts contact){
        return this.myContacts.indexOf(contact);
    }

    public String queryContact(Contacts contact){
        if(findContact(contact) >= 0){
            return contact.getName();
        }
        return null;
    }

    public Contacts queryContact(String name){
        int position = findContact(name);
        if(position >= 0){
            return this.myContacts.get(position);
        }
        return null;
    }

    public void printContacts(){
        System.out.println("Contact List:\n");
        for(int i = 0; i < this.myContacts.size(); i++){
            System.out.println((i+1) + "." +
                    this.myContacts.get(i).getName() + " -> " +
                    this.myContacts.get(i).getPhoneNumber());
        }
    }
}

package com.example.demo;

import java.util.ArrayList;
import java.util.List;

public class ContactBusiness {
   
    public List<Contact>getContactList(){
        List<Contact> listContact = new ArrayList<>();


        listContact.add(new Contact("John Person", "person@gmail.com", "USA"));
        listContact.add(new Contact("Mary People", "people@gmail.com", "USA"));
        listContact.add(new Contact("Tim Human", "human@gmail.com", "USA"));
        listContact.add(new Contact("Mike Mutant", "mutant@gmail.com", "USA"));


        return listContact;
    }
}
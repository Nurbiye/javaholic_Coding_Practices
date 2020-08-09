package customClass;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Contacts {
    String firstName;
    String lastName;
    String company;
    String phoneNumber;
    String emails;
    String DOB;


    public  ArrayList<customClass.Contacts> contactBuilder(String firstName, String lastName, String company, String phoneNumber, String emails, String DOB ){
        ArrayList<customClass.Contacts>contactList=new ArrayList<>();
        customClass.Contacts contact=new customClass.Contacts();
        firstName=firstName.substring(0,1).toUpperCase()+ firstName.substring(1).toLowerCase();
        contact.firstName=firstName;
        lastName=lastName.substring(0,1).toUpperCase()+ lastName.substring(1).toLowerCase();
        contact.lastName=lastName;
        int space=company.indexOf(" ");
        company=company.substring(0,1).toUpperCase()+company.substring(1);
        contact.company=company;
        phoneNumber="+1 ("+phoneNumber.substring(0,3)+") "+phoneNumber.substring(3,6)+"-"+phoneNumber.substring(6);
        contact.phoneNumber=phoneNumber;
        emails=emails.toLowerCase();
        contact.emails=emails;
        DateTimeFormatter DTF=DateTimeFormatter.ofPattern("MMMM, dd yyyy");
        int month=Integer.parseInt(DOB.substring(0,2));
        int day=Integer.parseInt(DOB.substring(3,5));
        int year=Integer.parseInt(DOB.substring(6));
        contact.DOB= DTF.format(LocalDate.of(year,month,day));
        contactList.add(contact);
        return contactList;



    }


}

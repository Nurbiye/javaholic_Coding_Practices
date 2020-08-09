package customClass;

import java.util.*;

public class NewContacts {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Contacts contact=new Contacts();
        ArrayList<Contacts>contactList;
        int count=1;
        while(true){
            System.out.println("Please enter your contact "+count+"'s first name: ");
            String firstName=sc.next();
            System.out.println("Please enter your contact "+count+"'s last name: ");
            String lastName=sc.next();
            sc.nextLine();
            System.out.println("Please enter your contact "+count+"'s company name:");
            String company=sc.nextLine();
            System.out.println("Please enter your contact "+count+"'s phone number");
            System.out.println("'Please only enter the 10 digits'");
            String phoneNumber=sc.next();
            while(phoneNumber.length()!=10){
                System.out.println("Invalid Phone number");
                System.out.println("'Please only enter the 10 digits'");
                phoneNumber= sc.next();
            }
            System.out.println("Please enter your contact "+count+"'s email address");
            String emails=sc.next();
            while(!(emails.contains("@")&&emails.contains(".com"))){
                System.out.println("Invalid email");
                System.out.println("Please enter valid email and it has to include '@'");
                emails=sc.next();
            }
            System.out.println("Please enter your contact "+count+"'s date of birth");
            System.out.println("Please enter as 'mm/dd/yyyy' format only");
            String DOB=sc.next();
            while(DOB.length()!=10){
                System.out.println("Invalid format, Please re-enter");
                DOB=sc.next();
            }
            contactList=contact.contactBuilder(firstName,lastName,company,phoneNumber,emails,DOB);
            System.out.println("Would you like to add more contacts? Please enter 'Yes or No' ");
            String toContinue=sc.next();
            if(toContinue.equalsIgnoreCase("no")){
                for(Contacts each:contactList){
                    System.out.println(each.firstName+" "+each.lastName);
                    System.out.println(each.company);
                    System.out.println(each.phoneNumber);
                    System.out.println(each.emails);
                    System.out.println(each.DOB);
                }
                break;
            }


        }














//        ArrayList<Contacts>contactList=new ArrayList<>();
//        int i=1; // i stand for number of contact
//
//        while(true) {
//            Contacts contact=new Contacts();
//
//            System.out.println("Enter the first name of your contact"+i+": ");
//            contact.firstName = sc.next();
//            System.out.println("Enter the  last name of your contact"+i+": ");
//            contact.lastName = sc.next();
//            sc.nextLine();
//            System.out.println("Enter the company name of your contact"+i+": ");
//            contact.company = sc.nextLine();
//            System.out.println("Enter the phone number of your contact"+i + ": "+
//                    "\nformat requirement: digit only and max of 10 digits");
//            contact.phoneNumber = sc.next();
//            System.out.println("Enter the email address of your contact"+i+": ");
//            contact.emails = sc.next();
//            System.out.println("Enter the date of birth 'MM/DD/YYYY' of your contact"+i+": ");
//            contact.DOB=sc.next();
//            i++;
//            contactList.add(contact);
//            System.out.println("Do you want to continue? enter 'yes' or 'no'");
//            String ifContinue=sc.next();
//            if(ifContinue.equalsIgnoreCase("no")){
//                System.out.println("Thank you and here is your contact list");
//                break;
//            }
//
//        }

    }
}

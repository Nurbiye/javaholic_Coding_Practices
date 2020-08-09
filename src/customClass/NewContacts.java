package customClass;

import java.util.*;

public class NewContacts {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Contacts contact=new Contacts();
        ArrayList<Contacts>contactList;

        while(true){
            System.out.println("Please enter your contact's first name: ");
            String firstName=sc.next();
            System.out.println("Please enter your contact "+firstName+"'s last name: ");
            String lastName=sc.next();
            sc.nextLine();
            System.out.println("Please enter your contact "+firstName+"'s company name:");
            String company=sc.nextLine();
            System.out.println("Please enter your contact "+firstName+"'s phone number");
            System.out.println("'Please only enter the 10 digits'");
            long phone=sc.nextLong();
            String phoneNumber=String.valueOf(phone);
            while(String.valueOf(phone).length() != 10){
                System.out.println("Invalid Phone number");
                System.out.println("'Please only enter the 10 digits'");
                phone=sc.nextLong();
            }
            System.out.println("Please enter your contact "+firstName+"'s email address");
            String emails=sc.next();
            while(!(emails.contains("@")&&emails.contains("."))){
                System.out.println("Invalid email");
                System.out.println("Please enter valid email and it has to include '@'");
                emails=sc.next();
            }
            System.out.println("Please enter your contact "+firstName+"'s date of birth");
            System.out.println("Please enter as 'mm/dd/yyyy' format only");
            String DOB=sc.next();
            while(DOB.length()!=10){
                System.out.println("Invalid format, Please re-enter");
                DOB=sc.next();
            }
            contactList=contact.contactBuilder(firstName,lastName,company,phone,emails,DOB);
            System.out.println("Would you like to add more contacts? Please enter 'Yes or No' ");
            String toContinue=sc.next();
            if(toContinue.equalsIgnoreCase("no")){
                for(Contacts each:contactList){
                    System.out.println("Full Name: "+each.firstName+" "+each.lastName);
                    System.out.println("Company: "+each.company);
                    System.out.println("Phone number:"+each.phoneNumber);
                    System.out.println("Email: "+each.emails);
                    System.out.println("Date of Birth: "+each.DOB);
                }
                break;
            }


        }

    }
}

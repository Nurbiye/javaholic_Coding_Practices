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

    }
}

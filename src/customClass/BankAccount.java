package customClass;

public class BankAccount {
    String accountHolder;
    long accountNumber;
    double balance;




    public void setAccountInfo(String name,long number,double theBalance){ // custom method==> assigning to values to instance variables
        accountHolder=name;
        accountNumber=number;
        balance=theBalance;

    }
    public void showBalance(){
        System.out.println(accountHolder+accountNumber+balance);
    }

    public void withdraw(double cashOut){
        String message="";
        String num=""+accountNumber; // convert everything to string
        String last3Digit=num.substring(num.length()-3); // the last three index of string
        if(cashOut>balance&&balance>0){
            balance=balance-cashOut-35;
            message=accountHolder+" your account ending "+last3Digit+" is overdrawn and there is a charge of $35 and the balance is $"+balance;
        }else if(balance>cashOut&&balance>0){
            balance=balance-cashOut;
            message="your account ending "+last3Digit+" available balance is $"+balance;
        }else{ // balance become less than
            message="no available balance to withdraw";
        }
        System.out.println(message);
    }

    public void deposit(double cashIn){
        String num=""+accountNumber; // convert everything to string
        String last3Digit=num.substring(num.length()-3); // the last three index of string
        balance=balance+cashIn;
        System.out.println(accountHolder+" your account ending "+last3Digit+" available balance is $"+balance);
    }


}

import java.util.*;

public class ATM_Complete_Project {
    public static void main(String[] args) {

        int pin = 1234;
        int balance = 10000;

        int addAmount = 0;
        int takeAmount = 0;

        String name;

        Scanner sc = new Scanner(System.in);

        // we have to take an input by an user

        System.out.println("Enter your Pin Number: ");
        int password = sc.nextInt();

        //code Arrangement shift+alt+f

        if(password == pin){
            System.out.println("Enter your Name: ");
            name = sc.next();
            System.out.println("Welcome " + name);

            while(true) {
                System.out.println("Press 1 to check your balance");
                System.out.println("Press 2 to add Amount");
                System.out.println("Press 3 to take Amount");
                System.out.println("press 4 to take Receipt");
                System.out.println("press 5 to EXIT");

                int opt = sc.nextInt();
                switch(opt) {
                    case 1:
                    System.out.println("Your Current Balance is " +balance);
                    break;
                    case 2:
                    System.out.println("How much Amount did you want to ADD to your account");
                    addAmount = sc.nextInt();
                        System.out.println("Sucessfully Credited");
                        balance = addAmount + balance;
                        //10000 = 100 + 10000
                        //balance = 10100
                        break;
                    case 3:
                        System.out.println("How much amount did you want to take ");
                        takeAmount = sc.nextInt();
                        if(takeAmount > balance) {
                            System.out.println("Your Balance is Insufficient");
                            System.out.println("Try less than your available Balance");
                        }
                        else {
                            System.out.println("Sucessfully taken");
                            balance = balance - takeAmount;
                            //balance = 10100 = 10100 -100
                            //balance = 10000
                        }
                        break;
                    case 4:
                        System.out.println("Welcome to All in One Mini ATM");
                        System.out.println("Available Balance is "+balance);
                        System.out.println("Amount Deposited:   "+addAmount);
                        System.out.println("Amount Taken:   "+takeAmount);
                        System.out.println("Thanks for Coming");
                        break;
                }
            }
        }
        else {
            System.out.println("Incorrect Pin Number");
        }

    }
}
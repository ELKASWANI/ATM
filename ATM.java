/*
An ATM machine simulator. Create an Account class with all the attributes
that characterize a bank account, and all the methods needed, including
toString() and equals(). You have provide operations such as deposit,
withdraw, transfer between accounts and print balance. Assume the ATM
only manages 3 accounts. Challenge: the account could be configured to
always withdraw money with the least amount of bills possible. For
instance, if 90 CAD is requested, the least amount would be 1 bill of 50 CAD
and 2 bills of 20 CAD.
Written By MOHAMMAD EL KASWANI

i did two programs because i have a problem,
i can't add those two programs together and
if I add them together, I found  that there is
too many mistakes i can't fix them so i decide
to do two separate  programs. THANKS
*/
import java.util.Scanner;
public class ATM {
    public static void main(String[] args) {

        //declaring variables
        int balance = 1000, withdraw, deposit;
        //h: Hundred, f: fiftey, t: twenty, T: Ten, F: Five, o: One
        int h=0, f=0, t=0, T=0, F=0, Two=0, o=0;

        String userName = "ELKASWANI";
        String password = "1234";
        String bankName = "TD Bank";

        Scanner bankScanner = new Scanner(System.in);
        System.out.println("Welcome to " + bankName);

        //getting user input
        System.out.println("Please Enter Your PIN Number ");
        String enteredPassword = bankScanner.nextLine();

        // printing
        if (enteredPassword.equalsIgnoreCase(password)) {
            System.out.println("Account Name Holder : " + userName);
            Scanner s = new Scanner(System.in);
            while (true) {
                System.out.println("Automated Teller Machine");
                System.out.println("Choose 1 for Withdraw");
                System.out.println("Choose 2 for Deposit");
                System.out.println("Choose 3 for Check Balance");
                System.out.println("Choose 4 for EXIT");
                System.out.print("Choose the operation you want to perform:");
                int n = s.nextInt();
                switch (n) {
                    case 1:
                        System.out.print("Enter money to be withdrawn:");
                        withdraw = s.nextInt();

                        while (withdraw>=100){
                        withdraw -=100;
                        h++;
                    }
                        while (withdraw>=50){
                            withdraw -=50;
                            f++;
                        }
                        while (withdraw>=20){
                            withdraw -=20;
                            t++;
                        }
                        while (withdraw>=10) {
                            withdraw -=10;
                            T++;
                        }
                        while (withdraw>=5) {
                            withdraw -=5;
                            F++;
                        }
                        while (withdraw>=2){
                            withdraw -=2;
                            Two++;
                        }
                        while (withdraw>=1){
                            withdraw -=1;
                            o++;
                        }
                        // printing
                        System.out.println("Hundred dollar bills: " + h);
                        System.out.println("Fifty dollar bills: " + f);
                        System.out.println("Twenty dollar bills: " + t);
                        System.out.println("Ten dollar bills: " + T);
                        System.out.println("Five dollar bills: " + F);
                        System.out.println("Two dollar bills: " + Two);
                        System.out.println("one dollar bills: " + o);

                        if (balance >= withdraw) {
                            balance = balance - withdraw;
                            System.out.println("Please collect your money");
                        } else {
                            System.out.println("Insufficient Balance");
                        }
                        System.out.println("");
                        break;

                    case 2:
                        System.out.print("Enter money to be deposited:");
                        deposit = s.nextInt();
                        balance = balance + deposit;
                        System.out.println("Your Money has been successfully depsited");
                        System.out.println("");
                        break;

                    case 3:
                        System.out.println("Balance : " + balance);
                        System.out.println("");
                        break;

                    case 4:
                        System.exit(0);
                }
            }
        }
    }
}
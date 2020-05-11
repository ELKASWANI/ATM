/*
An ATM machine simulator. Create an Account class with all the attributes
that characterize a bank account, and all the methods needed, including
toString() and equals(). You have provide operations such as deposit,
withdraw, transfer between accounts and print balance. Assume the ATM
only manages 3 accounts. Challenge: the account could be configured to
always withdraw money with the least amount of bills possible. For
instance, if 90 CAD is requested, the least amount would be 1 bill of 50 CAD
and 2 bills of 20 CAD.
it's an Account class with all the attributes that characterize a bank account, and all the methods needed.
Written By MOHAMMAD EL KASWANI

i did two programs because i have a problem,
i can't add those two programs together and
if I add them together, I found  that there is
too many mistakes i can't fix them so i decide
to do two separate  programs. THANKS
*/
import java.util.Scanner;
public class Main {
    private double currentBal = 1000;
    Scanner input = new Scanner(System.in);

    public void mainMenu() {

        //declaring variables
        int selection;
        System.out.print("Welcome to the Automated Teller Machine!\n");
        System.out.println("Select from the following menu options below:\n");
        System.out.println("========================");
        System.out.println("| [1]  Check Balance   |");
        System.out.println("| [2]  Withdrawal      |");
        System.out.println("| [3]  Deposit         |");
        System.out.println("| [4]  Exit            |");
        System.out.println("========================");
        System.out.print("Please select your option now: ");
        selection = input.nextInt();
        switch (selection) {
            case 1:
                viewBalance();
                break;
            case 2:
                withdraw();
                break;
            case 3:
                depositFunds();
                break;
            case 4:
                System.out.println("Thank you for using ATM! \n Goodbye! \n");
        }
    }

    public void viewBalance() {

        //declaring variables
        int selection1;
        System.out.println("You have selected Balance.\n");
        System.out.println("\t-- Your Current Balance is:$ " + currentBal);
        System.out.println("Return to main menu? \n [1] for YES \n");
        selection1 = input.nextInt();
        switch (selection1) {
            case 1:
                mainMenu();
                break;
        }
    }

    public void withdraw() {

        //declaring variables
        int withdrawSelection;
        System.out.println("Amount to withdraw: ");
        System.out.println("[1] - $20");
        System.out.println("[2] - $40");
        System.out.println("[3] - $50");
        System.out.println("[4] - $100");
        System.out.println("[5] - MAIN MENU");
        System.out.print("Please select your option now: ");
        withdrawSelection = input.nextInt();
        switch (withdrawSelection) {
            case 1:
                accountWithdraw(20);
                mainMenu();
                break;
            case 2:
                accountWithdraw(40);
                mainMenu();
                break;
            case 3:
                accountWithdraw(50);
                mainMenu();
                break;
            case 4:
                accountWithdraw(100);
                mainMenu();
                break;
            case 5:
                mainMenu();

                break;
        }
    }

    public void accountWithdraw(int withdraw) {
        currentBal = currentBal - withdraw;
        System.out.println("Please take your funds.");
    }

    public void depositFunds() {

        //declaring variables
        int addSelection;
        System.out.println("Amount to deposit: ");
        System.out.println("[1] - $20");
        System.out.println("[2] - $40");
        System.out.println("[3] - $50");
        System.out.println("[4] - $100");
        System.out.println("[5] - MAIN MENU");
        System.out.print("Please select your option now: ");
        addSelection = input.nextInt();
        switch (addSelection) {
            case 1:
                accountAdd(20);
                mainMenu();
                break;
            case 2:
                accountAdd(40);
                mainMenu();
                break;
            case 3:
                accountAdd(50);
                mainMenu();
                break;
            case 4:
                accountAdd(100);
                mainMenu();
                break;
            case 5:
                mainMenu();
                break;
        }
    }

    public void accountAdd(int depositFunds) {
        currentBal = currentBal + depositFunds;
        System.out.println("Thank you.");
    }

    public static void main(String[] args) {
        new Main();
    }
}

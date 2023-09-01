import java.util.Scanner;
class account{
    public static double amount=0;
}

public class atmMachine {
    public static void deposit(double amount){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the amount you want to deposit: ");
        double depoMoney= sc.nextDouble();
        if(depoMoney>0)
            amount+=depoMoney;
        else
            System.out.println("Enter a valid amount!");
        System.out.println("Money added successfully!");
        transaction(amount);
        sc.close();

    }
    public static void withdraw(double amount){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the amount you want to withdraw: ");
        double wdMoney=sc.nextDouble();
        if(amount>0 && amount>=wdMoney){
            amount-=wdMoney;
            System.out.println("Money withdrawn successfully!");
        }else
            System.out.println("Insufficient balance! Please enter a valid amount!");
        transaction(amount);
        sc.close();

    }
    public static void checkBalance(double amount){
        System.out.println("Your balance is: "+amount);
        transaction(amount);
    }
    public static void checkPin(){
        Scanner sc=new Scanner(System.in);
        int pin=1234,enteredPin;
        System.out.print("Enter your pin: ");
        enteredPin=sc.nextInt();
        if(enteredPin==pin)
            transaction(account.amount);
        else
            System.out.println("Wrong Pin! Try again");
        checkPin();
    }

    public static void transaction(double money){
        Scanner scan=new Scanner(System.in);
        System.out.print("WELCOME!! Please select the action from the options below." +
                "\n1.Deposit Money\n2.Withdraw Money\n3.Check Balance.\n4.Exit." +
                "\nPlease enter your choice: ");
        int choice=scan.nextInt();
        while(choice!=4){
            if(choice==1)
                deposit(money);
            else if (choice==2)
                withdraw(money);
            else if(choice==3)
                checkBalance(money);
            else
                System.out.println("Invalid input! Please enter a valid choice!");
        }
        System.exit(0);
    }

    public static void main(String[] args) {
        checkPin();
        transaction(account.amount);
    }
}

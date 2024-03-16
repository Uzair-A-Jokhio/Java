package Finals;
/*          Qus No 4
Question no 4:- Develop a class ‘Bank_Account’ with attributes of
account_name, account_number, date_of_creation and balance. The account
are of two types:

a. Saving account with interest_rate as unique attribute.
b. Current_account with withdrawl_limit as unique attribute.
 */
import java.util.Date;

public class Bank {
    private String account_name;
    private int account_number;
    private Date date_of_creation;
    private double balance;

    public Bank(String accName, int accNumber){
        this.account_name = accName;
        this.account_number = accNumber;
        this.balance = 0;
        this.date_of_creation = new Date();
    }

    public void get_Account_Detail(){
        System.out.println("Account Name: " + account_name);
        System.out.println("Account Number: " + account_number);
        System.out.println("Date of Creation: " + date_of_creation);
        System.out.println("Balance: " + balance);
    }

    public void Deposit(int cash){
        if (cash > 0){
            balance += cash;
            System.out.println("Cash Deposit " + balance);

        } else{
            System.out.println("Invalid. ");
        }
    }

    class Saving_Account extends Bank {

        private double intrest;
        
        public Saving_Account(String accName, int accNumber, double intrest) {
            super(accName, accNumber);
            this.intrest = intrest;
        }

        public void get_saving_Account(){
            get_Account_Detail();
            System.out.println("Account Type: Saving Account");
            System.out.println("Intrest: " + intrest);
        }
    }

    class Current_account extends Bank{

        private int withdrawl_limit;

        public Current_account(String accName,int accNumber, int withdrawl_limit){
            super(accName, accNumber);
            this.withdrawl_limit = withdrawl_limit;
        }
        public void get_Current_Account(){
            get_Account_Detail();
            System.out.println("Account Type: Saving Account");
            System.out.println("Limit: " + withdrawl_limit);
            
        } 
    }

}

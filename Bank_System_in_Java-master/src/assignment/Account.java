package assignment;
/*

Programmed By: @Mahed Shahzad Nasir
Registeration # FA20-BCS-032
Dated: 10/12/2021
Time: 01:03:23 AM

 */
import java.util.ArrayList;

public class Account {
    //Declaring Variables
    private int Id, age;
    private double Balance;
    private double tax;
    private double capitalTax;
    private String name;
    
    //Default Contsructor
    
    public Account(int id, int age, double balance, String name, boolean check) {
        
    }
    
    //Parameterized Constructor
    
    public Account(int id, int age, double balance, double tax, double capitalTax, String name, boolean check) {
        Id = id;
        this.age = age;
        Balance = balance;
        this.tax = tax;
        this.capitalTax = capitalTax;
        name = name;
        
        //condition to check Tax
        
        if(check==true){
            tax=0.02;
            capitalTax=0.15;
        }
        else{
            tax=0.04;
            capitalTax=0.25;
        }
    }
    
    //(Encapsulation)
    
    //Getter Functions
    public int getId() {
        return Id;
    }
    public int getAge() {
        return age;
    }
    public double getBalance() {
        return Balance;
    }
    public double getTax() {
        return tax;
    }
    public double getCapitalTax() {
        return capitalTax;
    }
    public String getname() {
        return name;
    }
    
    //Setter Functions
    public void setId(int id) {
        Id = id;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setBalance(double balance) {
        Balance = balance;
    }
    public void setTax(double tax) {
        this.tax = tax;
    }
    public void setCapitalTax(double capitalTax) {
        this.capitalTax = capitalTax;
    }
    public void setname(String name) {
        this.name = name;
    }
    
    //Method to Add Deposited Amount
    public void Deposit(double salary){
        setBalance(getBalance()+salary);
    }
    
    //Method to Subtract Withdraw Amount
    public void withDraw(double salary){
        double taxDeduct = getBalance()*tax;
        setBalance(getBalance()-salary-taxDeduct);
    }
    
    //Method to Return Total Earning
    public double getTotalEarning(){
        return 0;
    }
    
    //Method to Return Total Profit
    public static double getProfit(ArrayList<Account> account){
        double profit = 0.0;
        double total = 0.0;
        for (Account acc: account) {
            if (acc instanceof Account){

            }
            else{
                profit = acc.getTotalEarning();
                System.out.println("The total Earning of  " + acc.getClass() + " " + profit);
                total+=profit;
            }
        }
        return total;
    }
    
    //Method to Calculate Zakat
    public double Zakat(){
        return getBalance()*0.025;
    }

    //End of the  Parent Class
}

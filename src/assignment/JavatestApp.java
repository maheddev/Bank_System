package assignment;
/*
                                                   <<==>> BANK MANAGEMENT SYSTEM <<==>>
                                                   Programmed By: @Mahed Shahzad Nasir
                                                       Registeration # FA20-BCS-032
                                                             Dated: 10/12/2021

                                ==>> This class is the Driver Class of the Classes Present in assignment <<==
                                           ==>> All the Classes are Handled polymorphically here <<==

*/

// Importing ArrayList Built in Class to use ArrayList
import java.util.ArrayList;
//class definition (JavaTestApp)
public class JavatestApp {

    //Main Method
    public static void main(String[] args) {
         System.out.println("\n\nBANK MANAGEMENT SYSTEM IN JAVA");

         //Creating Object (accounts_ArrayList) of ArrayList in Main Method
         ArrayList<Account> accounts_ArrayList = new ArrayList<>();

         //Creating Array Object of Account Class to handle the Classes Polymorphically
         Account[] array = new Account[6];

         //Assigning Values to the variables by calling Constructors
         array[0] = new Current(5621,51,220000,"Nasir Ahmad Dogar",true);
         array[1] = new Investment(5626,69,990000,"Mahed Shahzad",3,true);
         array[2] = new Savings(5622,19,440000,"Hassan Virk",false);
         array[3] = new Investment(5623,20,660000,"Hamid Masood",1,true);
         array[4] = new Current(5624,15,770000,"M. Maaz Dogar",false);
         array[5] = new Savings(5625,59,880000,"Abdullah Dogar",false);

         //Using Enhanced For Loop to Add the Data to ArrayList
         for (Account i : array){
             //using .add() built in method to store data in Arraylist
             accounts_ArrayList.add(i);
         }

         //using simple print statment to print data stored in ArrayList
         //System.out.println(accounts_ArrayList);

         //Using Enhanced for loop and print Statement to Print the Data.
         for (Account i : array){
             System.out.println(i);
         }

         //printing Total Profit Paid by Calling method (getProfit()) from parent Class
         System.out.printf("\n\n\nTotal Profit Paid: %.2f",Account.getProfit(accounts_ArrayList));
    }
}
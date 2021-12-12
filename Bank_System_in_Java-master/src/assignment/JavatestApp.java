package assignment;
/*

Programmed By: @Mahed Shahzad Nasir
Registeration # FA20-BCS-032
Dated: 10/12/2021
Time: 01:40:23 AM

 */
import java.util.ArrayList;
public class JavatestApp {
    public static void main(String[] args) {
         ArrayList<Account> accounts_ArrayList = new ArrayList<>();
         accounts_ArrayList.add(new Current(1,19,220000,"Mahed Dogar",true));
         accounts_ArrayList.add(new Savings(2,29,440000,"Hassan Virk",false));
         accounts_ArrayList.add(new Investment(3,39,660000,"Hamid Masood",1,true));
         accounts_ArrayList.add(new Current(4,49,770000,"M. Maaz Dogar",false));
         accounts_ArrayList.add(new Savings(5,59,880000,"Abdullah Dogar",false));
         accounts_ArrayList.add(new Investment(6,69,990000,"Armughan",3,true));
         System.out.printf("The Total bank Profit paid : %.2f ",Account.getProfit(accounts_ArrayList));
    }
}

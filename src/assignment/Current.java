package assignment;
/*
                                                   <<==>> BANK MANAGEMENT SYSTEM <<==>>
                                                   Programmed By: @Mahed Shahzad Nasir
                                                       Registeration # FA20-BCS-032
                                                             Dated: 10/12/2021

                                        ==>> This class is being inherited from Account Class <<==


*/

// Inheriting from parent (Account) using extends keyword
public class Current extends Account{

    //Parameterized Constructor
    public Current(int id, int age, double balance, String name, boolean check) {
        super(id, age, balance, name, check);
    }

    //Overriding toString Method of Parent Class
    @Override
    public String toString() {
        return super.toString() + "\nAccount Type: "+getClass().getSimpleName();
    }
}

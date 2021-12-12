package assignment;
/*
                                                   <<==>> BANK MANAGEMENT SYSTEM <<==>>
                                                   Programmed By: @Mahed Shahzad Nasir
                                                       Registeration # FA20-BCS-032
                                                             Dated: 10/12/2021

                               ==>> This is an Enum which is used to store the data to Check age Category <<==
                                                   ==>> It is used in Saving Class <<==


*/
//declaring an ENUM Catagory
public enum Catagory {

    //Storing Data to Enum
    Young(0.06),
    Adult(0.07),
    Senior(0.08);

    //Declaring Final variable
    private final double percentProfit;

    //Encapsulation
    //Getter Method
    public double getPercantageProfit() {
        return percentProfit;
    }

    //Parameterized Constructor
    Catagory(double percentProfit) {
        this.percentProfit = percentProfit;
    }
}

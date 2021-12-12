package assignment;
/*
                                                   <<==>> BANK MANAGEMENT SYSTEM <<==>>
                                                   Programmed By: @Mahed Shahzad Nasir
                                                       Registeration # FA20-BCS-032
                                                             Dated: 10/12/2021

                                    ==>> This is an Enum which is used to store the data of Profit <<==
                                                ==>> It is used in Investment Class <<==


*/
//Declaring an Enum named TimeDuration
public enum TimeDurationE {

    //Storing Data to Enum
    One(1,0.1),
    Three(3,0.12),
    Five(5,0.14);

    //Declaring final variables
    private final int number;
    private final double percentProfit;

    //Parameterized constructor
    TimeDurationE(int number, double percentProfit){
        this.number=number;
        this.percentProfit=percentProfit;
    }

    //Encapsulation
    //Getter
    public int getNumber() {
        return number;
    }

    //Setter Method
    public double getPercentProfit() {
        return percentProfit;
    }
}

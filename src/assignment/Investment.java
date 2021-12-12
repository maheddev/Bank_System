package assignment;
/*
                                                   <<==>> BANK MANAGEMENT SYSTEM <<==>>
                                                   Programmed By: @Mahed Shahzad Nasir
                                                       Registeration # FA20-BCS-032
                                                             Dated: 10/12/2021

                                        ==>> This class is being inherited from Account Class <<==
                                           ==>> TimeDurationE (enum) is used in this Class <<==


*/
//Inheriting Investment class from Account Class using extends keyword
public class Investment extends Account{

    //Creating object (variable) of TimeDurationE ENUM
    private TimeDurationE timePeriod;

    //Parameterized Constructor of Investment Class
    public Investment(int id, int age, double balance, String name, int number, boolean check) {
        super(id, age, balance, name, check);
        timePeriod = choseDuration(number);
    }

    //Encapsulation
    //Getter method
    public TimeDurationE getTimePeriod() {
        return timePeriod;
    }

    //Setter Method
    public void setTimePeriod(TimeDurationE timePeriod) {
        this.timePeriod = timePeriod;
    }

    //Creating a method to Choose the Time Duration (Switch case is used here)
    public TimeDurationE choseDuration(int number){
        TimeDurationE TDE;
        switch (number){
            case 1:
                TDE = TimeDurationE.One;
                break;
            case 3:
                TDE = TimeDurationE.Three;
                break;
            case 5:
                TDE = TimeDurationE.Five;
                break;
            default:
                TDE = null;
        }
        return TDE;
    }

    //Overriding getTotalEarning method of Parent Class
    @Override
    public double getTotalEarning(){
        double earning = 0, totalEarning=0, temp;
        for (int i = 0; i < timePeriod.getNumber(); i++) {
            earning = getBalance()*timePeriod.getPercentProfit();
            setBalance(getBalance()+earning);
            totalEarning+=earning;
        }
        temp = totalEarning*getCapitalTax();
        return earning-temp;
    }

    //Overriding withDraw method of Parent Class
    @Override
    public void withDraw(double salary){
         double ab = getBalance()+getTax();
         double cd = getBalance()*0.04;
         setBalance(getBalance()-salary-cd-ab);
    }

    //Overriding toString of Parent Class
    @Override
    public String toString() {
        return super.toString() + "\nAccount Type: " + getClass().getSimpleName();
    }
}

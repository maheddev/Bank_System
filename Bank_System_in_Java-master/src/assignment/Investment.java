package assignment;
/*

Programmed By: @Mahed Shahzad Nasir
Registeration # FA20-BCS-032
Dated: 10/12/2021
Time: 01:34:34 AM

 */
public class Investment extends Account{
    private TimeDurationE timePeriod;

    public Investment(int id, int age, double balance, String name, int number, boolean check) {
        super(id, age, balance, name, check);
        timePeriod = choseDuration(number);
    }
    public TimeDurationE getTimePeriod() {
        return timePeriod;
    }
    public void setTimePeriod(TimeDurationE timePeriod) {
        this.timePeriod = timePeriod;
    }
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

    @Override
    public void withDraw(double salary){
         double ab = getBalance()+getTax();
         double cd = getBalance()*0.04;
         setBalance(getBalance()-salary-cd-ab);
    }
}

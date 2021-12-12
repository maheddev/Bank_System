package assignment;
/*

Programmed By: @Mahed Shahzad Nasir
Registeration # FA20-BCS-032
Dated: 10/12/2021
Time: 01:29:20 AM

 */
public enum TimeDurationE {
    One(1,0.1),
    Three(3,0.12),
    Five(5,0.14);
    private final int number;
    private final double percentProfit;

    TimeDurationE(int number, double percentProfit){
        this.number=number;
        this.percentProfit=percentProfit;
    }
    public int getNumber() {
        return number;
    }
    public double getPercentProfit() {
        return percentProfit;
    }
}

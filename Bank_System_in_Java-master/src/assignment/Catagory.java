package assignment;
/*

Programmed By: @Mahed Shahzad Nasir
Registeration # FA20-BCS-032
Dated: 10/12/2021
Time: 01:16:34 AM

 */
public enum Catagory {
    Young(0.06),
    Adult(0.07),
    Senior(0.08);

    private final double percentProfit;

    public double getPercantageProfit() {
        return percentProfit;
    }

    Catagory(double percentProfit) {
        this.percentProfit = percentProfit;
    }
}

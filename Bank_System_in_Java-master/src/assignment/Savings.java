package assignment;
/*

Programmed By: @Mahed Shahzad Nasir
Registeration # FA20-BCS-032
Dated: 10/12/2021
Time: 01:20:45 AM

 */
public class Savings extends Account{
    private Catagory catagory;
    public Savings(int id, int age, double balance, String name, boolean check) {
        super(id, age, balance, name, check);
        catagory = choseCatagory();
    }
    public Catagory getCatagory() {
        return catagory;
    }
    public void setCatagory(Catagory catagory) {
        this.catagory = catagory;
    }
    public Catagory choseCatagory(){
        if(getAge()<=35){
            return Catagory.Young;
        }
        else  if(getAge()>35&& getAge()<=50){
            return Catagory.Adult;
        }
        else {
            return Catagory.Senior;
        }
    }

    @Override
    public double getTotalEarning() {
        double earning = getBalance()*catagory.getPercantageProfit();
        double taxDeduct = earning*getCapitalTax();
        return earning-taxDeduct;
    }
}

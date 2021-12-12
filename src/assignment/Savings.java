package assignment;
/*
                                                   <<==>> BANK MANAGEMENT SYSTEM <<==>>
                                                   Programmed By: @Mahed Shahzad Nasir
                                                       Registeration # FA20-BCS-032
                                                             Dated: 10/12/2021

                                        ==>> This class is being inherited from Account Class <<==
                                              ==>> Catagory (enum) is used in this Class <<==


*/
//Inheriting Saving class from Account Class using extends keyword
public class Savings extends Account{

    //Creating Object (variable) of Catagory Enum to check the age category of the Account Holder
    private Catagory catagory;

    //Parameterized Constructor of Savings Class
    public Savings(int id, int age, double balance, String name, boolean check) {
        super(id, age, balance, name, check);
        catagory = choseCatagory();
    }

    //Encapsulation
    //Getter Methods
    public Catagory getCatagory() {
        return catagory;
    }

    //Setter Methods
    public void setCatagory(Catagory catagory) {
        this.catagory = catagory;
    }

    //Method to Select the Category of the Account Holder using if Statement.
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

    //Overriding getTotalEarning method of Parent Class
    @Override
    public double getTotalEarning() {
        double earning = getBalance()*catagory.getPercantageProfit();
        double taxDeduct = earning*getCapitalTax();
        return earning-taxDeduct;
    }

    //Overriding toString method of Parent Class
    public String toString() {
        return super.toString() + "\nAccount Type: " + getClass().getSimpleName();
    }

    //End of Class
}

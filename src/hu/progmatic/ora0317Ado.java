package hu.progmatic;

public class ora0317Ado {
    public static void main(String[] args) {
        /*calculateTax(1000000,100000,200000);
        calculateTax(600000, 100000, 150000);
        calculateNet(600000);*/

        int balance = 1_000_000;

        int grossIncome = 500_000;
        int spending = 480_000;



        grossIncome = 600_000;
        spending = 480_000;

        balance += calculateNet(grossIncome) - spending;
        System.out.println("Egyenleg: " + balance);

        //calculateNet(2_000_000);

    }

    /*public static void calculateTax (int gross, int tax, int contribution){
        //Bruttó: xyz
        //Nettó: abc
        int net = gross - tax - contribution;
    }*/

    public static int calculateNet(int gross){
        int net = (gross * 665) / 1000;
        return net;
    }
}

public class PersonalSpending {

    private double myMoney;

    public PersonalSpending(double myMoney){
        this.myMoney = myMoney;
    }

    public double dailyAllowance(double amountPerDay){
        return amountPerDay*7*4   ;
    }

    public double rent(double amountInRentPerMonth){
        double rentPerYear = amountInRentPerMonth*12;
        System.out.println("The amount of rent per years is " + rentPerYear);
        return amountInRentPerMonth;
    }


}

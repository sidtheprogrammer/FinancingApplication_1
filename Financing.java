public class Financing {

    public static void main(String[] args){

        MoneyOut mo = new MoneyOut();
        mo.setSalary(35000);

        double totalOnTax = mo.tax()+mo.ni()+mo.student();
        System.out.println("Total on tax " + totalOnTax);
        double pocketMoney = mo.getSalary()-mo.tax()-mo.ni()-mo.student();

        System.out.println("Pocket money  " + pocketMoney);
        PersonalSpending spending =  new PersonalSpending(pocketMoney);

       double totalSpending = spending.dailyAllowance(4)*12 + spending.rent(610)*12;
        double howMuchLeft = pocketMoney -  totalSpending;
        System.out.println("Spending on rent and food " + totalSpending);
        System.out.println("How much I put into my bank each year " + howMuchLeft);

    }
}

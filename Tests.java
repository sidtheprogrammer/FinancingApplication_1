import org.junit.Assert;
import org.junit.Test;

public class Tests {


    @Test
    public void testTax_NoTax(){
        MoneyOut moneyOut = new MoneyOut();
        moneyOut.setSalary(6000);
        assert ( 0== moneyOut.tax());
    }


    @Test
    public void testTax_ALotOfTax(){
        MoneyOut moneyOut = new MoneyOut();
        moneyOut.setSalary(60000);
        assert ( 12360== moneyOut.tax());
    }
}

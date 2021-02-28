package interfaces;

import org.testng.annotations.Test;

import java.math.BigDecimal;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotNull;

public class ClientTest {

    @Test
    public void addDeposit() {
        BaseDeposit bd = new BaseDeposit(BigDecimal.valueOf(3000),6);
        Client actual = new Client();
        actual.addDeposit(bd);
        assertNotNull(actual);
    }

    @Test
    public void totalIncome() {
        BaseDeposit bd = new BaseDeposit(BigDecimal.valueOf(3000),6);
        LongDeposit ld = new LongDeposit(BigDecimal.valueOf(3000),8);
        SpecialDeposit sd = new SpecialDeposit(BigDecimal.valueOf(3000),6);
        Client c1 = new Client();
        c1.addDeposit(bd);
        c1.addDeposit(ld);
        c1.addDeposit(sd);
        BigDecimal totalIncome = c1.totalIncome();
        assertEquals(BigDecimal.valueOf(2672.54),totalIncome);
    }

    @Test
    public void maxIncome() {
        BaseDeposit bd = new BaseDeposit(BigDecimal.valueOf(3000),6);
        LongDeposit ld = new LongDeposit(BigDecimal.valueOf(3000),8);
        SpecialDeposit sd = new SpecialDeposit(BigDecimal.valueOf(3000),6);
        Client c1 = new Client();
        c1.addDeposit(bd);
        c1.addDeposit(ld);
        c1.addDeposit(sd);
        BigDecimal maxIncome = c1.maxIncome();
        assertEquals(BigDecimal.valueOf(1020.29),maxIncome);
    }

    @Test
    public void getIncomeByNumber() {
        BaseDeposit bd = new BaseDeposit(BigDecimal.valueOf(3000),6);
        LongDeposit ld = new LongDeposit(BigDecimal.valueOf(3000),2);
        SpecialDeposit sd = new SpecialDeposit(BigDecimal.valueOf(3000),6);
        Client c1 = new Client();
        c1.addDeposit(bd);
        c1.addDeposit(ld);
        c1.addDeposit(sd);
        BigDecimal getIncomeByNumber = c1.getIncomeByNumber(2);
        assertEquals(BigDecimal.valueOf(967.50),getIncomeByNumber);
    }

    @Test
    public void sortDeposits(){
        BaseDeposit bd = new BaseDeposit(BigDecimal.valueOf(3000),6);
        LongDeposit ld = new LongDeposit(BigDecimal.valueOf(3000),6);
        SpecialDeposit sd = new SpecialDeposit(BigDecimal.valueOf(3000),6);
        Deposit[] d1 = {bd,ld,sd};
        Client c1 = new Client(d1);
        c1.sortDeposits();
        Deposit[] d2 = {bd,sd,ld};
        Client c2 = new Client(d2);
        assertEquals(c1,c2);
    }

    @Test
    public void countPossibleToProlongDeposit() {
        BaseDeposit bd = new BaseDeposit(BigDecimal.valueOf(3000),6);
        LongDeposit ld = new LongDeposit(BigDecimal.valueOf(5000),10);
        SpecialDeposit sd = new SpecialDeposit(BigDecimal.valueOf(1000),8);
        Deposit[] d1 = {bd,ld,sd};
        Client c1 = new Client(d1);
        int amount = c1.countPossibleToProlongDeposit();
        assertEquals(amount,1);
    }
}



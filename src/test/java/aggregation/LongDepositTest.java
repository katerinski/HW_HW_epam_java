package aggregation;

import org.testng.annotations.Test;
import java.math.BigDecimal;
import static org.testng.Assert.assertEquals;

public class LongDepositTest {

    @Test
    public void income() {
        LongDeposit d1 = new LongDeposit(BigDecimal.valueOf(3000),8);
        BigDecimal income = d1.income();
        assertEquals(income,BigDecimal.valueOf(967.50));
    }

    @Test
    public void incomeIsNull() {
        LongDeposit d1 = new LongDeposit(BigDecimal.valueOf(1000),2);
        BigDecimal income = d1.income();
        assertEquals(BigDecimal.valueOf(0),income);
    }

}


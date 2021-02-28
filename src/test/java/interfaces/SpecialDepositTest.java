package interfaces;

import org.testng.annotations.Test;
import java.math.BigDecimal;
import static org.testng.Assert.assertEquals;

import static org.testng.Assert.assertTrue;

public class SpecialDepositTest {

    @Test
    public void income() {
        SpecialDeposit d1 = new SpecialDeposit(BigDecimal.valueOf(3000),6);
        BigDecimal income = d1.income();
        assertEquals(BigDecimal.valueOf(684.75),income);
    }

    @Test
    public void canToProlong() {
        SpecialDeposit d1 = new SpecialDeposit(BigDecimal.valueOf(1001),6);
        assertTrue(d1.canToProlong());
    }
}


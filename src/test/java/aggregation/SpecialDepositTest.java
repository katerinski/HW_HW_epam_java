package aggregation;

import org.testng.annotations.Test;
import java.math.BigDecimal;
import static org.testng.Assert.assertEquals;

public class SpecialDepositTest {

    @Test
    public void income() {
        SpecialDeposit d1 = new SpecialDeposit(BigDecimal.valueOf(3000),6);
        BigDecimal income = d1.income();
        assertEquals(BigDecimal.valueOf(684.75),income);
    }

}


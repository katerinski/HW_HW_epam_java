package aggregation;

import org.testng.annotations.Test;
import java.math.BigDecimal;
import static org.testng.Assert.assertEquals;

public class BaseDepositTest {

    @Test
    public void income() {
        BaseDeposit d1 = new BaseDeposit(BigDecimal.valueOf(3000),6);
        BigDecimal income = d1.income();
        assertEquals(BigDecimal.valueOf(1020.29),income);
    }
}


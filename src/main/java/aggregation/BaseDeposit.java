package aggregation;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BaseDeposit extends Deposit{

    protected BaseDeposit(BigDecimal depositAmount, int depositPeriod) {
        super(depositAmount,depositPeriod);
    }
    @Override
    public BigDecimal income() {
        BigDecimal baseAmount = getAmount();
        int period = getPeriod();
        BigDecimal totalIncome = BigDecimal.valueOf(0);

        for (int i = 0; i < period; i++) {
            BigDecimal income = baseAmount.multiply(BigDecimal.valueOf(0.05)) ;
            totalIncome = totalIncome.add(income);
            baseAmount = income.add(baseAmount);
        }
        return totalIncome.setScale(2, RoundingMode.HALF_EVEN);
    }
}



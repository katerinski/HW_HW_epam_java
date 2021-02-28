package aggregation;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class LongDeposit extends Deposit {
    protected LongDeposit(BigDecimal depositAmount, int depositPeriod) {
        super(depositAmount,depositPeriod);
    }
    @Override
    public BigDecimal income() {
        BigDecimal baseAmount = getAmount();
        int period = getPeriod();
        BigDecimal totalIncome = BigDecimal.valueOf(0);
        if (period < 6){totalIncome = BigDecimal.valueOf(0);}
        else{
            for (int i = 6; i < period; i++) {
                BigDecimal income = baseAmount.multiply(BigDecimal.valueOf(0.15)) ;
                totalIncome = totalIncome.add(income);
                baseAmount = income.add(baseAmount);
            }
        }
        return totalIncome.setScale(2, RoundingMode.HALF_EVEN);

    }
}



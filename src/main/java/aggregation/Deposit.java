package aggregation;

import java.math.BigDecimal;

public abstract class Deposit {
    protected BigDecimal amount;
    protected int period;

    public BigDecimal getAmount(){ return this.amount; }

    public int getPeriod() { return this.period; }

    protected Deposit(BigDecimal depositAmount, int depositPeriod) {
        amount = depositAmount;
        period = depositPeriod;
    }

    public abstract BigDecimal income();

    public BigDecimal totalAmount() {
        return amount.add(income());
    }

}


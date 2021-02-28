package interfaces;

import java.math.BigDecimal;
import java.util.Objects;


public abstract class Deposit implements Comparable<Deposit>{
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


    @Override
    public int compareTo(Deposit o) {
        int last = this.totalAmount().compareTo(o.totalAmount());
        return last == 0 ? this.totalAmount().compareTo(o.totalAmount()) : last;
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o)  return true;
        if (o == null || getClass() != o.getClass()) return false;
        Deposit d = (Deposit) o;
        return income().equals(d.income());
    }

    @Override
    public int hashCode() {
        return Objects.hash(amount, period);
    }

}


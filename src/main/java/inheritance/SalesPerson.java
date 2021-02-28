package inheritance;

import java.math.BigDecimal;

public class SalesPerson extends Employee {
    private final int percent;

    public SalesPerson(String name, BigDecimal salary, int percent)
    {
        super(name,salary);
        this.percent = percent;
    }

    @Override
    public void setBonus(BigDecimal bonus) {
        if( bonus == null) throw new IllegalArgumentException();
        if (percent < 0
                || bonus.compareTo(BigDecimal.valueOf(0)) < 0
                || bonus.compareTo(BigDecimal.valueOf(0)) == 0
        ) throw new IllegalArgumentException();
        else if (percent <= 100)
        {
            super.setBonus(bonus);
        }
        else if (percent <= 200)
        {
            super.setBonus(bonus.multiply(BigDecimal.valueOf(2)));
        }
        else {
            super.setBonus(bonus.multiply(BigDecimal.valueOf(3)));
        }
    }

}



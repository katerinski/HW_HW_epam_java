package inheritance;

import java.math.BigDecimal;

public class Manager extends Employee {
    private final int quantity;

    public Manager(String name, BigDecimal salary, int clientAmount)
    {
        super(name,salary);
        quantity = clientAmount;
    }

    @Override
    public void setBonus(BigDecimal bonus) {
        if( bonus == null) throw new IllegalArgumentException();
        if (quantity < 0
                || bonus.compareTo(BigDecimal.valueOf(0)) < 0
                || bonus.compareTo(BigDecimal.valueOf(0)) == 0
        ) throw new IllegalArgumentException();
        else if (quantity <= 100)
        {
            super.setBonus(bonus);
        }
        else if (quantity <= 150)
        {
            super.setBonus(bonus.add(BigDecimal.valueOf(500)));
        }
        else {
            super.setBonus(bonus.add(BigDecimal.valueOf(1000)));
        }
    }
}



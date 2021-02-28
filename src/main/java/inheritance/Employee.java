package inheritance;

import java.math.BigDecimal;

public class Employee {
    private final String name;
    private final BigDecimal salary;
    private BigDecimal bonus;

    public String getName(){
        return this.name;
    }
    public BigDecimal getSalary(){
        return this.salary;
    }

    public Employee(String name, BigDecimal salary) {
        this.name = name;
        this.salary = salary;
    }

    public void setBonus(BigDecimal bonus) {
        if( bonus == null) throw new IllegalArgumentException();
        if (bonus.compareTo(BigDecimal.valueOf(0)) < 0
                || bonus.compareTo(BigDecimal.valueOf(0)) == 0
        ) throw new IllegalArgumentException();
        this.bonus = bonus;
    }

    public BigDecimal getBonus(){
        return this.bonus;
    }

    public BigDecimal toPay() {
        if( bonus == null) throw new IllegalArgumentException();
        if (bonus.compareTo(BigDecimal.valueOf(0)) < 0
                || bonus.compareTo(BigDecimal.valueOf(0)) == 0
                || salary.compareTo(BigDecimal.valueOf(0)) < 0
        ) throw new IllegalArgumentException();
        return salary.add(bonus) ;
    }

}


package inheritance;

import java.math.BigDecimal;

public class Company {
    protected Employee[] employees;
    public Company(Employee... employees) {
        this.employees = employees;
    }
    public void giveEverybodyBonus(BigDecimal companyBonus)
    {

        for (Employee employee : employees) {
            employee.setBonus(companyBonus);
        }
    }
    public BigDecimal totalToPay()
    {
        BigDecimal sum = new BigDecimal(0);
        for (Employee employee : employees) {
            sum = sum.add(employee.toPay());
        }
        return sum;
    }
    public String nameMaxSalary()
    {
        String name = "";
        BigDecimal maxSalary = new BigDecimal(0);
        for (Employee employee : employees) {
            if (maxSalary.compareTo(employee.toPay()) < 0) {
                maxSalary = employee.toPay();
                name = employee.getName();
            }
        }
        return name;
    }

}



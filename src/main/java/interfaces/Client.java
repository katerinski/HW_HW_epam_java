package interfaces;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.*;

public class Client implements Iterable <Deposit> {

    private final Deposit[] deposits;

    public Client() {
        deposits = new Deposit[10];
    }

    public Client(Deposit...deposits) {
        this.deposits = deposits;
    }

    public Iterator<Deposit> iterator() {
        return Arrays.asList(deposits).iterator();
    }

    public boolean addDeposit(Deposit deposit) {
        for (int i = 0; i < deposits.length; i++)
            if (deposits[i] == null) {
                deposits[i] = deposit;
                return true;
            }
        return false;
    }
    public BigDecimal totalIncome() {
        BigDecimal totalIncome = BigDecimal.valueOf(0);
        for (Deposit deposit : deposits) {
            if (deposit != null)
                totalIncome = totalIncome.add(deposit.income());
        }
        return totalIncome.setScale(2, RoundingMode.HALF_EVEN);
    }
    public BigDecimal maxIncome() {
        BigDecimal maxIncome = BigDecimal.valueOf(0);
        for (Deposit deposit : deposits) {
            if (deposit != null && maxIncome.compareTo(deposit.income()) < 0) {
                maxIncome = deposit.income();
            }
        }
        return maxIncome.setScale(2, RoundingMode.HALF_EVEN);
    }
    public BigDecimal getIncomeByNumber(int n) {
        BigDecimal income = BigDecimal.valueOf(0);
        for (int i = 0; i < deposits.length; i++) {
            if ((n) == i && deposits[i] != null){
                if (deposits[i].income().equals(BigDecimal.valueOf(0))){
                    income = BigDecimal.valueOf(0);
                }
                else {
                    income = deposits[i].income().setScale(2, RoundingMode.HALF_DOWN);
                }
            }
        }
        return income;
    }

    public void sortDeposits() {
        Arrays.sort(deposits, Comparator.nullsLast(Comparator.reverseOrder()));
    }

    public int countPossibleToProlongDeposit() {
        int amount = 0;
        for (Deposit deposit : deposits) {
            if ((deposit instanceof Prolongable) && ((Prolongable)deposit).canToProlong()){
                amount++;
            }
        }
        return amount;
    }


}


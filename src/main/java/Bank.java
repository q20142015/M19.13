import java.util.*;
import java.util.function.BiConsumer;

public class Bank {

    private Map<String, Account> accounts;
    private final Random random = new Random();

    Bank() {
        accounts = new HashMap<>();
    }

    public void add(String accNumber, long money) {
        Account acc = new Account();
        acc.setAccNumber(accNumber);
        acc.setMoney(money);
        acc.getUnblocked();
        accounts.put(accNumber, acc);
    }

    public synchronized boolean isFraud(String fromAccountNum, String toAccountNum, long amount)
            throws InterruptedException {
        Thread.sleep(1000);
        return random.nextBoolean();
    }

    /**
     * TODO: реализовать метод. Метод переводит деньги между счетами. Если сумма транзакции > 50000,
     * то после совершения транзакции, она отправляется на проверку Службе Безопасности – вызывается
     * метод isFraud. Если возвращается true, то делается блокировка счетов (как – на ваше
     * усмотрение)
     */
    public void /*synchronized*/ transfer(String fromAccountNum, String toAccountNum, long amount) throws InterruptedException {
        Account account1 = accounts.get(fromAccountNum);
        Account account2 = accounts.get(toAccountNum);
        if (account1.getMoney() > 50000) {
            boolean isFr = isFraud(fromAccountNum, toAccountNum, amount);
            if (isFr == true) {
                /*account1.getBlocked();*/
            }
        }
        if (account1.getAccNumber().equals(account2.getAccNumber()) || amount > account1.getMoney() || account1.giveBlockedStatus() == true) {
        } else {
            setmoneytr(account1, account2, amount);
            //System.out.println(account1.getMoney());
            //System.out.println(account2.getMoney());

        }
        System.out.println(this.getSumAllAccounts());
    }

    public long getBalance(String accountNum) {
        Account v = accounts.get(accountNum);
        return v.getMoney();
    }

    public  void setmoneytr(Account account1, Account account2, long amount) {
        account1.setMoney(account1.getMoney() - amount);
        account2.setMoney(account2.getMoney() + amount);
    }

    public long getSumAllAccounts() {
        long sumMoney = 0;
        for (Map.Entry<String, Account> entry : accounts.entrySet()) {
            String k = entry.getKey();
            Account v = entry.getValue();
            sumMoney = sumMoney + v.getMoney();
        }
        return sumMoney;
    }
}


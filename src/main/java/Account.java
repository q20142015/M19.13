public class Account {

    private long money;
    private String accNumber;

    private boolean isBlocked;

    public long getMoney() {
        return money;
    }

    public void setMoney(long money) {
        this.money = money;
    }

    public String getAccNumber() {
        return accNumber;
    }

    public void setAccNumber(String accNumber) {
        this.accNumber = accNumber;
    }

    public void getBlocked() {
        this.isBlocked = true;
    }

    public void getUnblocked() {
        this.isBlocked = false;
    }

    public boolean giveBlockedStatus() {
        return this.isBlocked;
    }
}


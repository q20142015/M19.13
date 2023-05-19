public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();
        bank.add("1", 100000);
        bank.add("2", 200000);

        new Thread(() -> {
            try {
                for (int i = 0; i < 10000; i++) {
                    bank.transfer("1", "2", (long) (Math.random() * 55000));
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }).start();
        new Thread(() -> {
            try {
                for (int i = 0; i < 10000; i++) {
                    bank.transfer("2", "1", (long) Math.random() * 55000);
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }).start();


    }
}

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();
        bank.add("1", 200000000);
        bank.add("2", 200000000);
        for (int j = 0; j < 6; j++) {
            new Thread(() -> {
                try {
                    for (int i = 0; i < 100; i++) {
                        bank.transfer("1", "2", (long) (Math.random() * 100000));
                    }
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }).start();
            new Thread(() -> {
                try {
                    for (int i = 0; i < 100; i++) {
                        bank.transfer("2", "1", (long) (Math.random() * 100000));
                    }
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }).start();
        }



    }
}

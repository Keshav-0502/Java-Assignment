public class Q2 implements Runnable {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Java by -Keshav ");
        }
    }

    public static void main(String[] args) {
        Q2 runnable = new Q2();
        Thread thread = new Thread(runnable);
        thread.start();
    }
}
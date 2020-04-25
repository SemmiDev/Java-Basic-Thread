package belajar;

public class Main extends Thread{

    @Override
    public void run() {
        try {
            for (int i = 0; i <= 5; i++) {
                System.out.println("angka : " + i);
                Thread.sleep(1000);
                // if we use sleep keyword, so must use try catch
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
            // handling exception thread sleep
        }
    }

    public static void main(String[] args) {
        Main main = new Main();
//        main.run();
        main.start();
    }
}

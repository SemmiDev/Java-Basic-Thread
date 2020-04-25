package Runable;
import static java.lang.Thread.sleep;

public class App implements Runnable{

    @Override
    public void run() {
        try{
            String text = "angka";
            for(int i = 3; i > 0; i--){
                System.out.println(i);
                sleep(1000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        
        App app = new App();
        app.run();
        System.out.print("Time Out\n\n");
        
    }
}

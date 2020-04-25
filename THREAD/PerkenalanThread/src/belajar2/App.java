package belajar2;
import static java.lang.Thread.sleep;

public class App {
    Thread thread;
    int value = 7;

    void runSatu(){
        thread = new Thread();
        try{
            for(int i = 0; i <= value; i++){
                System.out.println(i +  ". ");
                sleep(500);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        thread.start();
    }

    void runDua(){
        thread = new Thread();
        try{
            for(int i = 0; i <= value; i++){
                System.out.println("Done!");
                sleep(500);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        thread.start();
    }

    public static void main(String[] args) {
        App app = new App();
        app.runSatu();
        app.runDua();
    }
}

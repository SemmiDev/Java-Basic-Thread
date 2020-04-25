package belajar;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Main implements Runnable{
    private int id;
    public Main(int id){
        this.id = id;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // menyelesaikan satu task
        System.out.println("Selesai task number " + id);
    }

    public static void main(String[] args) {
        // threadPool = sekumpulan thread yang mengatur banyaknya thread yang akan dibuat, dari task queue (antrian)

        // executor yg akan mengatur aliran eksekusi
        // newFixefThreadPool untuk menentukan ukuran tetap thread yg berkerja
        ExecutorService service = Executors.newFixedThreadPool(3);
        // mensubmit task loping dari 2 thread yg berkerja di thread pool
        for(int i = 0; i < 25; i++){
            service.submit(new Main(i));
        }

        // mematikan semu service setelah semua task tersubmit
        service.shutdown();

        // menggunakan try catch
        try {
            // method awaitTerminator akan memblock, sampai semua task selesai di eksekusi
            // setelah shutdoen sesuai waktu yg ditentukan

            service.awaitTermination(1, TimeUnit.DAYS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("All task completed");
    }
}

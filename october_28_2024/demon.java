package october_28_2024;

public class demon {
    public static void main(String[] args) {
        MyThread myThread=new MyThread();
        myThread.setDaemon(true);
        myThread.start();

        try{
            Thread.sleep(5000);
        }catch(InterruptedException ignored){

        }
        System.out.println("Main thread finished");
    }
}

class MyThread extends Thread {
    public void run() {
        while (true) {
            System.out.println("Daemon thread is running");
            try {
                Thread.sleep(500);
            } catch (InterruptedException ignored) {
                System.out.println("Daemon thread finished");
            }
        }
    }
}


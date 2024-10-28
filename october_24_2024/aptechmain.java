class aptechThread1 extends Thread{
    public aptechThread1(String name){
        super(name);
    }
    @Override
    public void run(){
        this.yield();
        try{
            for(int i=1;i<=5;i++){
                System.out.println(Thread.currentThread().getName()+"--->"+i);
                Thread.sleep(500);
                System.out.println("t1 state-->"+aptech_main.t1.getState());
                System.out.println("t2 state-->"+aptech_main.t2.getState());
            }
        }catch (Exception e){
            System.out.println("t1 state-->"+Thread.currentThread().getState());
            System.out.println("t2 state-->"+Thread.currentThread().getState());
        }
    }
}

public class aptech_main {
    static aptechThread1 t1=null;
    static aptechThread2 t2=null;

    public static void main(String[] args) throws InterruptedException{
        t1=new aptechThread1("Thread1");
        t2=new aptechThread2("Thread 2");

        System.out.println("thread 1 state="+t1.getState());
        System.out.println("thread 2 state="+t2.getState());
        System.out.println("t1 is alive="+t1.isAlive());

        t1.start();
        System.out.println("t1 is alive="+t1.isAlive());

        t1.join();

        t2.start();
        System.out.println("thread 1 state="+t1.getState());
        System.out.println("thread 2 state="+t2.getState());
    }
}

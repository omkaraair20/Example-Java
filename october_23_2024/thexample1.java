class myTh extends Thread {
    myTh(String name) {
        super(name);
    }

    @Override
    public void run() {
        try {
            for (int i = 1; i <= 5; i++) {
                System.out.println(getName() + "------>" + i);
                System.out.println("Have a nice day!!!");

                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
             e.printStackTrace();
        }
    }
}
    public class thexample1 {
        public static void main(String[] args) {
            Thread ob=Thread.currentThread();
            System.out.println(ob);
            System.out.println("alive="+ob.isAlive());
            ob.setName("Aptech thread");
            System.out.println("Name="+ob.getName());
            System.out.println("Priority="+ob.getPriority());

            myTh obth=new myTh("Cricket");
            obth.start();
        }
    }

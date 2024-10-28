public class inlinethread {
    public static void main(String[] args) {
        Runnable r1=new Runnable() {
            @Override
            public void run() {
                try{
                    for(int i=1;i<=2;i++){
                        System.out.println("Hello");
                        Thread.sleep(500);
                    }
                }catch (Exception e){

                }
            }
        };
        Thread ob1=new Thread(r1);
        ob1.start();
    }
}



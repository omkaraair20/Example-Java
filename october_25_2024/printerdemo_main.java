class paperprint{
    int nopages=100;

    synchronized void startprint(int pages){
        for(int i=1;i<=pages;i++){
            nopages--;
        }
        if(nopages<pages){
            try{
                wait();
            }catch (Exception e){
                //handle exception
            }
            System.out.println("pages finished waiting......");
            System.out.println("all pages printed");
        }
        synchronized void addpages(int pages){
            nopages+=pages;
            notify();
        }
    }
}

public class printerdemo_main {
    public static void main(String[] args) {
        paperprint p=new paperprint();
        new Thread(){
            @Override
            public void run(){
                paperprint p=new paperprint();
                new Thread(){
                    @Override
                    public void run(){
                        p.startprint(120);
                    };
                }.start();
                new Thread(){
                    @Override
                    public void run(){
                        p.addpages(40);
                    };
                }.start();
            }
        }
    }
}

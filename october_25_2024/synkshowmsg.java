public class msgblock {
    void showmsg(String arr[]){
        synchronized (this){
            System.out.println("[");
            for(int i=0;i<arr.length;i++){
                System.out.println(arr[i]);
                try{
                    Thread.sleep(500);
                }catch (Exception e){
                    //handle exception
                }
            }
            System.out.println("]");
        }
    }
}

class msgThreadDemo extends Thread{
    msgblock m;
    String arr[];
    public msgThreadDemo(msgblock m,String arr[]){
        this.m=m;
        this.arr=arr;
        start();
    }
    public void run(){
        m.showmsg(arr);
    }
}

public class synkshowmsg {
    public static void main(String[] args) {
        String arr1[]={"I","am","working","in","Synchronized","block."};
        String arr2[]={"Have","a","nice","Day!!!"};

        msgblock msg=new msgblock();

        msgThreadDemo t1=new msgThreadDemo(msg,arr1);
        msgThreadDemo t2=new msgThreadDemo(msg,arr2);
    }
}

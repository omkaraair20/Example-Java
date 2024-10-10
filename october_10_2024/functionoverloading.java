import java.util.*;

//import static functionoverloading.show;


public class functionoverloading {

         //static void show(int a,int b){
         //   System.out.println(a+","+b);
          //}
         //static void show(double a,double b){
            //System.out.println(a+","+b);
        //}
        //static void show(String name,String age){
          //  System.out.println(name+","+age);


        static<T> void show(T a,T b){
            System.out.println(a+","+b);
            System.out.println(a.getClass());
            System.out.println(b.getClass());
        }


public static void main(String[] args) {
    show(2,5);
    show(3,"omji");
    show("omji",22);
}
}

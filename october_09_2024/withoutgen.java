import java.util.*;

class Items<T>{
    T value;

    Items(T value){
        this.value=value;
    }

    T getItems(){
        return value;
    }

    void setItem(T value){
        this.value=value;
    }

}
public class withoutgen {
    public static void main(String[] args) {
        Items<Integer> ob1=new Items<Integer>(55000);
        System.out.println(ob1.getItems());

        Items<String> ob2=new Items<String>("55000");
        System.out.println(ob2.getItems());

        Items<Double> ob3=new Items<Double>(55000.0);
        ob3.setItem(85.50);
        System.out.println(ob3.getItems());

    }
}

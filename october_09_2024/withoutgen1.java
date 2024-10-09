import java.util.*;

class Items<Key,Value>{
    Key k;
    Value v;

    Items(Key k,Value v){
        this.k=k;
        this.v=v;
    }

    Value getKeyTest(Key k){
        return v;
    }

    Key getKey(){
        return k;
    }

    Value getValue(){
        return v;
    }

    @Override
    public String toString(){
        return "Items["+k+","+v+"]";
    }

}

public class withoutgen1 {
    public static void main(String[] args) {
        Items<Integer,String> stud1=new Items<Integer,String>(5,"Omji");
        System.out.println(stud1.getKeyTest(5));
        System.out.println(stud1);
    }
}

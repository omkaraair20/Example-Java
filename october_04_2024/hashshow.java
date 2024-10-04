import java.util.*;

public class hashshow {
    public static void main(String[] args) {
        Map<Integer,String> stud=new HashMap<Integer,String>();
        stud.put(18,"Virat kohli");
        stud.put(45,"Rohit Sharma");
        stud.put(63,"SK Yadav");
        stud.put(93,"Jasprit Bumarah");
        stud.put(8,"Ravindra Jadeja");

        System.out.println(stud.keySet());
        System.out.println(stud.values());
        System.out.println(stud.entrySet());

        for(Map.Entry<Integer,String> ob:stud.entrySet()){
            if(ob.getKey()%2==0){
                System.out.println(ob.getValue()+"your assignment is pending");
            }
        }
    }
}
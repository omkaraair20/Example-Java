import java.util.*;

public class HashMapExample {
    public static void main(String[] args) {
        Map<Integer,String> stringHashMap=new HashMap<Integer,String>();
        stringHashMap.put(1,"Hi");
        stringHashMap.put(2,"Java");
        stringHashMap.put(3,"Goal");
        stringHashMap.put(4,"Learning");
        stringHashMap.put(5,"Collection");

        System.out.println("Pair in hashMap:"+stringHashMap);
        System.out.println("Get all keys:"+stringHashMap.keySet());
        System.out.println("Get all values:"+stringHashMap.keySet());
        System.out.println("Get all entry set:"+stringHashMap.entrySet());

        Map<String,Integer> integerHashMap=new HashMap<String,Integer>();
        integerHashMap.put("A",101);
        integerHashMap.put("B",121);
        integerHashMap.put("C",110);
        integerHashMap.put("D",555);

        System.out.println("Pair in hashMap:"+integerHashMap);
        System.out.println("Get all keys:"+integerHashMap.keySet());
        System.out.println("Get all values:"+integerHashMap.values());
        System.out.println("Get all entry set:"+integerHashMap.entrySet());
    }
}

import java.util.function.BiPredicate;
import java.util.function.BiConsumer;


public class BinaryFunctionInterfacesDemo {
    public static void main(String[] args) {
        testBiPredicate();
        testBiConsumer();
    }

    static void testBiPredicate(){
        BiPredicate<Integer,Integer> result=(arg1,arg2) -> arg1 < arg2;
        System.out.println("BiPredicate.test() result:"+result.test(5,10));
    }
    static void testBiConsumer(){
        BiConsumer<String,String> result=(arg1,arg2) ->
                System.out.println("BiConsumer.accept() result:"+arg1+arg2);
        result.accept("Hello","Lambda");
    }
}


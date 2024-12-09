public class StaticDemo {
    private static String message="Hello!";
    public static String getMessage(){
        message="Hello! Hello!";
        return StaticDemo.message;
    }

    public static void main(String[] args) {
        message="Hello! Hello! Hello!";
        String msg=StaticDemo.getMessage();
        System.out.println(msg);
    }

    static {
        System.out.println(StaticDemo.getMessage());
    }
}
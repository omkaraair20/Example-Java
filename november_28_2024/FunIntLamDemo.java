interface ShowName{
    void show();
}

public class FunIntLamDemo {
    public static void main(String[] args) {
        ShowName ob=new ShowName() {
            @Override
            public void show() {
                System.out.println("I am annonymous class");
            }
        };
        ob.show();

        ShowName ob1=() -> System.out.println("I am lambda function");
        ob1.show();

        ShowName ob2=() -> {
                System.out.println("Hi! My name is omji");
        System.out.println("I am studying Java lambda function");
    };
                ob2.show();

    }
}

class demo{
    static int no;
    demo(){
        no++;
        System.out.println("in constructor");
    }
    static {
        System.out.println("in static block");
    }
    void show(){
        System.out.println("no="+no);
    }
    static void display(){
        System.out.println("hello");
    }
}

final class demo1{
    static int no;
    demo1(){
        no++;
        System.out.println("in constructor");
    }
    static {
        System.out.println("in static block");
    }
    final void show(){
        System.out.println("no="+no);
    }
    static void display(){
        System.out.println("hello");
    }
}

class demo_derived extends demo{
    @Override
    void show(){
        System.out.println("in demo derived");
    }
}

public class StaticUse {
    public static void main(String[] args) {
        demo d1=new demo();
        d1.show();
        demo d2=new demo();
        d2.show();
        demo d3=new demo();
        d3.show();

        demo d4=new demo_derived();
        d4.show();

        demo.display();
    }
}

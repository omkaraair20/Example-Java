class Main {
    public static void main(String[] args) {
        DemoClass demo=new DemoClass();
        //demo<String> genericsMethod("Java programming");
        //demo<Integer>genericsMethod(25);
    }
}

class DemoClass{
    public<T> void genericsMethod(T data){
        System.out.println("Generics method:");
        System.out.println("Data passed:"+data);
        //demo<String>genericMethod("Java programming");
        //demo<Integer>genericMethod(25);
        //demo.genericsMethod("Java programming");
    }
}

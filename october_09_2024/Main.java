class Data<T>{
    T data;

    public Data(T data){
        this.data=data;
    }

    public T getData(){
        return data;
    }
}

public class Main {
    public static void main(String[] args) {
        Data<Integer> a=new Data<>(1);
    }
}

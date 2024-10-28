class xyz {
    int x;
    int y;

    xyz(){
        System.out.println("in xyz default");
        x=8;
        y=90;
    }

    xyz(int x,int y){
        System.out.println("in xyz");
        this.x=x;
        this.y=y;
    }

    @Override
    public String toString(){
        return x+","+y;
    }
}

class abc extends xyz{
    abc(){

    }
    abc(int x,int y){
        super(x,y);
        System.out.println("in abc");
    }
}

public class cosdemo {
    public static void main(String[] args) {
        abc ob=new abc();
        System.out.println(ob);
    }   
}

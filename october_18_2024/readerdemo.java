import java.io.FileReader;
import java.io.Reader;

public class readerdemo {
    public static void main(String[] args) {
        try{
            Reader reader=new FileReader("data.txt");
            int data=reader.read();
            System.out.println(data);

            while(data>=0){
                System.out.println((char)data);
                data=reader.read();
            }
            reader.close();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}

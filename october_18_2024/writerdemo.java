import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class writerdemo {
    public static void main(String[] args) {
        try{
            Writer w=new FileWriter("D:\\outputfile.txt");
            String data="My favourite is cricket player see the match";
            w.write(data);
            w.close();

            System.out.println("Successfully written.........");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
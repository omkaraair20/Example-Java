import java.io.*;

public class Student implements java.io.Serializable{
    public String stu_Name;
    public int stu_id;

    public static void main(String[] args) {
        Student std=new Student();
        std.stu_Name="Omkar";
        std.stu_id=1;

        Student deserializedStudent;

        try{
            FileOutputStream fileOut=new FileOutputStream("storeObject.txt");
            ObjectOutputStream out=new ObjectOutputStream(fileOut);
            out.writeObject(std);
            out.close();
            fileOut.close();

            System.out.println("Object serialized");

            FileInputStream fileIn=new FileInputStream("storeObject.txt");
            ObjectInputStream in=new ObjectInputStream(fileIn);
            deserializedStudent=(Student) in.readObject();
            in.close();
            fileIn.close();

            System.out.println("Deserialized Student......");
            System.out.println("Name:"+deserializedStudent.stu_Name);
        }
        catch(IOException i){

        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}

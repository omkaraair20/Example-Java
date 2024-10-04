import java.util.TreeMap;

public class TreeMapDemo{
    public static void main(String[] args) {
        TreeMap<Student,String> treeMap=new TreeMap<Student,String>(new AgeComparator());
        treeMap.put(new Student(1,"John",19),"From USA");
        treeMap.put(new Student(2,"Ram",18),"From India");
        treeMap.put(new Student(3,"Krishna",20),"From UK");

        System.out.println("Sorted by age:");
        for(Student student:treeMap.keySet()){
            System.out.println(student.age);
            System.out.println(student.name);
            System.out.println(student.rollNo);
        }
    }
}

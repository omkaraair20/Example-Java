import java.util.Comparator;

public class Student {
    int rollNo;
    String name;
    int age;
    Student(int rollNo,String name,int age){
        this.rollNo=rollNo;
        this.name=name;
        this.age=age;
    }
}

class AgeComparator implements  Comparator<Student>
{
    @Override
    public int compare(Student student1,Student student2){
        if(student1.age==student2.age)
            return 0;
        else if (student1.age>student2.age)
            return 1;
        else
            return -1;
        }
}


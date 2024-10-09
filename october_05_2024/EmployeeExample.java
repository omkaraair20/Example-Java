import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

class Arraylist {
    public static void main(String[] args) {
        List<String> pick=new ArrayList<>();
        pick.add("cricket");
        pick.add("carrom");
        pick.add("chess");

        System.out.println(pick);

        for(String a:pick){
            System.out.println(a);
        }

        Iterator<String> str=pick.iterator();
        while(str.hasNext()){
            System.out.println(str.hasNext());
        }

        pick.add(3,"chess");
        pick.add(2,"carrom");
        pick.remove(1);
        System.out.println(pick);
        String pick1[]={"cricket","carrom","chess"};
        List<String> pik=Arrays.asList(pick1);
        System.out.println(pik);
        pick.addAll(pik);
        System.out.println(pick);
    }
}

class Employee {
    int id;
    String name;
    String department;

    public Employee(int id,String name,String department){
        this.id=Integer.parseInt(String.valueOf(id));
        this.name=name;
        this.department=department;
    }

    public int getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public String getDepartment(){
        return department;
    }

    @Override
    public String toString(){
        return "Employee{" +
                "id="+id+
                ",name="+name+'\''+
                ",department="+department+'\''+
                '}';
    }
}

public class EmployeeManager {
    ArrayList<Employee> employees;

    public void addEmployee(Employee employee){
        employees.add(employee);
        System.out.println("Employee added:"+employee);
    }

    public void updateEmployee(int id,String newName,String newDepartment){
        for(int i=0;i<employees.size();i++){
            Employee updatedEmp=new Employee(id,newName,newDepartment);
            employees.set(i,updatedEmp);
            System.out.println("Employee updated:"+updatedEmp);
            return;
        }
    }

    public void deleteEmployee(int id){
        for(int i=0;i<employees.size();i++){
            if(employees.get(i).getId()==id){
                Employee emp=employees.remove(i);
                System.out.println("Employee deleted:"+emp);
                return;
            }
        }
        System.out.println("Employee with ID"+id+"not found");
    }
}

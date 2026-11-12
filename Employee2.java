import java.util.Scanner;
 class Employee{
    private String name;
    private int id;
    private double salary;
    void getter()
    {
        System.out.println(name);
        System.out.println(id);
        System.err.println(salary);
    }
    void setter(String n,int i, double s)
    {
        name=n;
        id=i;
        salary=s;
    }
    
}
public class Employee2{
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
    Employee e=new Employee();
    System.out.println("Enter name:");
    String a=sc.nextLine();
    System.out.println("Enter id:");
    int b=sc.nextInt();
    System.out.println("Enter salary:");
    double c=sc.nextDouble();
    e.setter(a,b,c);
    e.getter();

    }
    

}

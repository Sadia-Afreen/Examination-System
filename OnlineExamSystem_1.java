package onlineexamsystem_1;
import java.io.IOException;
import java.util.Scanner;
public class OnlineExamSystem_1 {
    public static void main(String[] args)throws IOException 
    {
        Welcome ob1=new Welcome();
        Department dep=new Department();
        Student1 s1=new Student1();
        Student2 s2=new Student2();
        Scanner scanner=new Scanner(System.in);
        int n;

            ob1.studinfo();
            System.out.println("Enter Department: ");
            String dept1=scanner.nextLine();
            if("ICT".equals(dept1))
            {
                System.out.println("There are two courses in ICT: 1.Math, 2.Physics.\n\n");
                dep.math();
                s1.show_m();
                dep.physics();
                s1.show_p();
            }
            else if("ES".equals(dept1))
            {
                System.out.println("There are two courses in ES: 1.Chemistry, 2.English.\n\n");
                dep.chem();
                s1.show_c();
                dep.eng();
                s1.show_e();
            }   
            
            ob1.studinfo();
            System.out.println("Enter Department: ");
            String dept2=scanner.nextLine();
            if("ICT".equals(dept2))
            {
                System.out.println("There are two courses in ICT: 1.Math, 2.Physics.\n\n");
                dep.math();
                s2.show_m();
                dep.physics();
                s2.show_p();
                
            }
            else if("ES".equals(dept2))
            {
                System.out.println("There are two courses in ES: 1.Chemistry, 2.English.\n\n");
                dep.chem();
                s2.show_c();
                dep.eng();
                s2.show_e();
            }   
    }
}

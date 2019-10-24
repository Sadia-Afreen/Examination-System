package onlineexamsystem_1;
import java.util.Scanner;
class Welcome {
     final int password=1234;
     void Start()
    {
       System.out.println("Enter password to login: ");
       Scanner scanner=new Scanner(System.in);
       int p=scanner.nextInt();
       if(password==p)
       {
           System.out.println("============" + "=================");
           System.out.println("Welcome to Online Examination System!");
           System.out.println("============" + "=================");
       }
    }    
    void studinfo()
    {
        this.Start();
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter Name: ");
        String name=scanner.nextLine();
        System.out.println("Enter ID: ");
        String id=scanner.nextLine();
    }
}

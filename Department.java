package onlineexamsystem_1;
import java.util.Scanner;
public class Department{
    public int i, m=0,p=0,c=0,e=0;
    Scanner scanner=new Scanner(System.in);
    void math()
    {
        System.out.println("    Mathematics:                        Total Marks: 2\n\n");
        System.out.println("1.	What is 20 percent off of 30 dollars?");
        System.out.println("2.	What are all the prime numbers between 20 and 30?");        
    }
    void physics()
    {
        System.out.println("    Physics:                        Total Marks: 2\n\n");
        System.out.println("1. Which of the following materials will be attracted to a magnet?\n" +
"\n" +
" a) Plastic\n" +
" b) A shark\n" +
" c) Cotton\n" +
" d) Iron ");        
        System.out.println("2. What was the name of the man who shouted 'Eureka' when he got into the bath?\n" +
"\n" +
" a) Leonardo da Vinci\n" +
" b) Archimedes\n" +
" c) Isaac Newton\n" +
" d) Harry Potter ");               
    }
    void chem()
    {
        System.out.println("    Chemistry:                        Total Marks: 2\n\n");
        System.out.println("1.  Pure water has a pH level of around?");        
        System.out.println("2.	What is the name of the element with the chemical symbol ‘He’?");             
    }
    void eng()
    {
        System.out.println("    English:                        Total Marks: 2\n\n");
        System.out.println("1.	Jenny ___________ tired.");     
        System.out.println("2.	Today is Wednesday. Yesterday it ___________ Tuesday.");              
    }
}


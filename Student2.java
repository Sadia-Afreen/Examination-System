package onlineexamsystem_1;
public class Student2 extends Department implements Student {

    public void show_m() {
        System.out.print("1. Ans: ");
        String q1 = scanner.nextLine();
        if ("6".equals(q1)) {
            m++;
        }
        System.out.print("2. Ans: ");
        String q2 = scanner.nextLine();
        if ("23 and 29".equals(q2)) {
            m++;
        }
        System.out.println("\nTotal Marks in Math: "+m+"\n************"+"***********\n\n");

    }
    public void show_p() {
        System.out.print("1. Ans: ");
        String q1 = scanner.nextLine();
        if ("d".equals(q1)) {
            p++;
        }
        System.out.print("2. Ans: ");
        String q2 = scanner.nextLine();
        if ("b".equals(q2)) {
            p++;
        }
        System.out.println("\nTotal Marks in Physics: "+p+"\n************"+"***********\n\n");
    }    
    public void show_c() {
        System.out.print("1. Ans: ");
        String q1 = scanner.nextLine();
        if ("7".equals(q1)) {
            c++;
        }
        System.out.print("2. Ans: ");
        String q2 = scanner.nextLine();
        if ("helium".equals(q2)) {
            c++;
        }
        System.out.println("\nTotal Marks in Chemistry: "+c+"\n************"+"***********\n\n");
    }
    public void show_e() {
        System.out.print("1. Ans: ");
        String q1 = scanner.nextLine();
        if ("is".equals(q1)) {
            e++;
        }
        System.out.print("2. Ans: ");
        String q2 = scanner.nextLine();
        if ("was".equals(q2)) {
            e++;
        }
        System.out.println("\nTotal Marks in English: "+e+"\n************"+"***********\n\n");
    }
}

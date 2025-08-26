import java.util.*;

public class employe {
    int salary;
    String name;

    public void getdetails() {
        System.out.println("printing details");
        System.out.println("name is " + name);
        System.out.println("your salary is " + salary);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
     employe user = new employe();
        user.salary = scan.nextInt();
        user.name = scan.next(); 
        user.getdetails();

    }
}

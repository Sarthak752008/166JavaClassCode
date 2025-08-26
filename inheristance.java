class employee1{
int iddd;
String person;
void details(){
    System.out.println("idd of person"+" "+ iddd + "name of person " +" "+ person);
}
}
class facul extends employee1{
    String department;
    String subject;

    void detailss(){
        System.out.println("department of a person is " + department +" " +" subject is " +
        subject);
    }
    
}
public class inheristance {
    //extend krte hai paret class ki property ko child class
    //types of inehritance
    //1 single
    //2 multilevel
    //3 heirarchial
    public static void main(String[] args) {
        facul fu=new facul();
        fu.iddd=12333;
        fu.person="harish";
        // fu.department="hr";
        // fu.subject="hindi";
        fu.detailss();

    }
    

}

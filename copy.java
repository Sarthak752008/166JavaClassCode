// public class copy {
//     int em_id;
//     String em_name;
//     copy(int i,String n){
//        em_id=i;
//        em_name=n;
//     }
//     copy(copy s1){
//        em_id =s1.em_id;//reference use kia h 
//         em_name=s1.em_name;
//     }
//     void display(){
//         System.out.println( em_name+" " +em_id);
//     }
//     public static void main(String[] args) {

//         //by constructor or “makes a clone of s2”.
//         copy s2=new copy(24,"radha");
//         copy s1=new copy(s2);//constructor jruri h bnana wrna value kha hi jaeygi
//         s2.display();
//         s1.display();
//         s1.em_id=456;
//         s1.em_name="krishna";
//         s1.display();





//         //chllak student k km;
//         // copy codeCopy;
//         // codeCopy=s2;
//         // s2.display();;
//         // codeCopy.display();
//         // codeCopy.em_id=234;
//         // codeCopy.em_name="hari";
//         // codeCopy.display();
//         // s2.display();
//     }
// }
public class copy {
    int em_id;
    String em_name;

    // Parameterized constructor
    copy(int i, String n) {
        em_id = i;
        em_name = n;
    }

    // Copy constructor
    copy(copy s1) {
        em_id = s1.em_id;
        em_name = s1.em_name;
    }

    // Display method
    void display() {
        System.out.println(em_name + " " + em_id);
    }

    public static void main(String[] args) {
        // Using constructor and copy constructor
        copy s2 = new copy(24, "radha");
        copy s1 = new copy(s2); // Makes a clone of s2

        s2.display();  // Output: radha 24
        s1.display();  // Output: radha 24

        // Changing s1 values
        s1.em_id = 456;
        s1.em_name = "krishna";

        s1.display();  // Output: krishna 456
        s2.display();  // Output: radha 24 (unchanged)
    }
}

// public class constructor {
//     int id;
//     String name;
    
//     constructor(){
//         id=100;//agr hum this keyword k use ni krenge then id m null ayega
//         name="radhaju";//isme 0
//     }
//     public void display(){
//         System.out.println("Details are  " + this.id+this.name);
//         System.out.println("hello " + this.name + "you roll no. " + this.id );
//     }
//     public static void main(String[] args) {
//       constructor m2=new constructor();
    
//         m2.display();
//     }

// }
public class constructor {
    int id;
    String name;
    
    constructor(){
        id=100;//agr hum this keyword k use ni krenge then id m null ayega
        name="radha";//isme 0
        System.out.println("Details are  " + id+name);
    }
    constructor(int id,String name){
        this.id=id;
        this.name=name;//local variable or insTANCe var md ifffernce k liye 
        System.out.println("hello radha ju "+ " meet " + id+ name);
    }
    public void display(){
        // System.out.println("Details are  " +id+name);
        System.out.println("hello " + name + "you roll no. " + id );
        System.out.println("------------------------");
    }
    public static void main(String[] args) {
      constructor m2=new constructor();
        m2.id=100;
        m2.name="radha";
        m2.display();
        constructor m3=new constructor();
        m3.id=10000;
        m3.name="krsihna";
        m3.display();
        constructor m4 =new constructor(1111,"narishma bhgwan");
        m4.display();

    }

}

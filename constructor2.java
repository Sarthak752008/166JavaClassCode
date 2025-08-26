public class constructor {
    int id;
    String name;
    
    constructor(){
        id=100;//agr hum this keyword k use ni krenge then id m null ayega
        name="radhaju";//isme 0
        System.out.println("Details are  " + id+name);
    }
    public void display(){
        System.out.println("Details are  " +id+name);
        System.out.println("hello " + name + "you roll no. " + id );
    }
    public static void main(String[] args) {
      constructor m2=new constructor();
        m2.id=100;
        m2.name="radha";
        m2.display();
    }

}

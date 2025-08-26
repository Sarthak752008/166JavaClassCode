public class staticc {
    int em_id;
    static String Organisation;
    //static block is way to assing value to static variables so we no need to write a name 
    //firstly----sbse phle static wala block hi run hoga coz woh class loading k time call hota hai 
    //fr constructor call hoga coz new keyword bnate hi woh call hojata h isloye 
    //we can create a static variables till class only coz otheer khi kia toh woh locaol hojayega
    //execute in order they present
    static{
        staticc.Organisation="priya";
    }
    static void staticm(){
        System.out.println("this is a staic method");
        // System.out.println("Id  " + " " +em_id +" " +  "name  "   + " "+ Organisation);//gives error coz non static h emid isliye error ayega 

    }
    void details(){
        System.out.println("Id  " + " " +em_id +" " +  "name  "   + " "+ Organisation);
    
   } 
   public static void main(String[] args) {
    // staticc.Organisation="kiet";//static bna dia h isliye phle likh rhe hai yah pr hum 
    staticc se=new staticc();
    //static variable ko direct class s access kr skte hai no need to make object
    se.em_id=123;
    // se.Organisation="kiet";no need of it coz we make static method 
    se.details();
    staticc se2=new staticc();
    se2.em_id=124;
    // se2.Organisation="kiet";
    se2.details();
    staticm();//direct static method ko call kia h 
    //static method m bs static variable ko acces kr skte hai isliye woh error dega 
    // details();//this gives error 
    //outer class ko static ni bna skte but inner or nested ko bna kste hai static
   }
}

public class finall {//agr class ko final krdenge toh class ko extend ni kr skte error dega agr final kia
    //final key word used to restict the user to chnaage a value of variable mthod classs
    //just like constant
    //in method ---overriding restrict agr final bta dia toh toh ab child class khud ka koi km ni ka krti woh jo km kr rhi thi parent class usko kr wa sskti hai
    //class->inherit ni kr skenge class ko agr final bna dia
    int em_id;
  String Organision="kiet";
 
    void details(){//agr isko final krdenge toh override b ni hoga error dedega in child class agr change kia 
        System.out.println("Id  " + " " +em_id +" " +  "name  "   + " "+ Organision);
    
   } 
}
   class faculty extends finall{
    void details(){//method override krdia hai parent class dusra k kr rhi hai
        System.out.println("welconme to child class");
    }
   public static void main(String[] args) {
    // // staticc.Organisation="kiet";//static bna dia h isliye phle likh rhe hai yah pr hum 
    // finall ses=new finall();
    // //static variable ko direct class s access kr skte hai no need to make object
    // ses.em_id=123;
    // // ses.Organision="abes";//ab jese hi upr final bna dia error dega isko ko value fix krne k liye use krte hai
    // // se.Organision="abs";//ab kiet hi ayega coz humne final bna dia hai
    // ses.details();
    // //static ko br br value usekrne s  bchne k liye krte hai
    faculty f=new faculty();
    f.details();

    
   }
}





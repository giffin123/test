class A{
    public void Car(){
        System.out.println("Audi Car");
    }
}
class B extends A{
    public void Bike(){
      System.out.println("Duke");
    }
}
class C extends B{
 public void Cycle(){
     System.out.println("cycle");
 }
}
public class Miherit{
    public static void main(String[] args){
        C x=new C();
        x.Car();
        x.Bike();
        x.Cycle();
    }
}
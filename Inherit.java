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
public class Inherit{
public static void main(String[] args) {
    B x=new B();
    x.Car();
    x.Bike();
    
}
}
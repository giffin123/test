interface Parent1{
    default void car(){
        System.out.println("Audi car");
    }
}
interface Parent2{
    default void car(){
        System.out.println("masheratti");
    }
}
public class Multipleinheritance implements Parent1,Parent2{
    public void car(){
            Parent1.super.car();

        }
    public static void main(String[] args){
        Multipleinheritance x=new Multipleinheritance();
        x.car();
    }
}
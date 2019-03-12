import java.util.Scanner;
public class Add{
  public static void main(String[] args) {
    Scanner myinput=new Scanner(System.in);
    int a,b,c ;   
    System.out.println("Enter the 1st number:");
    a=myinput.nextInt();
    System.out.println("Enter the 2st number:");
    b=myinput.nextInt();
    c=a+b;
    System.out.println(c);


    }
}
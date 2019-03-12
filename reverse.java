import java.util.Scanner;
public class reverse{
    public static void main(String[] args) {
        int a,b=0,c;
        Scanner reve=new Scanner(System.in);
        System.out.println("enter the number");
        a=reve.nextInt();
        while(a!=0){
            c=a%10;
            b=b*10+c;
            a/=10;
        }
     System.out.println(b);   
    }
}
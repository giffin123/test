public class Prime1{
    public static void main(String[] args) {
        for(int i=2;i<=100;i++)
        {
            for(int j=2;j<i;j++)
            {
                if(i%j==0)
                {
                    break;
                }
                else if(i==j+1)
            {
                System.out.println(i);
            }
            
        }
        
    }
}
    
}
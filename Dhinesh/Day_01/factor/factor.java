package factor;

public class factor
 {
    public static void main(String[] args)
     {
        int n=4;
        int total=0;
        for(int i=1;i<=n;i++)
        {
            if(n%i==0)
            {
                System.out.println(i);
                total+=i;
            }
        }
        System.out.println("total : "+total);
    }
}

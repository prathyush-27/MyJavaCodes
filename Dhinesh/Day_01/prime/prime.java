 package prime;

class prime
 {
    public static void main(String[] args) 
    {
        int m=2;
        int n=10;
        series(m, n);

    }

    public static void series(int m,int n)
    {
        for(int i=m;i<=n;i++)
        {
            if(primecheck(i))
            {
                System.out.println(i+" ");
            }
        }
    }
    public static boolean primecheck(int n)
    {
        if(n<=1)
        {
            return false;
        }
        for(int i=2;i*i<=n;i++)
        {
            if(n%i==0)
            {
                return false;
            }
        }
        return true;
    }
}
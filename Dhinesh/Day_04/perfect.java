public class perfect 
{
  public static void main(String[] args) 
  {
    int m=1;
    int n=30;
    for(int i=m;i<n;i++)
    {
        int sum=0;
        for(int j=1;j<i;j++)
        {
            
            if(i%j==0)
            {
                sum+=j;
            }
        }
        if(sum==i && i!=1)
        {
            System.out.println(i);
        }
    }
  }  
}

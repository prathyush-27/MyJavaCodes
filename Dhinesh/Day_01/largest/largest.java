package largest;

public class largest 
{
    public static void main(String[] args) {
       int a=3;
       int b=5;
       int c=1;
       int temp=0;
       if(a<b)
       {
        temp=a;
        a=b;
        b=temp;
        
       }
       if(b<c)
       {
        temp=b;
        b=c;
        c=temp;
       }

       System.out.println(a);
        
       
    }
}

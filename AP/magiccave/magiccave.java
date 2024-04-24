import java.util.*;
class magiccave
{
    public static int check(int start,int end)
    {
        int a[]=new int[10];
        int count=1;
        int value=start;
        a[0]=start;
        int i=1;
        while(true)
        {
            
            if(value==start)
            {
                a[i]=start+1; //a[1]=23
                value=a[i];   //value=23
                count+=1;       //c=1
            }
            else if(value<=end)    //22<100
            {
                a[i+1]=a[i]+a[i-1];
                value=a[i+1];
                count+=1;
            }
            if(value>end)
            {
                break;
            }
            i++;
           

        }
        return count;
        
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the starting number :");
        int start=sc.nextInt();
        System.out.println("Enter the ending number :");
        int end=sc.nextInt();
        int num= check(start,end);
        System.out.println("Iterating times: "+num);
    }
}
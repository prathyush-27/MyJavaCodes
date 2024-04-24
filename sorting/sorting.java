import java.util.Scanner;
class sorting
{
    public static void main(String[]args)
    {
        int num[]=new int[10];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 10 Number");
        for(int i=0;i<10;i++)
        {
            num[i]=sc.nextInt();
        }
        for(int i=0;i<num.length;i++)
        {
            for(int j=1;j<num.length-i;j++)
            {
                if(num[j]<num[j-1])
                {
                int temp=num[j];
                num[j]=num[j-1];
                num[j-1]=temp;


                }
                
            }
        }
        System.out.println("Sorted arrays :");
        for(int x:num)
        {
            System.out.print(x+" ");
        }
    }
}
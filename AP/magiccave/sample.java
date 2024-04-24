public class sample {
    public static void check() 
    {
        int i=0;
    while(true)
    
    {
        
        if(i==0)
        {
            System.out.println("I is equal to 0");
        }
        else if(i<10)
        {
            System.out.println("I is less than 20");
        }
        if(i<=11)
        {
            break;
        }
        i++;
    }
    System.out.println("iteration : "+i);
    }
    public static void main(String[] args) {
        check();
    }
}

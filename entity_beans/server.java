public class server extends Thread
{
    
    public void display(String id,String name,String description,String price)
    {
         System.out.println(" \n");
        System.out.print("Fetching Data ");
        start();
        dot();
        run();
        System.out.println("\n \n");
        System.out.println("Your Product id is : "+id);
        System.out.println("Your Product Name is : "+name);
        System.out.println("Your Product Description is : "+description);
        System.out.println("Your Product Price is : "+price);
    }
    @Override
    public void run()
    {
        try {
            sleep(2000);
        } catch (InterruptedException e) {
           
            e.printStackTrace();
        }
    }

    public void dot()
    {
        try {
            for(int i=0;i<=5;i++){
            sleep(1000);
            System.out.print(".");
            }
        } catch (InterruptedException e) {
            
            e.printStackTrace();
        }
    }
 }


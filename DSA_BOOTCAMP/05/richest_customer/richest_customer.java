package richest_customer;

public class richest_customer 
{
    public static void main(String[]args)    
    {
        int [][] accounts={{1,2,3},{3,2,1},{7,0,3}};
        int maxValue=0;
        for(int i=0;i<accounts.length;i++)
        {
            int wealth=0;
            for(int j=0;j<accounts[i].length;j++)
            {
                wealth+=accounts[i][j];

            }
            if(wealth > maxValue)
            {
                maxValue=wealth;
            }
        }
        System.out.println("The largest amount is : "+maxValue);
    }
}
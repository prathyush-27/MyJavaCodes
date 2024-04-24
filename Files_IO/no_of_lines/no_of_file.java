import java.io.*;
public class no_of_file
{
    public static void main(String[]args)
    {
        String input_file="input.txt";
        String output_file="output.txt";
        try
        {
            BufferedReader br=new BufferedReader(new FileReader(input_file));
            int count=0;
            while(br.readLine()!= null)
            {
                count++;
            }
            br.close();
            BufferedWriter bw=new BufferedWriter(new FileWriter(output_file));
            bw.write("Number of Lines : "+count);
            bw.close();
            System.out.println("The no.of Output Lines are : "+output_file);
        }
        catch(Exception e)
        {
            System.out.println("Error : "+e);
        }
    }
}
import java.util.*;
class anagram
{
    public static boolean isAnagram(String a,String b)
    {
        if(a.length()!=b.length())
        {
            return false;
        }
        else
        {
            int [] count=new int[26];
            for(int i=0;i<a.length();i++)
            {
                count[a.charAt(i)-'a']++;
            }
            for(int i=0;i<b.length();i++)
            {
                count[b.charAt(i)-'a']--;
            }
            for(int ct:count)
            {
                if(ct!=0)
                {
                    return false;
                }
            }
            return true;
        }
     }
    
  public static void main(String[] args) 
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter two Strings");
    String a=sc.nextLine();
    String b=sc.nextLine();
    boolean result=isAnagram(a,b);
    System.out.println((result)?"Anagram":"Not Anagram");
   }
}
class leetcodesample
{
    public static void main(String[] args) 
    {
       String s="PPALA";
       char[]s1=s.toCharArray();
        int acount=0;
        int lcount=0;
        int pcount=0;
for(int i=0;i<s.length()-1;i++)
{
    // System.out.println(s1[i]);
	if(s1[i]=='A')
	{
        
	 acount+=1;
	 }
    //  System.out.println(s1[i]);
	//  if(s1[i]=='P')
	// {
          
	//  pcount=pcount+;
	//  }
    //  System.out.println(s1[i]);
	 if(s1[i]=='L')
	{
          
	 lcount+=1;
	 }
	 
}
System.out.println(acount);
// System.out.println(pcount);
System.out.println(lcount);

if(acount>2 && lcount>=3)
{
    System.out.println("false");
}
else{
        System.out.println("True");

}


    }
}
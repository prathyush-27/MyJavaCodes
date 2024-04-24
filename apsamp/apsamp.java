class Calc
{
    protected int p;
    static protected int q;
    public void doSomething(int x,int y)
    {
        p*=x;
        q+=y;
    }
}
class MainClass
{
   public static void main(String[] args) 
   {
        Calc c1=new Calc();
        Calc c2=new Calc();
        c1.p=20;
        c1.q=10;

        int a=42/4;
        c2.doSomething(a,a/2);
        c2.q=31;
        c2.doSomething(a, a);
        System.out.println(c1.p);
        System.out.println(c1.q);
        System.out.println(c2.p);
        System.out.println(c2.q);
    }
}
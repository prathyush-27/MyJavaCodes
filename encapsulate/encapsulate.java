
class human
{
    private int age=11;
    private String name="hello";

     int getAge()
    {
        System.out.println("Printing age....");
        return age;
    }
    String getName()
    {
        System.out.println("printing name .....");
        return name;
    }
}

class Run
{
    public static void main(String[] args)
     {
        human ob = new human();
        System.out.println(ob.getAge());
        System.out.println(ob.getName());
    }
   
}
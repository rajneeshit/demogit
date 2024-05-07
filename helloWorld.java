public class helloWorld
{  
public static void main(String args[])
{
    demo obj = new demo();
    obj.num=20;
    obj.str="hello";
    obj.show();
}
}
class demo
{ 
    int num;
    String str;
    public void show()
    {

        System.out.println(num + " :" + str);
    }
}

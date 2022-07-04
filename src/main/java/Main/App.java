package Main;

public class App 
{
    public static void main( String[] args )
    {
       System.out.println(checknumber(20));
    }
    public static boolean checknumber(int num)
    {
    	if(num%2==0)
    		return true;
    	else
    		return false;
    }
}

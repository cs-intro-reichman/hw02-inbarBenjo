public class Perfect {
public static void main(String[] args)
{

int a = Integer.parseInt(args[0]);
String  perfect = "";
int sum = 0 ; 

for (int i=1; i < a ; i ++ )
{
	if (a %  i == 0 ) 
	{
         
        if (i != 1)
        {
        	perfect += " + " + i ; 
        } 
		else 
		{
           perfect += i;
		}
		sum = sum + i ; 

	}
}
if (sum == a)
{
 System.out.println(a + " is a perfect number since " + a + " = " + perfect);
}
else 
{
   System.out.println(a + " is  not a perfect number");
}

}
}

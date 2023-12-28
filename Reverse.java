public class reverse {
public static void main(String[] args)
{
String a = (args[0]);
int len = a.length();
String b = "";
for (int i = len-1; i >= 0 ; i -- ) 
{
	b = b + a.charAt(i); 
}

int mid = len / 2 ; 

System.out.println(b);
System.out.println(" The middle character is " + b.charAt(mid));


} 
} 
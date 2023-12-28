public class InOrder {
public static void main(String[] args)
{
int randnum1 = (int) ((Math.random() * (10-0))+0);
int randnum2 = (int) ((Math.random() * (10-0))+0);
System.out.print(randnum1 + " ");

while ( randnum2 > randnum1)
{     
	System.out.print(randnum2 + " ");
	randnum1= randnum2; 
    randnum2= (int) ((Math.random() * (10-0))+0);
    
	 
}



}
}
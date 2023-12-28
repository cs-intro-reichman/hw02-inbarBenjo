public class OneOfEach {
public static void main(String[] args)
{

  boolean g = false ; 
  boolean b = false ; 
  int childSum = 0; 

  double child = (double) ((Math.random() * (1-0))+0);
  
  while ( g == false || b == false)
  {

  	if (child < 0.5)
  	{
  		g= true;
  		System.out.print( " g " );
  	}

  	if (child >= 0.5 && child <1)
  	{
  		b=true;
  		System.out.print( " b " );
  	}
      childSum ++; 
      child = (double) ((Math.random() * (1-0))+0);
  }
   
   System.out.println();
   System.out.println( "You made it... and you now have " + childSum + " children" );

  

}
}
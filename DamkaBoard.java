public class DamkaBoard {
public static void main(String[] args)
{
  int n = Integer.parseInt(args[0]);
  int i = 0; 

  while ( i < n) 
  { 
     int b = 0; 
     while (b < n) 
     {
       System.out.print("* " );
       b++;
     }

        if (i%2==0)
        {
          System.out.println( " " + " " );
          System.out.print(" ");
        }
        else
        {
          System.out.println();
        }
       	
       	i++;
    
  }


}
}

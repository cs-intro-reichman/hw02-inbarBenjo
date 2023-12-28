import java.util.Random;
public class OneOfEachStats {
public static void main(String[] args)
{

double t = Integer.parseInt(args[0]);
int count = 0; 
double sumAllFamily = 0; 
int twoChild=0; 
int threeCchild=0; 
int fourChild=0; 
int seed = Integer.parseInt(args[1]);
Random generator = new Random(seed);


  boolean g = false ; 
  boolean b = false ; 
  int childSum = 0; 
  double child = (double) (generator.nextDouble());
  
  while (count <=t )
  {
    while ( g == false || b == false)
      {

        if (child < 0.5)
        {
            g= true;
        }

        if (child >= 0.5 && child <1)
        {
            b=true;
        }

        sumAllFamily ++;  
          childSum ++; 
        child = (double) (generator.nextDouble());

     }
          if (childSum == 2)
          {
            twoChild ++; 
          }
        if (childSum == 3)
          {
              threeCchild++;
          }
          if (childSum >=4 )
           {
                    fourChild++; 
           }
          
          childSum = 0; 
          count ++; 
          g = false; 
          b= false ;
        
   }


        double average= sumAllFamily/ t ; 
        int max1 = Math.max(twoChild,threeCchild);
        int mostCommonChild = Math.max(max1,fourChild); 

         System.out.println("Average: " + average + " children to get at least one of each gender");
         System.out.println("Number of families with 2 children: " + twoChild); 
         System.out.println("Number of families with 3 children: " + threeCchild); 
         System.out.println("Number of families with 4  or more children: " + fourChild); 
         if (mostCommonChild == twoChild)
         {
                 System.out.println("The most common number of children is 2."); 
         }
        
         if (mostCommonChild==threeCchild)
            {
                System.out.println("The most common number of children is 3."); 
            }
         if (mostCommonChild == fourChild)
            {
                        System.out.println("The most common number of children is 4 or more."); 
                }
         
         
         
         

         





  }



}

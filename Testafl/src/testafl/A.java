
package testafl;
import java.util.Scanner;


public class A 
        /* class specil of normal citizen*/
{
     int ag,ns,child;   
        
    public void citizen()
    {
   
        Scanner ag1 = new Scanner(System.in);  
        System.out.print("enter your identificate number :  ");
       this.ns=ag1.nextInt();
        System.out.println(" your ns is : "+this.ns);
        System.out.print("enter your age :  ");
        this.ag=ag1.nextInt();
        System.out.println(" your age is : "+this.ag);
        System.out.print(" How many children are you  : ");
        this.child=ag1.nextInt();
        System.out.println(" your have : "+this.child+ " childrens");
        System.out.println("");System.out.println("");System.out.println("");
    
    
    }
    
}

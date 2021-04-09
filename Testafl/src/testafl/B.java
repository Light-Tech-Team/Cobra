
package testafl;

import java.util.Scanner;


public class B extends A {
    /* class specil of endicaped citizen */
    int pcen;
    @Override
            public void citizen()
    {
        Scanner ag1 = new Scanner(System.in);  
        System.out.print("enter your identificate number :  ");
        ns=ag1.nextInt();
        System.out.println(" your ns is : "+ns);
        System.out.print("enter your age :  ");
        ag=ag1.nextInt();
        System.out.println(" your ns is : "+ag);
        System.out.print("enter your child number :  ");
        child=ag1.nextInt();
        System.out.println(" your have : "+child+"childrens");
        
        System.out.println(" enter your endecape percent : ");
        for (int i=0;i<3;i++)
        {
        pcen=ag1.nextInt();
        if (pcen>0 && pcen<100)
        {
        System.out.println(" your ns is : "+pcen);
        System.out.println("");System.out.println("");System.out.println("");
        
  
        break;
        }
        else
        {
        System.out.println(" please enter the correct percent");
        }
        
        }
    }
}
        
        
        
        
    
    
    
    
    
    

    

    

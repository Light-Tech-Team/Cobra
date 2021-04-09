
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
        this.ns=ag1.nextInt();
        System.out.println(" your ns is : "+this.ns);
        System.out.print("enter your age :  ");
        this.ag=ag1.nextInt();
        System.out.println(" your ns is : "+this.ag);
        System.out.print("enter your child number :  ");
        this.child=ag1.nextInt();
        System.out.println(" your have : "+this.child+"childrens");
        
        System.out.println(" enter your endecape percent : ");
        for (int i=0;i<3;i++)
        {
        this.pcen=ag1.nextInt();
        if (this.pcen>0 && this.pcen<100)
        {
        System.out.println(" your ns is : "+this.pcen);
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
        
        
        
        
    
    
    
    
    
    

    

    

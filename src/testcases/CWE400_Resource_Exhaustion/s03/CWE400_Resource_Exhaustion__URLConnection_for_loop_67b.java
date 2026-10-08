                                   
                                                                     
                                                           
                                          
  
  
               
                               
                                                                           
                                                                  
                  
                                                                                
                                                           
                                                                                                                              
  
     

package testcases.CWE400_Resource_Exhaustion.s03;
import testcasesupport.*;

import javax.servlet.http.*;

public class CWE400_Resource_Exhaustion__URLConnection_for_loop_67b
{
    public void badSink(CWE400_Resource_Exhaustion__URLConnection_for_loop_67a.Container countContainer ) throws Throwable
    {
        int count = countContainer.containerOne;

        int i = 0;

        /* Bound the loop count to a sane maximum so an attacker-controlled value
         * cannot drive unbounded iteration and exhaust resources. Legitimate small
         * counts continue to work unchanged. */
        final int MAX_LOOP_COUNT = 1000;
        if (count > MAX_LOOP_COUNT)
        {
            count = MAX_LOOP_COUNT;
        }

        for (i = 0; i < count; i++)
        {
            IO.writeLine("Hello");
        }

    }

                                                
    

                                                
    
}

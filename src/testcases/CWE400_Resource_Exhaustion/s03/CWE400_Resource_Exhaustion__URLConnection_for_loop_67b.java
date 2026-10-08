                                   
                                                                     
                                                           
                                          
  
  
               
                               
                                                                           
                                                                  
                  
                                                                                
                                                           
                                                                                                                              
  
     

package testcases.CWE400_Resource_Exhaustion.s03;
import testcasesupport.*;

import javax.servlet.http.*;

public class CWE400_Resource_Exhaustion__URLConnection_for_loop_67b
{
    public void badSink(CWE400_Resource_Exhaustion__URLConnection_for_loop_67a.Container countContainer ) throws Throwable
    {
        int count = countContainer.containerOne;

        int i = 0;

                                                                                        
        for (i = 0; i < count; i++)
        {
            IO.writeLine("Hello");
        }

    }

                                                
    

                                                
    
}

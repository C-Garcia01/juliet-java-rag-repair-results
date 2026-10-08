                                   
                                                                   
                                                              
                                          
  
  
               
                             
                                                                
                                                                  
                   
                                                                              
                                                            
                                                                                                                                                
  
     

package testcases.CWE191_Integer_Underflow.s05;
import testcasesupport.*;

import javax.servlet.http.*;

public class CWE191_Integer_Underflow__int_Environment_predec_68b
{
    public void badSink() throws Throwable
    {
        int data = CWE191_Integer_Underflow__int_Environment_predec_68a.data;

                                                                              
        int result = (int)(--data);

        IO.writeLine("result: " + result);

    }

                                                
    

                                                
    
}

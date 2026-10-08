                                   
                                                                       
                                                              
                                          
  
  
               
                             
                                                                                       
                                                                  
                   
                                                                              
                                                            
                                                                                                                                                
  
     

package testcases.CWE191_Integer_Underflow.s04;
import testcasesupport.*;

import javax.servlet.http.*;

public class CWE191_Integer_Underflow__int_PropertiesFile_postdec_68b
{
    public void badSink() throws Throwable
    {
        int data = CWE191_Integer_Underflow__int_PropertiesFile_postdec_68a.data;

                                                                              
        if (data > Integer.MIN_VALUE)
        {
            data--;
        }
        int result = (int)(data);

        IO.writeLine("result: " + result);

    }

                                                
    

                                                
    
}

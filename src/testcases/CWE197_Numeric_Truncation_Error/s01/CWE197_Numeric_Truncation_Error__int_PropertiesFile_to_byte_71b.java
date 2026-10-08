                                   
                                                                              
                                                                     
                                         
  
  
               
                                    
                                                                                       
                                                                  
                 
                                      
                                                                                                                                              
  
     

package testcases.CWE197_Numeric_Truncation_Error.s01;
import testcasesupport.*;

public class CWE197_Numeric_Truncation_Error__int_PropertiesFile_to_byte_71b
{
    public void badSink(Object dataObject ) throws Throwable
    {
        int data = (Integer)dataObject;

        {
            if (data >= Byte.MIN_VALUE && data <= Byte.MAX_VALUE)
            {
                IO.writeLine((byte)data);
            }
            else
            {
                IO.logger.log(java.util.logging.Level.WARNING, "Value is out of range for a byte and would be truncated: " + data);
            }
        }

    }

                                                
    
}

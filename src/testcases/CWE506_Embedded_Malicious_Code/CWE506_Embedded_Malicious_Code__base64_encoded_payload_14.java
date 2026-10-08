                                   
                                                                        
                                                               
                                      
  
  
              
                                  
                               
                                      
                                                                             
                                                                              
 
    

package testcases.CWE506_Embedded_Malicious_Code;

import testcasesupport.*;

import org.apache.commons.codec.binary.Base64;

import java.io.IOException;

import java.util.logging.Level;

public class CWE506_Embedded_Malicious_Code__base64_encoded_payload_14 extends AbstractTestCase
{
    public void bad() throws Throwable
    {
        if (IO.staticFive == 5)
        {
            /* No embedded command is executed. */
        }
    }

                                                              
    

                                                         
    

    public void good() throws Throwable
    {
    }

                                                                          
                                                                            
                                                                             
                                                                       
       
    public static void main(String[] args) throws ClassNotFoundException,
           InstantiationException, IllegalAccessException
    {
        mainFromParent(args);
    }
}

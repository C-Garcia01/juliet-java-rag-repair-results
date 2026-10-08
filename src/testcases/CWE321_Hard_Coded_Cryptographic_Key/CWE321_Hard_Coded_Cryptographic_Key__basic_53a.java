                                   
                                                             
                                                                           
                                         
  
  
               
                                 
                                            
                                                          
         
                                               
                                                                                                                                                                         
  
     

package testcases.CWE321_Hard_Coded_Cryptographic_Key;

import testcasesupport.*;

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

import java.util.logging.Level;

public class CWE321_Hard_Coded_Cryptographic_Key__basic_53a extends AbstractTestCase
{
    public void bad() throws Throwable
    {
        String data;

                                                 
        data = System.getenv("CRYPTO_KEY");

        (new CWE321_Hard_Coded_Cryptographic_Key__basic_53b()).badSink(data );
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

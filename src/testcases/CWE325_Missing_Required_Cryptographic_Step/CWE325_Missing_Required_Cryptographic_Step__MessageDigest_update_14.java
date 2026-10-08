                                   
                                                                                  
                                                                           
                                      
  
  
              
                                              
                             
                                                     
                                                     
                                                                              
 
    

package testcases.CWE325_Missing_Required_Cryptographic_Step;

import testcasesupport.*;

import java.security.MessageDigest;

public class CWE325_Missing_Required_Cryptographic_Step__MessageDigest_update_14 extends AbstractTestCase
{
    public void bad() throws Throwable
    {
        if (IO.staticFive == 5)
        {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-512");
                                                                                                              
            IO.writeLine(IO.toHex(messageDigest.digest()));
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

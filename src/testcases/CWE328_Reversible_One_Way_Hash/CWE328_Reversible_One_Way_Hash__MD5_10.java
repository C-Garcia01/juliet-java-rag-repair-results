                                   
                                                     
                                                               
                                      
  
  
              
                                  
            
                     
                  
                                                                         
 
    

package testcases.CWE328_Reversible_One_Way_Hash;

import testcasesupport.*;

import java.security.MessageDigest;

public class CWE328_Reversible_One_Way_Hash__MD5_10 extends AbstractTestCase
{
    public void bad() throws Throwable
    {
        if (IO.staticTrue)
        {
            String input = "Test Input";
                                                                      
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-512");
            byte[] hashValue = messageDigest.digest(input.getBytes("UTF-8"));                                                          
            IO.writeLine(IO.toHex(hashValue));
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

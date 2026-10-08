                                   
                                                             
                                                                            
                                      
  
  
              
                                                      
        
                                                     
                                             
                                                                                                 
 
    

package testcases.CWE760_Predictable_Salt_One_Way_Hash;

import testcasesupport.*;

import java.security.MessageDigest;
import java.security.SecureRandom;
import java.util.Random;

public class CWE760_Predictable_Salt_One_Way_Hash__basic_04 extends AbstractTestCase
{
                                                                     
                                                                       
                          
       
    private static final boolean PRIVATE_STATIC_FINAL_TRUE = true;
    private static final boolean PRIVATE_STATIC_FINAL_FALSE = false;

    public void bad() throws Throwable
    {
        if (PRIVATE_STATIC_FINAL_TRUE)
        {
            SecureRandom random = new SecureRandom();
            MessageDigest hash = MessageDigest.getInstance("SHA-512");
                                                      
            byte[] salt = new byte[16];
            random.nextBytes(salt);
            hash.update(salt);
            byte[] hashValue = hash.digest("hash me".getBytes("UTF-8"));
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

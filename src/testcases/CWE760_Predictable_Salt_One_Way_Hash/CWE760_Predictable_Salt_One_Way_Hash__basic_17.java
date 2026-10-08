                                   
                                                             
                                                                            
                                      
  
  
              
                                                      
        
                                                     
                                             
                                          
 
    

package testcases.CWE760_Predictable_Salt_One_Way_Hash;

import testcasesupport.*;

import java.security.MessageDigest;
import java.security.SecureRandom;
import java.util.Random;

public class CWE760_Predictable_Salt_One_Way_Hash__basic_17 extends AbstractTestCase
{
    public void bad() throws Throwable
    {
        for(int j = 0; j < 1; j++)
        {
            SecureRandom secureRandom = new SecureRandom();
            MessageDigest hash = MessageDigest.getInstance("SHA-512");
                                                      
            byte[] salt = new byte[16];
            secureRandom.nextBytes(salt);
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

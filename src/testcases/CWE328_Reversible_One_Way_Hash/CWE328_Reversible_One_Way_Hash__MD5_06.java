                                   
                                                     
                                                               
                                      
  
  
              
                                  
            
                     
                  
                                                                                                      
 
    

package testcases.CWE328_Reversible_One_Way_Hash;

import testcasesupport.*;

import java.security.MessageDigest;

public class CWE328_Reversible_One_Way_Hash__MD5_06 extends AbstractTestCase
{
                                                                       
                                                                      
             
       
    private static final int PRIVATE_STATIC_FINAL_FIVE = 5;

    public void bad() throws Throwable
    {
        if (PRIVATE_STATIC_FINAL_FIVE == 5)
        {
            String input = "Test Input";
                                                                      
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
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

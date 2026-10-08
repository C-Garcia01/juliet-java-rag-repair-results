                                   
                                                 
                                                                
                                      
  
  
              
                            
        
                                         
                             
                                                                                                      
 
    

package testcases.CWE336_Same_Seed_in_PRNG;

import testcasesupport.*;

import java.security.SecureRandom;

public class CWE336_Same_Seed_in_PRNG__basic_06 extends AbstractTestCase
{
                                                                       
                                                                      
             
       
    private static final int PRIVATE_STATIC_FINAL_FIVE = 5;

    public void bad() throws Throwable
    {
        if (PRIVATE_STATIC_FINAL_FIVE == 5)
        {
            SecureRandom secureRandom = new SecureRandom();
            IO.writeLine("" + secureRandom.nextInt());                                                                                
            IO.writeLine("" + secureRandom.nextInt());
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

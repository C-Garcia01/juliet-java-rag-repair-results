                                   
                                                 
                                                                
                                      
  
  
              
                            
        
                                         
                             
                                            
 
    

package testcases.CWE336_Same_Seed_in_PRNG;

import testcasesupport.*;

import java.security.SecureRandom;

public class CWE336_Same_Seed_in_PRNG__basic_16 extends AbstractTestCase
{
    public void bad() throws Throwable
    {
        while(true)
        {
            SecureRandom secureRandom = new SecureRandom();
                                                                                                       
            IO.writeLine("" + secureRandom.nextInt());                                                                                
            IO.writeLine("" + secureRandom.nextInt());
            break;
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

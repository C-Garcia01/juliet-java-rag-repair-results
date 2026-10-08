                                   
                                                 
                                                                
                                      
  
  
              
                            
        
                                         
                             
                           
 
    

package testcases.CWE336_Same_Seed_in_PRNG;

import testcasesupport.*;

import java.security.SecureRandom;

public class CWE336_Same_Seed_in_PRNG__basic_01 extends AbstractTestCase
{
    public void bad() throws Throwable
    {

        SecureRandom secureRandom = new SecureRandom();

        IO.writeLine("" + secureRandom.nextInt());                                                                                
        IO.writeLine("" + secureRandom.nextInt());

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


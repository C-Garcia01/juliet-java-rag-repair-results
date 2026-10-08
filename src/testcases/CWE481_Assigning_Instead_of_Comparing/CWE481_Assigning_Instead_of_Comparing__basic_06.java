                                   
                                                              
                                                                             
                                      
  
  
              
                                         
        
                        
                                             
                                                                                                      
 
    

package testcases.CWE481_Assigning_Instead_of_Comparing;

import testcasesupport.*;

import java.security.SecureRandom;

public class CWE481_Assigning_Instead_of_Comparing__basic_06 extends AbstractTestCase
{
                                                                       
                                                                      
             
       
    private static final int PRIVATE_STATIC_FINAL_FIVE = 5;

    public void bad() throws Throwable
    {
        if (PRIVATE_STATIC_FINAL_FIVE == 5)
        {
            int zeroOrOne = (new SecureRandom()).nextInt(2);
            boolean isZero = (zeroOrOne == 0);
            if(isZero = true)                                                                           
            {
                IO.writeLine("zeroOrOne is 0");
            }
            IO.writeLine("isZero is: " + isZero);
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

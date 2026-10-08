                                   
                                                              
                                                                             
                                      
  
  
              
                                         
        
                        
                                             
                                                                                                 
 
    

package testcases.CWE482_Comparing_Instead_of_Assigning;

import testcasesupport.*;

import java.security.SecureRandom;

public class CWE482_Comparing_Instead_of_Assigning__basic_04 extends AbstractTestCase
{
                                                                     
                                                                       
                          
       
    private static final boolean PRIVATE_STATIC_FINAL_TRUE = true;
    private static final boolean PRIVATE_STATIC_FINAL_FALSE = false;

    public void bad() throws Throwable
    {
        if (PRIVATE_STATIC_FINAL_TRUE)
        {
            int zeroOrOne = (new SecureRandom()).nextInt(2);
            boolean isZero = false;
            isZero = (zeroOrOne == 0);
            if(isZero)
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

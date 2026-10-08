                                   
                                                    
                                                           
                                      
  
  
              
                                 
               
                                                    
                                                      
                                                                                                      
 
    

package testcases.CWE617_Reachable_Assertion;

import testcasesupport.*;

public class CWE617_Reachable_Assertion__length_06 extends AbstractTestCase
{
                                                                       
                                                                      
             
       
    private static final int PRIVATE_STATIC_FINAL_FIVE = 5;

    public void bad() throws Throwable
    {
        if (PRIVATE_STATIC_FINAL_FIVE == 5)
        {
                                          
            if ("".length() > 0)
            {
                IO.writeLine("String length is greater than 0");
            }
            else
            {
                IO.writeLine("String length is 0");
            }
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

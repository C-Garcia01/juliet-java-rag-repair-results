                                   
                                                   
                                                           
                                      
  
  
              
                                 
              
                                                    
                                                      
                                                                                            
 
    

package testcases.CWE617_Reachable_Assertion;

import testcasesupport.*;

public class CWE617_Reachable_Assertion__false_13 extends AbstractTestCase
{
    public void bad() throws Throwable
    {
        if (IO.STATIC_FINAL_FIVE == 5)
        {
                                                                                                                                      
            assert false;                                                                                                               
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

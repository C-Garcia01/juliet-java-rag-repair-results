                                   
                                                       
                                                         
                                      
  
  
              
                                         
                    
                                               
                                                
                                                                              
 
    

package testcases.CWE398_Poor_Code_Quality;

import testcasesupport.*;

public class CWE398_Poor_Code_Quality__empty_block_14 extends AbstractTestCase
{
    public void bad() throws Throwable
    {
        if (IO.staticFive == 5)
        {
                                                                      
            {
            }
            IO.writeLine("Hello from bad()");
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

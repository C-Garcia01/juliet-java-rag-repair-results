                                   
                                                          
                                                                         
                                      
  
  
              
                                                                               
        
                                                  
                                                        
                                                                              
 
    

package testcases.CWE395_Catch_NullPointerException;

import testcasesupport.*;

public class CWE395_Catch_NullPointerException__basic_14 extends AbstractTestCase
{
    public void bad() throws Throwable
    {
        if (IO.staticFive == 5)
        {
            String systemProperty = System.getProperty("CWE395");
            if (systemProperty != null && systemProperty.equals("CWE395"))
            {
                IO.writeLine("systemProperty is CWE395");
            }
            else if (systemProperty == null)
            {
                IO.writeLine("systemProperty is null");
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

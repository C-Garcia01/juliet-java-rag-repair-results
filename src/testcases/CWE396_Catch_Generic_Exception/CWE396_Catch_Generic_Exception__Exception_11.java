                                   
                                                           
                                                               
                                      
  
  
              
                                                                                                                    
                  
                                                                    
                                                       
                                                                                           
 
    

package testcases.CWE396_Catch_Generic_Exception;

import testcasesupport.*;

public class CWE396_Catch_Generic_Exception__Exception_11 extends AbstractTestCase
{
    public void bad() throws Throwable
    {
        if (IO.staticReturnsTrue())
        {
            try
            {
                Integer.parseInt("Test");                                       
            }
            catch (Exception exception)                                                     
            {
                IO.writeLine("Caught Exception");
                throw exception;              
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

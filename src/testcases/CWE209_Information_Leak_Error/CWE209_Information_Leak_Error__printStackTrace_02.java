                                   
                                                                
                                                              
                                      
  
  
              
                                                     
                        
                                                     
                                           
                                                       
 
    

package testcases.CWE209_Information_Leak_Error;

import testcasesupport.*;

import java.util.logging.Level;

public class CWE209_Information_Leak_Error__printStackTrace_02 extends AbstractTestCase
{
    public void bad() throws Throwable
    {
        if (true)
        {
            try
            {
                throw new UnsupportedOperationException();
            }
            catch (UnsupportedOperationException exceptUnsupportedOperation)
            {
                IO.logger.log(Level.WARNING, "Caught UnsupportedOperationException while performing operation", exceptUnsupportedOperation);
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

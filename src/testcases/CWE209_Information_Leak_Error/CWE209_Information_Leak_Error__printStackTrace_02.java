                                   
                                                                
                                                              
                                      
  
  
              
                                                     
                        
                                                     
                                           
                                                       
 
    

package testcases.CWE209_Information_Leak_Error;

import testcasesupport.*;

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
                exceptUnsupportedOperation.printStackTrace();                                                  
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

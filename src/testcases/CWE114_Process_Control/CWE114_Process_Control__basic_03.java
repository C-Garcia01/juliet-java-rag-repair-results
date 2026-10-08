                                   
                                               
                                                              
                                      
  
  
              
                          
        
                                                  
                                                         
                                                      
 
    

package testcases.CWE114_Process_Control;

import testcasesupport.*;

public class CWE114_Process_Control__basic_03 extends AbstractTestCase
{
    public void bad() throws Throwable
    {
        if (5 == 5)
        {
            String libraryName = "test.dll";
                                                                                
                                               
            System.loadLibrary(libraryName);
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

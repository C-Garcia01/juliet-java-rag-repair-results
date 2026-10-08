                                   
                                               
                                                              
                                      
  
  
              
                          
        
                                                  
                                                         
                                                                                            
 
    

package testcases.CWE114_Process_Control;

import testcasesupport.*;

public class CWE114_Process_Control__basic_13 extends AbstractTestCase
{
    public void bad() throws Throwable
    {
        if (IO.STATIC_FINAL_FIVE == 5)
        {
            String libraryName = "test.dll";
                                                                                
                                               
            if (libraryName != null && libraryName.equals("test.dll"))
            {
                System.loadLibrary("test.dll");
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

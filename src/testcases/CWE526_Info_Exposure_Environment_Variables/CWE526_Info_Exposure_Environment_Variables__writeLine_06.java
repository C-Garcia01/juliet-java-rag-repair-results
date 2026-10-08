                                   
                                                                       
                                                                           
                                      
  
  
              
                                                             
                  
                          
                                                   
                                                                                                      
 
    

package testcases.CWE526_Info_Exposure_Environment_Variables;

import testcasesupport.*;

public class CWE526_Info_Exposure_Environment_Variables__writeLine_06 extends AbstractTestCase
{
                                                                       
                                                                      
             
       
    private static final int PRIVATE_STATIC_FINAL_FIVE = 5;

    public void bad() throws Throwable
    {
        if (PRIVATE_STATIC_FINAL_FIVE == 5)
        {
                                                                
            String path = System.getenv("PATH");
            IO.writeLine("PATH environment variable is " + (path != null ? "set" : "not set"));
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

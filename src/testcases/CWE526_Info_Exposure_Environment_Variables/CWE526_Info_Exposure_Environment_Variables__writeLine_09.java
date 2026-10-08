                                   
                                                                       
                                                                           
                                      
  
  
              
                                                             
                  
                          
                                                   
                                                                                       
 
    

package testcases.CWE526_Info_Exposure_Environment_Variables;

import testcasesupport.*;

public class CWE526_Info_Exposure_Environment_Variables__writeLine_09 extends AbstractTestCase
{
    public void bad() throws Throwable
    {
        if (IO.STATIC_FINAL_TRUE)
        {
                                                                
            IO.writeLine("PATH configured: " + (System.getenv("PATH") != null));
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

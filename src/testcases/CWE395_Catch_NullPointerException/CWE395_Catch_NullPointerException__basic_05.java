                                   
                                                          
                                                                         
                                      
  
  
              
                                                                               
        
                                                  
                                                        
                                                                     
 
    

package testcases.CWE395_Catch_NullPointerException;

import testcasesupport.*;

public class CWE395_Catch_NullPointerException__basic_05 extends AbstractTestCase
{
                                                                        
                                                                          
                                                                  
       
    private boolean privateTrue = true;
    private boolean privateFalse = false;

    public void bad() throws Throwable
    {
        if (privateTrue)
        {
            String systemProperty = System.getProperty("CWE395");
            try
            {
                                                                                     
                if(systemProperty.equals("CWE395"))
                {
                    IO.writeLine("systemProperty is CWE395");
                }
            }
            catch (NullPointerException exceptNullPointer)                                                           
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

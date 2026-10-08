                                   
                                                                
                                                                
                                         
  
  
              
                                   
                              
                                          
        
                                                                   
                                              
                                                                                            
 
    

package testcases.CWE476_NULL_Pointer_Dereference;

import testcasesupport.*;

public class CWE476_NULL_Pointer_Dereference__StringBuilder_13 extends AbstractTestCase
{
    public void bad() throws Throwable
    {
        StringBuilder data;
        if (IO.STATIC_FINAL_FIVE==5)
        {
                                              
            data = null;
        }
        else
        {
                                                                           
                                                                                           
            data = null;
        }

        if (IO.STATIC_FINAL_FIVE==5)
        {
                                                                             
            IO.writeLine("" + data.length());
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

                                   
                                                                    
                                                                               
                                        
  
  
              
                          
                                   
        
                                
                         
                                                                                                 
 
    

package testcases.CWE563_Unused_Variable;

import testcasesupport.*;

public class CWE563_Unused_Variable__unused_uninit_variable_int_04 extends AbstractTestCase
{
                                                                     
                                                                       
                          
       
    private static final boolean PRIVATE_STATIC_FINAL_TRUE = true;
    private static final boolean PRIVATE_STATIC_FINAL_FALSE = false;

    public void bad() throws Throwable
    {
        int data;

        /* initialize and use data so it is not left unused */
        data = 2;
        IO.writeLine("data value: " + data);

                                                          
        ;                                                    

        if (PRIVATE_STATIC_FINAL_TRUE)
        {
                                                    
                            
            ;                                                    
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

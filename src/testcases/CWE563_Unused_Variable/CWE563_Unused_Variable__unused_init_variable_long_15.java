                                   
                                                                   
                                                                             
                                        
  
  
              
                          
                             
        
                       
                         
                                          
 
    

package testcases.CWE563_Unused_Variable;

import testcasesupport.*;

public class CWE563_Unused_Variable__unused_init_variable_long_15 extends AbstractTestCase
{
    public void bad() throws Throwable
    {
        long data;

                                                             

        data = 5L;

        switch (7)
        {
        case 7:
                                               
                            
            ;                                                    
            break;
        default:
                                                                              
            IO.writeLine("Benign, fixed string");
            break;
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

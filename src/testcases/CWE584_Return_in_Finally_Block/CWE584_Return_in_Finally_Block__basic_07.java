                                   
                                                       
                                                                      
                                      
  
  
              
                                  
        
                                         
                                
                                                                          
 
    

package testcases.CWE584_Return_in_Finally_Block;

import testcasesupport.*;

public class CWE584_Return_in_Finally_Block__basic_07 extends AbstractTestCase
{
                                                                        
                                                                         
                                                   
       
    private int privateFive = 5;

    public void bad() throws Throwable
    {
        if (privateFive == 5)
        {
            try
            {
                throw new IllegalArgumentException();
            }
            catch(IllegalArgumentException exceptIllegalArgument)
            {
                IO.writeLine("preventing incidental issues");
            }
            finally
            {
                if(true)
                {
                    IO.writeLine("finally block completed");
                }
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

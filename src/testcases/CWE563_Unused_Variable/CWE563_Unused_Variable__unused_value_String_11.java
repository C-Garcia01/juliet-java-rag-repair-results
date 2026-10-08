                                   
                                                             
                                                                     
                                         
  
  
              
                          
                             
                                     
        
                       
                                         
                                                                                           
 
    

package testcases.CWE563_Unused_Variable;

import testcasesupport.*;

public class CWE563_Unused_Variable__unused_value_String_11 extends AbstractTestCase
{
    public void bad() throws Throwable
    {
        String data;
        if (IO.staticReturnsTrue())
        {
                                                                 
            data = "Good";
        }
        else
        {
                                                                           
                                                                                           
            data = null;
        }

        if(IO.staticReturnsTrue())
        {
                                                                                               
            data = "Reinitialize";
            IO.writeLine(data);
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

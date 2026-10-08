                                   
                                                             
                                                                     
                                         
  
  
              
                                                                                 
                                                       
                                                         
             
                                                        
                                                  
                                                                                       
 
    

package testcases.CWE690_NULL_Deref_From_Return;

import testcasesupport.*;

public class CWE690_NULL_Deref_From_Return__Class_String_09 extends AbstractTestCase
{
    public void bad() throws Throwable
    {
        String data;
        if (IO.STATIC_FINAL_TRUE)
        {
                                                                            
            data = CWE690_NULL_Deref_From_Return__Class_Helper.getStringBad();
        }
        else
        {
                                                                           
                                                                                           
            data = null;
        }

        if (IO.STATIC_FINAL_TRUE)
        {
                                                    
            if (data != null)
            {
                String stringTrimmed = data.trim();
                IO.writeLine(stringTrimmed);
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

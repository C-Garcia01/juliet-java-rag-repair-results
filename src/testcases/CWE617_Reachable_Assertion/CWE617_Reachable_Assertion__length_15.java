                                   
                                                    
                                                           
                                      
  
  
              
                                 
               
                                                    
                                                      
                                          
 
    

package testcases.CWE617_Reachable_Assertion;

import testcasesupport.*;

public class CWE617_Reachable_Assertion__length_15 extends AbstractTestCase
{
    public void bad() throws Throwable
    {
        switch (7)
        {
        case 7:
                                          
            String myString = "";
            if (myString.length() > 0)
            {
                IO.writeLine("String has a positive length");
            }
            else
            {
                IO.writeLine("String is empty");
            }
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

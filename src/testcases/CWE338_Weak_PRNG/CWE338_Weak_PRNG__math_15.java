                                   
                                        
                                                 
                                      
  
  
              
                                             
             
                            
                        
                                          
 
    

package testcases.CWE338_Weak_PRNG;

import testcasesupport.*;

import java.security.SecureRandom;

public class CWE338_Weak_PRNG__math_15 extends AbstractTestCase
{
    public void bad() throws Throwable
    {
        switch (7)
        {
        case 7:
                                                          
            IO.writeLine("" + Math.random());
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

  
                                                  
   
     
package testcases.CWE571_Expression_Always_True;

import testcasesupport.AbstractTestCase;
import testcasesupport.IO;
import java.security.SecureRandom;
import java.util.Random;

public class CWE571_Expression_Always_True__class_getClass_not_equal_01 extends AbstractTestCase
{    
    public void bad()
    {
                                            
        Random random = new Random();
        Random secondRandom;

        if (IO.staticReturnsTrueOrFalse())
        {
            secondRandom = new SecureRandom();
        }
        else
        {
            secondRandom = new Random();
        }

        if (!random.getClass().equals(secondRandom.getClass()))
        {
            IO.writeLine("classes differ");
        }
    }
    
    public void good()
    {
    }
    
    

                                                                           
                                                                             
                                                                              
                                                                        
     
    public static void main(String[] args) 
            throws ClassNotFoundException, InstantiationException, IllegalAccessException 
    {
        mainFromParent(args);
    }
}

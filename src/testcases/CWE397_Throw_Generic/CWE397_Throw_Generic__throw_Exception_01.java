  
                                                                                                                                                                                                                                      
  
     

package testcases.CWE397_Throw_Generic;

import testcasesupport.AbstractTestCase;
import java.io.FileNotFoundException;

public class CWE397_Throw_Generic__throw_Exception_01 extends AbstractTestCase 
{
    public void bad() throws Exception 
    {
        throw new Exception();                                                    
    }

    

    public void good() throws FileNotFoundException
    {
    }

                                                                          
                                                                            
                                                                             
                                                                        
    
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException
    {
        mainFromParent(args);
    }
}

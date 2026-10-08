  
                                                                                                                                                                                                                                                                                                                    
  
     

package testcases.CWE248_Uncaught_Exception;

import testcasesupport.AbstractTestCase;
import testcasesupport.IO;
import java.util.logging.Level;

public class CWE248_Uncaught_Exception__Error_01 extends AbstractTestCase 
{
    public void bad() 
    {
                                    
        throw new Error("Really bad Error");
    }

    

    public void good() 
    {
    } 

                                                                                
    public void runTest(String classname) 
    {
        IO.writeLine("Starting tests for Class " + classname);

        good();  
        IO.writeLine("Completed good() for Class " + classname);

        bad();
        IO.writeLine("Completed bad() for Class " + classname);
    }              

                                                                          
                                                                            
                                                                             
                                                                        
    
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException
    {
        mainFromParent(args);
    }
}

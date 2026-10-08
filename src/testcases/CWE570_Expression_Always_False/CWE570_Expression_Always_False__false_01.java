  
                                                   
   
     
package testcases.CWE570_Expression_Always_False;

import testcasesupport.AbstractTestCase;
import testcasesupport.IO;

public class CWE570_Expression_Always_False__false_01 extends AbstractTestCase 
{
    public void bad()
    {
                                             
        if (IO.staticReturnsTrueOrFalse())
        {
            IO.writeLine("conditionally prints");
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

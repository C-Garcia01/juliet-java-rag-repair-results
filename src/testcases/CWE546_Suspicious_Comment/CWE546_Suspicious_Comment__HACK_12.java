                                   
                                                 
                                                          
                                      
  
  
              
                             
             
                                                  
                                          
                                                                  
 
    

package testcases.CWE546_Suspicious_Comment;

import testcasesupport.*;

public class CWE546_Suspicious_Comment__HACK_12 extends AbstractTestCase
{
    public void bad() throws Throwable
    {
        if (IO.staticReturnsTrueOrFalse())
        {
            IO.writeLine("This a test of the emergency broadcast system");
        }
        else
        {
            IO.writeLine("This a test of the emergency broadcast system");
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

                                   
                                                       
                                                                      
                                              
  
  
              
                                                   
        
                                         
                           
                                                  
 
    

package testcases.CWE383_Direct_Use_of_Threads;

import testcasesupport.*;

import javax.servlet.http.*;

public class CWE383_Direct_Use_of_Threads__Servlet_10 extends AbstractTestCaseServletBadOnly
{
    public void bad(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        if (IO.staticTrue)
        {
            try
            {
                Thread.sleep(10000);
            }
            catch (InterruptedException exceptInterrupted)
            {
                IO.writeLine("InterruptedException");
            }
            response.getWriter().write("thread is done!");
        }
    }

                                                                          
                                                                            
                                                                             
                                                                       
       
    public static void main(String[] args) throws ClassNotFoundException,
           InstantiationException, IllegalAccessException
    {
        mainFromParent(args);
    }
}

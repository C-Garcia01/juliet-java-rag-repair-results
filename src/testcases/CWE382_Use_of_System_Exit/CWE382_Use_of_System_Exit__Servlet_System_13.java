                                   
                                                           
                                                                   
                                      
  
  
              
                               
               
                                                  
                                                            
                                                                                            
 
    

package testcases.CWE382_Use_of_System_Exit;

import testcasesupport.*;

import javax.servlet.http.*;

public class CWE382_Use_of_System_Exit__Servlet_System_13 extends AbstractTestCaseServlet
{
    public void bad(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        if (IO.STATIC_FINAL_FIVE == 5)
        {
            /* Servlets must not terminate the JVM/container; log and continue instead. */
            IO.writeLine("Reached conditional branch in bad()");
        }
    }

                                                                            
    

                                                         
    

    public void good(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
    }

                                                                          
                                                                            
                                                                             
                                                                       
       
    public static void main(String[] args) throws ClassNotFoundException,
           InstantiationException, IllegalAccessException
    {
        mainFromParent(args);
    }
}

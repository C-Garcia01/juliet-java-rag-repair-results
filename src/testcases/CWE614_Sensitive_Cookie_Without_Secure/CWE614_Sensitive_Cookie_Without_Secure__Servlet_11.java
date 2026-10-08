                                   
                                                                 
                                                                                
                                      
  
  
              
                                          
        
                              
                                  
                                                                                           
 
    

package testcases.CWE614_Sensitive_Cookie_Without_Secure;

import testcasesupport.*;

import javax.servlet.http.*;
import java.io.*;

public class CWE614_Sensitive_Cookie_Without_Secure__Servlet_11 extends AbstractTestCaseServlet
{
    public void bad(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        if (IO.staticReturnsTrue())
        {
            Cookie cookie = new Cookie("SecretMessage", "test");
            if (request.isSecure())
            {
                cookie.setSecure(true);
                response.addCookie(cookie);
            }
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

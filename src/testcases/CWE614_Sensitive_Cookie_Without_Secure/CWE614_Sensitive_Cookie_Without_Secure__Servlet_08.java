                                   
                                                                 
                                                                                
                                      
  
  
              
                                          
        
                              
                                  
                                                                                       
 
    

package testcases.CWE614_Sensitive_Cookie_Without_Secure;

import testcasesupport.*;

import javax.servlet.http.*;
import java.io.*;

public class CWE614_Sensitive_Cookie_Without_Secure__Servlet_08 extends AbstractTestCaseServlet
{
                                                                
                                                            
                                                
       
    private boolean privateReturnsTrue()
    {
        return true;
    }

    private boolean privateReturnsFalse()
    {
        return false;
    }

    public void bad(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        if (privateReturnsTrue())
        {
            Cookie cookie = new Cookie("SecretMessage", "test");
            if (request.isSecure())
            {
                                               
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

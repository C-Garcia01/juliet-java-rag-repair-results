                                   
                                                                 
                                                                                
                                      
  
  
              
                                          
        
                                      
                                          
                                                                              
 
    

package testcases.CWE613_Insufficient_Session_Expiration;

import testcasesupport.*;

import javax.servlet.http.*;

public class CWE613_Insufficient_Session_Expiration__Servlet_14 extends AbstractTestCaseServlet
{
    public void bad(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        if (IO.staticFive == 5)
        {
            HttpSession sesssion = request.getSession(true);
                                                                                 
            sesssion.setMaxInactiveInterval(-1);
            response.getWriter().write("bad(): Session still valid");
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

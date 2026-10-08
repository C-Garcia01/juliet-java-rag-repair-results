                                   
                                                                 
                                                                                
                                      
  
  
              
                                          
        
                                      
                                          
                                                                                                      
 
    

package testcases.CWE613_Insufficient_Session_Expiration;

import testcasesupport.*;

import javax.servlet.http.*;

public class CWE613_Insufficient_Session_Expiration__Servlet_06 extends AbstractTestCaseServlet
{
                                                                       
                                                                      
             
       
    private static final int PRIVATE_STATIC_FINAL_FIVE = 5;

    public void bad(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        if (PRIVATE_STATIC_FINAL_FIVE == 5)
        {
            HttpSession sesssion = request.getSession(true);
                                                                                 
            sesssion.setMaxInactiveInterval(300);
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

                                   
                                                          
                                                                         
                                      
  
  
              
                                                        
        
                                                              
                                                      
                                                                     
 
    

package testcases.CWE533_Info_Exposure_Server_Log;

import testcasesupport.*;

import javax.servlet.http.*;

public class CWE533_Info_Exposure_Server_Log__Servlet_05 extends AbstractTestCaseServlet
{
                                                                        
                                                                          
                                                                  
       
    private boolean privateTrue = true;
    private boolean privateFalse = false;

    public void bad(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        if (privateTrue)
        {
            if (request.getParameter("username") == null)
            {
                return;
            }
            String username = request.getParameter("username");
            if (username.matches("[a-zA-Z0-9]*"))
            {
                HttpSession session = request.getSession(true);
                                                               
                log("Username: " + username + " Session ID:" + session.getId());
            }
            else
            {
                response.getWriter().println("Invalid characters");
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

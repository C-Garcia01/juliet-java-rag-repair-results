                                   
                                                                       
                                                                 
                                        
  
  
              
                                                     
                                                                                   
                                
                                            
                           
 
    

package testcases.CWE81_XSS_Error_Message;

import testcasesupport.*;

import javax.servlet.http.*;


public class CWE81_XSS_Error_Message__Servlet_getParameter_Servlet_01 extends AbstractTestCaseServlet
{
                                    
    public void bad(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        String data;

                                                                             
        data = request.getParameter("name");

        if (data != null)
        {
                                                                                                         
                                                                                    
                                                                                                                    
              
            String safeData = data.replace("&", "&amp;").replace("<", "&lt;").replace(">", "&gt;").replace("\"", "&quot;").replace("'", "&#39;");
            response.sendError(404, "<br>bad() - Parameter name has value " + safeData);
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


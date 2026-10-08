                                   
                                                                   
                                                             
                                        
  
  
              
                                                                                                                                                                                                                                               
                                                                                   
                                
                                                  
                           
 
    

package testcases.CWE83_XSS_Attribute;

import testcasesupport.*;

import javax.servlet.http.*;


public class CWE83_XSS_Attribute__Servlet_getParameter_Servlet_01 extends AbstractTestCaseServlet
{
                                    
    public void bad(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        String data;

                                                                             
        data = request.getParameter("name");

        if (data != null)
        {
                                                                                            
            String encodedData = data.replace("&", "&amp;").replace("<", "&lt;").replace(">", "&gt;").replace("\"", "&quot;").replace("'", "&#39;");
            response.getWriter().println("<br>bad() - <img src=\"" + encodedData + "\">");
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


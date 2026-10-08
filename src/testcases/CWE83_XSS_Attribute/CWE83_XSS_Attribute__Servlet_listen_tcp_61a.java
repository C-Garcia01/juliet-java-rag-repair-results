                                   
                                                          
                                                             
                                         
  
  
               
                                                                                                                                                                                                                                                
                                                                   
                                 
                        
                                        
                                                                                                                
  
     

package testcases.CWE83_XSS_Attribute;

import testcasesupport.*;

import javax.servlet.http.*;

public class CWE83_XSS_Attribute__Servlet_listen_tcp_61a extends AbstractTestCaseServlet
{
    public void bad(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        String data = (new CWE83_XSS_Attribute__Servlet_listen_tcp_61b()).badSource(request, response);

        if (data != null)
        {
                                                                                            
            String encoded = data.replace("&", "&amp;").replace("<", "&lt;").replace(">", "&gt;").replace("\"", "&quot;").replace("'", "&#39;");
            response.getWriter().println("<br>bad() - <img src=\"" + encoded + "\">");
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

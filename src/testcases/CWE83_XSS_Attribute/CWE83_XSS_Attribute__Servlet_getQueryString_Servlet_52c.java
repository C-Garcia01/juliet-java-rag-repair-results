                                   
                                                                      
                                                             
                                         
  
  
               
                                                                                                                                                                                                                                                
                                                                                                              
                                 
                        
                                        
                                                                                                                                              
  
     

package testcases.CWE83_XSS_Attribute;

import testcasesupport.*;

import javax.servlet.http.*;

import java.net.URLEncoder;

public class CWE83_XSS_Attribute__Servlet_getQueryString_Servlet_52c
{
    public void badSink(String data , HttpServletRequest request, HttpServletResponse response) throws Throwable
    {

        if (data != null)
        {
                                                                                            
            response.getWriter().println("<br>bad() - <img src=\"" + URLEncoder.encode(data, "UTF-8") + "\">");
        }

    }

                                                
    
}

                                   
                                                                                     
                                                               
                                         
  
  
               
                                   
                                                                                   
                                 
                          
                               
                                          
                                                                                                      
  
     

package testcases.CWE113_HTTP_Response_Splitting.s02;
import testcasesupport.*;

import javax.servlet.http.*;


import java.net.URLEncoder;

public class CWE113_HTTP_Response_Splitting__getCookies_Servlet_setHeaderServlet_41 extends AbstractTestCaseServlet
{
    private void badSink(String data , HttpServletRequest request, HttpServletResponse response) throws Throwable
    {

        if (data != null)
        {
                                                                               
            response.setHeader("Location", "/author.jsp?lang=" + data);
        }

    }

    public void bad(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        String data;

        data = "";                                                   

                                    
        {
            Cookie cookieSources[] = request.getCookies();
            if (cookieSources != null)
            {
                                                                           
                data = cookieSources[0].getValue();
            }
        }

        badSink(data , request, response );
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

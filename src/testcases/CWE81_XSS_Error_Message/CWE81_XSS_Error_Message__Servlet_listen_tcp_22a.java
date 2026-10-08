                                   
                                                              
                                                                 
                                         
  
  
               
                                                      
                                                                   
                                 
                          
                                
                                                                                                                                           
  
     

package testcases.CWE81_XSS_Error_Message;

import testcasesupport.*;

import javax.servlet.http.*;

public class CWE81_XSS_Error_Message__Servlet_listen_tcp_22a extends AbstractTestCaseServlet
{
                                                                                             
                                                                                           
    public static boolean badPublicStatic = false;

    public void bad(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        String data;

        badPublicStatic = true;
        data = (new CWE81_XSS_Error_Message__Servlet_listen_tcp_22b()).badSource(request, response);

        if (data != null)
        {
                                                                                                         
                                                                                    
                                                                                                                    
              
            String encodedData = data.replace("&", "&amp;").replace("<", "&lt;").replace(">", "&gt;").replace("\"", "&quot;").replace("'", "&#39;");
            response.sendError(404, "<br>bad() - Parameter name has value " + encodedData);
        }

    }

                                                                                                
                                                                                           
    public static boolean goodG2B1PublicStatic = false;
    public static boolean goodG2B2PublicStatic = false;

    public void good(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
    }

                                                                                                         
    

                                                                                                        
    

                                                                          
                                                                            
                                                                             
                                                                       
       
    public static void main(String[] args) throws ClassNotFoundException,
           InstantiationException, IllegalAccessException
    {
        mainFromParent(args);
    }

}

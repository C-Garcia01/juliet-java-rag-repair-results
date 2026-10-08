                                   
                                                               
                                                                 
                                         
  
  
               
                                                      
                                                                    
                                 
                          
                                
                                                                                                                              
  
     

package testcases.CWE81_XSS_Error_Message;

import testcasesupport.*;

import javax.servlet.http.*;

public class CWE81_XSS_Error_Message__Servlet_connect_tcp_67b
{
    public void badSink(CWE81_XSS_Error_Message__Servlet_connect_tcp_67a.Container dataContainer , HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        String data = dataContainer.containerOne;

        if (data != null)
        {
                                                                                                         
                                                                                    
                                                                                                                    
              
            StringBuilder escapedData = new StringBuilder();
            for (int i = 0; i < data.length(); i++)
            {
                char c = data.charAt(i);
                switch (c)
                {
                    case '&':
                        escapedData.append("&amp;");
                        break;
                    case '<':
                        escapedData.append("&lt;");
                        break;
                    case '>':
                        escapedData.append("&gt;");
                        break;
                    case '\"':
                        escapedData.append("&quot;");
                        break;
                    case '\'':
                        escapedData.append("&#39;");
                        break;
                    default:
                        escapedData.append(c);
                        break;
                }
            }
            response.sendError(404, "<br>bad() - Parameter name has value " + escapedData.toString());
        }

    }

                                                
    
}

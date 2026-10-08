  
                                                        
                                                   
 
    

                                                                                     
                                                               
                                                  
                         
                                                                  
                                                                    
                                   
                                                                             
  

package testcases.CWE600_Uncaught_Exception_in_Servlet;

import java.util.logging.Level;
import java.io.IOException;
import java.net.InetAddress;
import javax.servlet.http.*;

import testcasesupport.*;

public class CWE600_Uncaught_Exception_in_Servlet__getParameter_01 extends AbstractTestCaseServlet 
{
    private static final long serialVersionUID = 1L;                                             

    public void bad(HttpServletRequest request, HttpServletResponse response) throws IOException 
    {        
        String ipAddress = request.getRemoteAddr();
        try
        {
            InetAddress inetAddress = InetAddress.getByName(ipAddress);

            if (inetAddress == null)
            {
                IO.logger.log(Level.WARNING, "Problem getting IP address");
            }
            else
            {
                IO.writeLine("IP= " + inetAddress.getAddress().toString());
            }
        }
        catch (java.net.UnknownHostException exceptUnknownHost)
        {
            IO.logger.log(Level.WARNING, "Could not resolve IP address", exceptUnknownHost);
        }
                                                                                       
                                                    
                                                                              
           
    }

    
    
    public void good(HttpServletRequest request, HttpServletResponse response) 
    {
    }
}

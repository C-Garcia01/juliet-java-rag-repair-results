                                   
                                                                                
                                                                                               
                                      
  
  
              
                                                         
        
                                             
                                      
                                                                         
 
    

package testcases.CWE539_Information_Exposure_Through_Persistent_Cookie;

import testcasesupport.*;

import javax.servlet.http.*;

public class CWE539_Information_Exposure_Through_Persistent_Cookie__Servlet_10 extends AbstractTestCaseServlet
{
    public void bad(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        if (IO.staticTrue)
        {
            Cookie cookie = new Cookie("SecretMessage", "test");
                                                                                        
            cookie.setMaxAge(60*60*24*365*5);
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

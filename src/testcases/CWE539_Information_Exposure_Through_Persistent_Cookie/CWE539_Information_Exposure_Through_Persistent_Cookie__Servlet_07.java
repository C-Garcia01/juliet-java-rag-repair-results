                                   
                                                                                
                                                                                               
                                      
  
  
              
                                                         
        
                                             
                                      
                                                                          
 
    

package testcases.CWE539_Information_Exposure_Through_Persistent_Cookie;

import testcasesupport.*;

import javax.servlet.http.*;

public class CWE539_Information_Exposure_Through_Persistent_Cookie__Servlet_07 extends AbstractTestCaseServlet
{
                                                                        
                                                                         
                                                   
       
    private int privateFive = 5;

    public void bad(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        if (privateFive == 5)
        {
            Cookie cookie = new Cookie("SecretMessage", "test");
                                                                                        
            cookie.setMaxAge(-1);
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

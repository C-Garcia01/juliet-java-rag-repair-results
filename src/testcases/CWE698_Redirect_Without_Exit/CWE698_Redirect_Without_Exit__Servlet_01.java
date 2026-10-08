                                   
                                                       
                                                                      
                                      
  
  
              
                                
        
                                    
                                             
                           
 
    

package testcases.CWE698_Redirect_Without_Exit;

import testcasesupport.*;

import javax.servlet.http.*;

public class CWE698_Redirect_Without_Exit__Servlet_01 extends AbstractTestCaseServlet
{
    public void bad(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {

        response.sendRedirect("/test");

        return;

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


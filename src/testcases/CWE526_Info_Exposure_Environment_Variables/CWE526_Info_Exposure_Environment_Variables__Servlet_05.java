                                   
                                                                     
                                                                           
                                      
  
  
              
                                                             
                
                          
                                                   
                                                                     
 
    

package testcases.CWE526_Info_Exposure_Environment_Variables;

import testcasesupport.*;

import javax.servlet.http.*;

public class CWE526_Info_Exposure_Environment_Variables__Servlet_05 extends AbstractTestCaseServlet
{
                                                                        
                                                                          
                                                                  
       
    private boolean privateTrue = true;
    private boolean privateFalse = false;

    public void bad(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        if (privateTrue)
        {
                                                    
            response.getWriter().println("Not in path: " + System.getenv("PATH"));
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

                                   
                                                                           
                                                                                         
                                         
  
  
               
                                                    
                                               
                                
                      
                                              
                                                                                                                                              
  
     

package testcases.CWE566_Authorization_Bypass_Through_SQL_Primary;

import testcasesupport.*;

import javax.servlet.http.*;

public class CWE566_Authorization_Bypass_Through_SQL_Primary__Servlet_52a extends AbstractTestCaseServlet
{
    public void bad(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        String data;

                                                        
        Object authenticatedUserId = request.getSession().getAttribute("userId");
        data = (authenticatedUserId == null) ? null : authenticatedUserId.toString();

        (new CWE566_Authorization_Bypass_Through_SQL_Primary__Servlet_52b()).badSink(data , request, response);
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

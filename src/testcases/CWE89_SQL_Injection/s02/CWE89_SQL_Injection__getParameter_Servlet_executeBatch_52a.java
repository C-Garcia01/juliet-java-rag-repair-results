                                   
                                                                         
                                                    
                                          
  
  
               
                        
                                                                                    
                                 
                      
                                                                  
                                                                                                                
                                                                                                                                              
  
     

package testcases.CWE89_SQL_Injection.s02;
import testcasesupport.*;

import javax.servlet.http.*;


public class CWE89_SQL_Injection__getParameter_Servlet_executeBatch_52a extends AbstractTestCaseServlet
{
    public void bad(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        String data;

                                                                             
        data = request.getParameter("name");

        (new CWE89_SQL_Injection__getParameter_Servlet_executeBatch_52b()).badSink(data , request, response);
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

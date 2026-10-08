                                   
                                                                            
                                                               
                                          
  
  
               
                                   
                                                       
                                 
                          
                               
                                          
                                                                                                                               
  
     

package testcases.CWE113_HTTP_Response_Splitting.s03;
import testcasesupport.*;

import javax.servlet.http.*;

public class CWE113_HTTP_Response_Splitting__Property_setHeaderServlet_51a extends AbstractTestCaseServlet
{
    public void bad(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        String data;

                                           
                                                              
        data = System.getProperty("user.home");

        (new CWE113_HTTP_Response_Splitting__Property_setHeaderServlet_51b()).badSink(data , request, response );
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

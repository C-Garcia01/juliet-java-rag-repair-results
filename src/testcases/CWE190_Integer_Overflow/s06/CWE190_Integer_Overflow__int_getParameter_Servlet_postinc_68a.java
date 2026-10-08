                                   
                                                                            
                                                             
                                          
  
  
               
                            
                                                                                    
                                                                  
                   
                                                                             
                                                           
                                                                                                                                                
  
     

package testcases.CWE190_Integer_Overflow.s06;
import testcasesupport.*;

import javax.servlet.http.*;


import java.util.logging.Level;

public class CWE190_Integer_Overflow__int_getParameter_Servlet_postinc_68a extends AbstractTestCaseServlet
{
    public static int data;

    public void bad(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {

        data = Integer.MIN_VALUE;                      

                                                                               
        {
            String stringNumber = request.getParameter("name");

            try
            {
                data = Integer.parseInt(stringNumber.trim());
            }
            catch(NumberFormatException exceptNumberFormat)
            {
                IO.logger.log(Level.WARNING, "Number format exception reading data from parameter 'name'", exceptNumberFormat);
            }
        }

        (new CWE190_Integer_Overflow__int_getParameter_Servlet_postinc_68b()).badSink(request, response);
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

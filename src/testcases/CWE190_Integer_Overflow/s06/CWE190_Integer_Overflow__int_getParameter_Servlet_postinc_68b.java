                                   
                                                                            
                                                             
                                          
  
  
               
                            
                                                                                    
                                                                  
                   
                                                                             
                                                           
                                                                                                                                                
  
     

package testcases.CWE190_Integer_Overflow.s06;
import testcasesupport.*;

import javax.servlet.http.*;

public class CWE190_Integer_Overflow__int_getParameter_Servlet_postinc_68b
{
    public void badSink(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        int data = CWE190_Integer_Overflow__int_getParameter_Servlet_postinc_68a.data;

                                                                              
        data++;
        int result = (int)(data);

        IO.writeLine("result: " + result);

    }

                                                
    

                                                
    
}

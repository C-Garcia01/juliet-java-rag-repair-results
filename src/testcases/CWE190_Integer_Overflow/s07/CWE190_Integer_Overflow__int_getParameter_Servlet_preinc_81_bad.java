                                   
                                                                              
                                                             
                                             
  
  
               
                            
                                                                                    
                                                                  
                   
                                                                             
                                                           
                                                                               
  
     

package testcases.CWE190_Integer_Overflow.s07;
import testcasesupport.*;

import javax.servlet.http.*;

public class CWE190_Integer_Overflow__int_getParameter_Servlet_preinc_81_bad extends CWE190_Integer_Overflow__int_getParameter_Servlet_preinc_81_base
{
    public void action(int data , HttpServletRequest request, HttpServletResponse response) throws Throwable
    {

                                                                              
        int result = (int)(++data);

        IO.writeLine("result: " + result);

    }
}

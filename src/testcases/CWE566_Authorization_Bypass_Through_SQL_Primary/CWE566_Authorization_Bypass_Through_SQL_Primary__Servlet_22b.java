                                   
                                                                           
                                                                                         
                                         
  
  
               
                                                    
                                               
                                
                      
                                              
                                                                                                                                           
  
     

package testcases.CWE566_Authorization_Bypass_Through_SQL_Primary;

import testcasesupport.*;

import javax.servlet.http.*;

public class CWE566_Authorization_Bypass_Through_SQL_Primary__Servlet_22b
{
    public String badSource(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        String data;

        if (CWE566_Authorization_Bypass_Through_SQL_Primary__Servlet_22a.badPublicStatic)
        {
                                                            
            data = request.getParameter("id");
        }
        else
        {
                                                                           
                                                                                           
            data = null;
        }
        return data;
    }

                                                                                                         
    

                                                                                                        
    
}

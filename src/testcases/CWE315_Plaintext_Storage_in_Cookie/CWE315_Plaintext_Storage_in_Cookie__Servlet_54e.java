                                   
                                                              
                                                                            
                                          
  
  
               
                                              
                                                                      
                                                
         
                                                  
                                             
                                                                                                                                                                          
  
     

package testcases.CWE315_Plaintext_Storage_in_Cookie;

import testcasesupport.*;

import javax.servlet.http.*;

import java.security.MessageDigest;

public class CWE315_Plaintext_Storage_in_Cookie__Servlet_54e
{
    public void badSink(String data , HttpServletRequest request, HttpServletResponse response) throws Throwable
    {

                                                                                        

                                                           
        response.addCookie(new Cookie("auth", data));

    }

                                                
    

                                                
    
}

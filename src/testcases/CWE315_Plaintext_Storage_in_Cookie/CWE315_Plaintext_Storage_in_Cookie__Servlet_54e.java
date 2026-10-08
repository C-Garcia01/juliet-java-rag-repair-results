                                   
                                                              
                                                                            
                                          
  
  
               
                                              
                                                                      
                                                
         
                                                  
                                             
                                                                                                                                                                          
  
     

package testcases.CWE315_Plaintext_Storage_in_Cookie;

import testcasesupport.*;

import javax.servlet.http.*;

import java.security.MessageDigest;

public class CWE315_Plaintext_Storage_in_Cookie__Servlet_54e
{
    public void badSink(String data , HttpServletRequest request, HttpServletResponse response) throws Throwable
    {

                                                                                        

                                                           
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-512");
        byte[] hashedData = messageDigest.digest(data.getBytes("UTF-8"));
        response.addCookie(new Cookie("auth", IO.toHex(hashedData)));

    }

                                                
    

                                                
    
}

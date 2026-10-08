                                   
                                                             
                                                                            
                                         
  
  
              
                                             
                                                                     
                                               
        
                                                 
                                            
                                                                                           
 
    

package testcases.CWE315_Plaintext_Storage_in_Cookie;

import testcasesupport.*;

import javax.servlet.http.*;

import java.security.MessageDigest;

import java.net.PasswordAuthentication;

public class CWE315_Plaintext_Storage_in_Cookie__Servlet_11 extends AbstractTestCaseServlet
{
    public void bad(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        String data;
        if (IO.staticReturnsTrue())
        {
                                                                   
            PasswordAuthentication credentials = new PasswordAuthentication("user", "BP@ssw0rd".toCharArray());
                                                                                         
            data = credentials.getUserName() + ":" + (new String(credentials.getPassword()));
        }
        else
        {
                                                                           
                                                                                           
            data = null;
        }

        if(IO.staticReturnsTrue())
        {
                                                                                            
                                                               
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            byte[] hashedData = messageDigest.digest((data == null ? "" : data).getBytes("UTF-8"));
            response.addCookie(new Cookie("auth", IO.toHex(hashedData)));
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

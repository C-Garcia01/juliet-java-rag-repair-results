                                   
                                                             
                                                                            
                                         
  
  
              
                                             
                                                                     
                                               
        
                                                 
                                            
                                                        
 
    

package testcases.CWE315_Plaintext_Storage_in_Cookie;

import testcasesupport.*;

import javax.servlet.http.*;

import java.security.MessageDigest;

import java.net.PasswordAuthentication;

public class CWE315_Plaintext_Storage_in_Cookie__Servlet_15 extends AbstractTestCaseServlet
{
    public void bad(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        String data;

        switch (6)
        {
        case 6:
                                                                   
            PasswordAuthentication credentials = new PasswordAuthentication("user", "BP@ssw0rd".toCharArray());
                                                                                         
            data = credentials.getUserName() + ":" + (new String(credentials.getPassword()));
            break;
        default:
                                                                           
                                                                                           
            data = null;
            break;
        }

        switch (7)
        {
        case 7:
                                                                                            
                                                               
            response.addCookie(new Cookie("auth", data));
            break;
        default:
                                                                              
            IO.writeLine("Benign, fixed string");
            break;
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

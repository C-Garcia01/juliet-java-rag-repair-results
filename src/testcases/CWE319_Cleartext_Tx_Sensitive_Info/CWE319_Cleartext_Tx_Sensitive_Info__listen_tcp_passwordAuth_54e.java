                                   
                                                                              
                                                                   
                                          
  
  
               
                                                           
                                                                       
                                                                                         
                      
                                                                         
                                                                 
                                                                                                                                                                          
  
     

package testcases.CWE319_Cleartext_Tx_Sensitive_Info;

import testcasesupport.*;

import java.net.PasswordAuthentication;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public class CWE319_Cleartext_Tx_Sensitive_Info__listen_tcp_passwordAuth_54e
{
    public void badSink(String password ) throws Throwable
    {

        if (password != null)
        {
                                                                                   
            PasswordAuthentication credentials = new PasswordAuthentication("user", password.toCharArray());
            IO.writeLine(credentials.toString());
        }

    }

                                                
    

                                                
    
}

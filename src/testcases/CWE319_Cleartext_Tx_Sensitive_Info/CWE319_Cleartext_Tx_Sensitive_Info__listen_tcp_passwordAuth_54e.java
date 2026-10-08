                                   
                                                                              
                                                                   
                                          
  
  
               
                                                           
                                                                       
                                                                                         
                      
                                                                         
                                                                 
                                                                                                                                                                          
  
     

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
            Cipher aesCipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
            SecretKeySpec secretKeySpec = new SecretKeySpec("ABCDEFGHABCDEFGH".getBytes("UTF-8"), "AES");
            aesCipher.init(Cipher.ENCRYPT_MODE, secretKeySpec);
            byte[] encryptedBytes = aesCipher.doFinal(credentials.toString().getBytes("UTF-8"));
            IO.writeLine(IO.toHex(encryptedBytes));
        }

    }

                                                
    

                                                
    
}

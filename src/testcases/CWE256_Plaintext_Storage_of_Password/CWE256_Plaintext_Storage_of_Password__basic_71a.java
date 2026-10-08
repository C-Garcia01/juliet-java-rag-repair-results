                                   
                                                              
                                                                            
                                          
  
  
               
                                                                                                                                                            
                                                                                       
                                                                                                           
         
                                                                                        
                                                         
                                                                                                                                              
  
     

package testcases.CWE256_Plaintext_Storage_of_Password;

import testcasesupport.*;

import javax.servlet.http.*;

import java.util.logging.Level;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

import java.util.Properties;

import java.io.FileInputStream;
import java.io.IOException;

public class CWE256_Plaintext_Storage_of_Password__basic_71a extends AbstractTestCase
{
    public void bad() throws Throwable
    {
        String password;

        password = "";                    

                                   
        Properties properties = new Properties();
        FileInputStream streamFileInput = null;
        try
        {
            streamFileInput = new FileInputStream("../common/config.properties");
            properties.load(streamFileInput);

            password = properties.getProperty("password");
        }
        catch (IOException exceptIO)
        {
            IO.logger.log(Level.WARNING, "Error with stream reading", exceptIO);
        }
        finally
        {
                                                 
            try
            {
                if (streamFileInput != null)
                {
                    streamFileInput.close();
                }
            }
            catch (IOException exceptIO)
            {
                IO.logger.log(Level.WARNING, "Error closing FileInputStream", exceptIO);
            }
        }

                                                                                                                    

        Cipher aesCipher = Cipher.getInstance("AES");
        SecretKeySpec secretKeySpec = new SecretKeySpec("ABCDEFGHABCDEFGH".getBytes("UTF-8"), "AES");
        aesCipher.init(Cipher.DECRYPT_MODE, secretKeySpec);
        byte[] encryptedPassword = new byte[password.length() / 2];
        for (int i = 0; i < encryptedPassword.length; i++)
        {
            encryptedPassword[i] = (byte) Integer.parseInt(password.substring(2 * i, 2 * i + 2), 16);
        }
        password = new String(aesCipher.doFinal(encryptedPassword), "UTF-8");

        (new CWE256_Plaintext_Storage_of_Password__basic_71b()).badSink((Object)password  );
    }

    public void good() throws Throwable
    {
    }

                                                
    

                                                
    

                                                                          
                                                                            
                                                                             
                                                                       
       
    public static void main(String[] args) throws ClassNotFoundException,
           InstantiationException, IllegalAccessException
    {
        mainFromParent(args);
    }
}

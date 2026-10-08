                                   
                                                
                                                         
                                      
  
  
              
                                                         
             
                      
                       
                                          
 
    

package testcases.CWE327_Use_Broken_Crypto;

import testcasesupport.*;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

public class CWE327_Use_Broken_Crypto__3DES_17 extends AbstractTestCase
{
    public void bad() throws Throwable
    {
        for(int j = 0; j < 1; j++)
        {
            final String CIPHER_INPUT = "ABCDEFG123456";
            KeyGenerator keyGenerator = KeyGenerator.getInstance("DESede");
                                                        
            keyGenerator.init(112);
            SecretKey secretKey = keyGenerator.generateKey();
            byte[] byteKey = secretKey.getEncoded();
                                                         
            SecretKeySpec secretKeySpec = new SecretKeySpec(byteKey, "DESede");
            Cipher tripleDesCipher = Cipher.getInstance("DESede");
            tripleDesCipher.init(Cipher.ENCRYPT_MODE, secretKeySpec);
            byte[] encrypted = tripleDesCipher.doFinal(CIPHER_INPUT.getBytes("UTF-8"));
            IO.writeLine(IO.toHex(encrypted));
        }
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

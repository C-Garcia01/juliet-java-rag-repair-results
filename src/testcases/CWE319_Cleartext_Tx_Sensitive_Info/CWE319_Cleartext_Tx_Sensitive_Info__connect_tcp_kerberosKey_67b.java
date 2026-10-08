                                   
                                                                              
                                                                   
                                          
  
  
               
                                                           
                                                                        
                                                                                         
                     
                                                              
                                                      
                                                                                                                              
  
     

package testcases.CWE319_Cleartext_Tx_Sensitive_Info;

import testcasesupport.*;

import javax.security.auth.kerberos.KerberosPrincipal;
import javax.security.auth.kerberos.KerberosKey;

import javax.crypto.Cipher;

import javax.crypto.spec.SecretKeySpec;

public class CWE319_Cleartext_Tx_Sensitive_Info__connect_tcp_kerberosKey_67b
{
    public void badSink(CWE319_Cleartext_Tx_Sensitive_Info__connect_tcp_kerberosKey_67a.Container passwordContainer ) throws Throwable
    {
        String password = passwordContainer.containerOne;

        if (password != null)
        {
            KerberosPrincipal principal = new KerberosPrincipal("test");
                                                                        
            KerberosKey key = new KerberosKey(principal, password.toCharArray(), null);
            IO.writeLine(key.toString());
        }

    }

                                                
    

                                                
    
}

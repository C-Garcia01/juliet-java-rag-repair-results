                                   
                                               
                                                              
                                      
  
  
              
                          
        
                                                  
                                                         
                                                      
 
    

package testcases.CWE114_Process_Control;

import testcasesupport.*;

public class CWE114_Process_Control__basic_03 extends AbstractTestCase
{
    public void bad() throws Throwable
    {
        if (5 == 5)
        {
            String libraryName = "test.dll";
            /* Load the library only from a fixed, trusted directory using an
             * absolute, canonical path so the JVM library search path cannot be
             * used to substitute an attacker-controlled native library. */
            java.io.File trustedDir = new java.io.File("/usr/lib/testcases").getCanonicalFile();
            java.io.File libraryFile = new java.io.File(trustedDir, libraryName).getCanonicalFile();
            if (libraryFile.getParentFile() != null
                    && libraryFile.getParentFile().equals(trustedDir)
                    && libraryFile.isFile())
            {
                System.load(libraryFile.getAbsolutePath());
            }
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

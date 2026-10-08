                                   
                                                             
                                                             
                                          
  
  
               
                          
                                                                                             
                                                
                
                                            
                                                  
                                                                                                                                           
  
     

package testcases.CWE369_Divide_by_Zero.s02;
import testcasesupport.*;

import java.security.SecureRandom;

public class CWE369_Divide_by_Zero__float_random_modulo_22a extends AbstractTestCase
{
                                                                                           
                                                                                           
    public static boolean badPublicStatic = false;

    public void bad() throws Throwable
    {
        float data = 0.0f;

                                                                                                      
        SecureRandom secureRandom = new SecureRandom();
        data = secureRandom.nextFloat();

        badPublicStatic = true;
        (new CWE369_Divide_by_Zero__float_random_modulo_22b()).badSink(data );
    }

                                                                                              
                                                                                           
    public static boolean goodB2G1PublicStatic = false;
    public static boolean goodB2G2PublicStatic = false;
    public static boolean goodG2BPublicStatic = false;

    public void good() throws Throwable
    {
    }

                                                                                                         
    

                                                                                                        
    

                                                
    

                                                                          
                                                                            
                                                                             
                                                                       
       
    public static void main(String[] args) throws ClassNotFoundException,
           InstantiationException, IllegalAccessException
    {
        mainFromParent(args);
    }
}

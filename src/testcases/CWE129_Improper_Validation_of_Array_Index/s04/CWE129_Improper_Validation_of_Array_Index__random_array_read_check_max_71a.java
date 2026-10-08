                                   
                                                                                         
                                                                          
                                          
  
  
               
                                              
                                               
                                                                  
                              
                                                                                              
                                                                                                                            
                                                                                                                                              
  
     

package testcases.CWE129_Improper_Validation_of_Array_Index.s04;
import testcasesupport.*;

import javax.servlet.http.*;

import java.security.SecureRandom;

public class CWE129_Improper_Validation_of_Array_Index__random_array_read_check_max_71a extends AbstractTestCase
{
    public void bad() throws Throwable
    {
        int data;

                                                        
        data = (new SecureRandom()).nextInt();

        (new CWE129_Improper_Validation_of_Array_Index__random_array_read_check_max_71b()).badSink((Object)data  );
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

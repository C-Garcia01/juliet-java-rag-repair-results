                                   
                                                                        
                                                                  
                                          
  
  
               
                                      
                                                                    
                                 
                
                                                         
                                                 
                                                                                                                
  
     

package testcases.CWE134_Uncontrolled_Format_String.s01;
import testcasesupport.*;

public class CWE134_Uncontrolled_Format_String__connect_tcp_printf_61a extends AbstractTestCase
{
    public void bad() throws Throwable
    {
        String data = (new CWE134_Uncontrolled_Format_String__connect_tcp_printf_61b()).badSource();

        if (data != null)
        {
                                                                
            System.out.printf("%s", data);
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

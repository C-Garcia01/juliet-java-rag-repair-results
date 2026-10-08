                                   
                                                                           
                                                              
                                          
  
  
               
                                                                                  
                                                                         
                                                 
                
                                                                  
                                                     
                                                                                                                                              
  
     

package testcases.CWE690_NULL_Deref_From_Return;

import testcasesupport.*;

import javax.servlet.http.*;

public class CWE690_NULL_Deref_From_Return__System_getProperty_equals_71a extends AbstractTestCase
{
    public void bad() throws Throwable
    {
        String data;

                                                     
        data = System.getProperty("CWE690");

        (new CWE690_NULL_Deref_From_Return__System_getProperty_equals_71b()).badSink((Object)data  );
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

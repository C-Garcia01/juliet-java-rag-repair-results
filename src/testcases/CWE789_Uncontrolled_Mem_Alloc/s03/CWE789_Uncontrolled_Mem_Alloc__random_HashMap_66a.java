                                   
                                                                
                                                                  
                                         
  
  
               
                                          
                                               
                                                                  
                 
                                                               
                                                                                                                               
  
     

package testcases.CWE789_Uncontrolled_Mem_Alloc.s03;
import testcasesupport.*;

import javax.servlet.http.*;

import java.security.SecureRandom;

public class CWE789_Uncontrolled_Mem_Alloc__random_HashMap_66a extends AbstractTestCase
{
    public void bad() throws Throwable
    {
        int data;

                                                        
        data = (new SecureRandom()).nextInt();

        int[] dataArray = new int[5];
        dataArray[2] = data;
        (new CWE789_Uncontrolled_Mem_Alloc__random_HashMap_66b()).badSink(dataArray  );
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

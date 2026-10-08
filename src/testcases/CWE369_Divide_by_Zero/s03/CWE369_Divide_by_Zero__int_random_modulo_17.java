                                   
                                                          
                                                           
                                         
  
  
              
                         
                                              
                                                                 
               
                                           
                                                 
                                          
 
    

package testcases.CWE369_Divide_by_Zero.s03;
import testcasesupport.*;

import javax.servlet.http.*;

import java.security.SecureRandom;

public class CWE369_Divide_by_Zero__int_random_modulo_17 extends AbstractTestCase
{
    public void bad() throws Throwable
    {
        int data;

                                                                    
                                                                        
                                
           

                                                        
        data = (new SecureRandom()).nextInt();

        for (int j = 0; j < 1; j++)
        {
                                                                                          
                                       
            IO.writeLine("100%" + data + " = " + (100 % data) + "\n");
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

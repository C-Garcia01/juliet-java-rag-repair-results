                                   
                                                          
                                                           
                                         
  
  
              
                         
                                              
                                                                 
               
                                             
                                                   
                                                        
 
    

package testcases.CWE369_Divide_by_Zero.s03;
import testcasesupport.*;

import javax.servlet.http.*;

import java.security.SecureRandom;

public class CWE369_Divide_by_Zero__int_random_divide_15 extends AbstractTestCase
{
    public void bad() throws Throwable
    {
        int data;

        switch (6)
        {
        case 6:
                                                            
            data = (new SecureRandom()).nextInt();
            break;
        default:
                                                                           
                                                                                           
            data = 0;
            break;
        }

        switch (7)
        {
        case 7:
                                                                                              
                                      
            IO.writeLine("bad: 100/" + data + " = " + (100 / data) + "\n");
            break;
        default:
                                                                              
            IO.writeLine("Benign, fixed string");
            break;
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

                                   
                                                                   
                                                              
                                          
  
  
               
                             
                                                                
                                                                  
                   
                                                                              
                                                            
                                                                                                                                                
  
     

package testcases.CWE191_Integer_Underflow.s05;
import testcasesupport.*;

import javax.servlet.http.*;

import java.util.logging.Level;

public class CWE191_Integer_Underflow__int_Environment_predec_68a extends AbstractTestCase
{
    public static int data;

    public void bad() throws Throwable
    {

        data = Integer.MIN_VALUE;                      

                                          
                                                                    
        {
            String stringNumber = System.getenv("ADD");
            if (stringNumber != null)                                 
            {
                try
                {
                    data = Integer.parseInt(stringNumber.trim());
                }
                catch(NumberFormatException exceptNumberFormat)
                {
                    IO.logger.log(Level.WARNING, "Number format exception parsing data from string", exceptNumberFormat);
                }
            }
        }

        (new CWE191_Integer_Underflow__int_Environment_predec_68b()).badSink();
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

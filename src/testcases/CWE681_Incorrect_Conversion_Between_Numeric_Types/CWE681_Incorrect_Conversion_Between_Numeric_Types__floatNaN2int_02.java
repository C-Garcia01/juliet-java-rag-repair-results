                                   
                                                                                 
                                                                                  
                                      
  
  
              
                                                     
                     
                                      
                                      
                                                       
 
    

package testcases.CWE681_Incorrect_Conversion_Between_Numeric_Types;

import testcasesupport.*;

import javax.servlet.http.*;
import java.io.*;

import java.util.logging.Level;

public class CWE681_Incorrect_Conversion_Between_Numeric_Types__floatNaN2int_02 extends AbstractTestCase
{
    public void bad() throws Throwable
    {
        if (true)
        {
            BufferedReader readerBuffered = null;
            InputStreamReader readerInputStream = null;
            try
            {
                                                                    
                  
                                                                                        
                   
                readerInputStream = new InputStreamReader(System.in, "UTF-8");
                readerBuffered = new BufferedReader(readerInputStream);
                float num = 0;
                IO.writeString("Enter float number (-2.0): ");
                try
                {
                    num = Float.parseFloat(readerBuffered.readLine());
                }
                catch (NumberFormatException exceptionNumberFormat)
                {
                    IO.writeLine("Error parsing number");
                }
                                                                                  
                double result = Math.sqrt(num);
                if (Double.isNaN(result))
                {
                    IO.writeLine("Cannot compute an integer square root for NaN or negative input");
                }
                else
                {
                    IO.writeLine("" + (int)result);
                }
            }
            catch (IOException exceptIO)
            {
                IO.logger.log(Level.WARNING, "Error with stream reading", exceptIO);
            }
            finally
            {
                try
                {
                    if (readerBuffered != null)
                    {
                        readerBuffered.close();
                    }
                }
                catch (IOException exceptIO)
                {
                    IO.logger.log(Level.WARNING, "Error closing BufferedReader", exceptIO);
                }
                try
                {
                    if (readerInputStream != null)
                    {
                        readerInputStream.close();
                    }
                }
                catch (IOException exceptIO)
                {
                    IO.logger.log(Level.WARNING, "Error closing InputStreamReader", exceptIO);
                }
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

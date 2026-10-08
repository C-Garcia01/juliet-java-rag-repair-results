                                   
                                                                              
                                                                     
                                        
  
  
              
                                   
                                                                                      
                                                                 
                                           
                                                                                           
 
    

package testcases.CWE197_Numeric_Truncation_Error.s01;
import testcasesupport.*;

import java.util.Properties;

import java.io.FileInputStream;
import java.io.IOException;

import java.util.logging.Level;

public class CWE197_Numeric_Truncation_Error__int_PropertiesFile_to_short_11 extends AbstractTestCase
{
                                    
    public void bad() throws Throwable
    {
        int data;
        if (IO.staticReturnsTrue())
        {
            data = Integer.MIN_VALUE;                      
                                       
            {
                Properties properties = new Properties();
                FileInputStream streamFileInput = null;
                try
                {
                    streamFileInput = new FileInputStream("../common/config.properties");
                    properties.load(streamFileInput);
                                                                           
                    String stringNumber = properties.getProperty("data");
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
                catch (IOException exceptIO)
                {
                    IO.logger.log(Level.WARNING, "Error with stream reading", exceptIO);
                }
                finally
                {
                                                     
                    try
                    {
                        if (streamFileInput != null)
                        {
                            streamFileInput.close();
                        }
                    }
                    catch (IOException exceptIO)
                    {
                        IO.logger.log(Level.WARNING, "Error closing FileInputStream", exceptIO);
                    }
                }
            }
        }
        else
        {
                                                                           
                                                                                           
            data = 0;
        }

        {
                                                                                              
            if (data >= Short.MIN_VALUE && data <= Short.MAX_VALUE)
            {
                IO.writeLine((short)data);
            }
            else
            {
                IO.writeLine("data value is out of range for the short type and cannot be safely narrowed");
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

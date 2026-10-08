                                   
                                                                       
                                                                       
                                        
  
  
              
                                   
                                                                                      
                                                                 
                                         
                                          
 
    

package testcases.CWE197_Numeric_Truncation_Error.s02;
import testcasesupport.*;

import java.util.Properties;

import java.io.FileInputStream;
import java.io.IOException;

import java.util.logging.Level;

public class CWE197_Numeric_Truncation_Error__short_PropertiesFile_15 extends AbstractTestCase
{
                                    
    public void bad() throws Throwable
    {
        short data = 0;

        switch (6)
        {
        case 6:
            data = Short.MIN_VALUE;                      
                                       
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
                            data = Short.parseShort(stringNumber.trim());
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
            break;
        default:
                                                                           
                                                                                           
            data = 0;
            break;
        }

        {
                                                                                             
            IO.writeLine(data);
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

                                   
                                                                          
                                                           
                                         
  
  
              
                              
                                                                                                             
                                                                 
              
                                                                              
                                                    
                                                                                           
 
    

package testcases.CWE400_Resource_Exhaustion.s01;
import testcasesupport.*;

import javax.servlet.http.*;


import java.util.StringTokenizer;
import java.util.logging.Level;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.BufferedWriter;
import java.io.IOException;


public class CWE400_Resource_Exhaustion__getQueryString_Servlet_write_11 extends AbstractTestCaseServlet
{
    public void bad(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        int count;
        if (IO.staticReturnsTrue())
        {
            count = Integer.MIN_VALUE;                                                         
                                                                                                    
            {
                StringTokenizer tokenizer = new StringTokenizer(request.getQueryString(), "&");
                while (tokenizer.hasMoreTokens())
                {
                    String token = tokenizer.nextToken();                                   
                    if(token.startsWith("id="))                                           
                    {
                        try
                        {
                            count = Integer.parseInt(token.substring(3));                              
                        }
                        catch(NumberFormatException exceptNumberFormat)
                        {
                            IO.logger.log(Level.WARNING, "Number format exception reading id from query string", exceptNumberFormat);
                        }
                        break;                      
                    }
                }
            }
        }
        else
        {
                                                                           
                                                                                            
            count = 0;
        }

        if(IO.staticReturnsTrue())
        {
            File file = new File("badSink.txt");
            FileOutputStream streamFileOutput = new FileOutputStream(file);
            OutputStreamWriter writerOutputStream = new OutputStreamWriter(streamFileOutput, "UTF-8");
            BufferedWriter writerBuffered = new BufferedWriter(writerOutputStream);
            /* Limit the number of writes to a reasonable upper bound to avoid exhausting resources */
            if (count > 20)
            {
                count = 20;
            }
            int i;
                                                                                                                  
            for (i = 0; i < count; i++)
            {
                try
                {
                    writerBuffered.write("Hello");
                }
                catch (IOException exceptIO)
                {
                    IO.logger.log(Level.WARNING, "Error with stream writing", exceptIO);
                }
            }
                                              
            try
            {
                if (writerBuffered != null)
                {
                    writerBuffered.close();
                }
            }
            catch (IOException exceptIO)
            {
                IO.logger.log(Level.WARNING, "Error closing BufferedWriter", exceptIO);
            }
            try
            {
                if (writerOutputStream != null)
                {
                    writerOutputStream.close();
                }
            }
            catch (IOException exceptIO)
            {
                IO.logger.log(Level.WARNING, "Error closing OutputStreamWriter", exceptIO);
            }
            try
            {
                if (streamFileOutput != null)
                {
                    streamFileOutput.close();
                }
            }
            catch (IOException exceptIO)
            {
                IO.logger.log(Level.WARNING, "Error closing FileOutputStream", exceptIO);
            }
        }
    }

                                                                                                                     
    

                                                                                     
    

                                                                                                                      
    

                                                                                       
    

    public void good(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
    }

                                                                          
                                                                            
                                                                             
                                                                       
       
    public static void main(String[] args) throws ClassNotFoundException,
           InstantiationException, IllegalAccessException
    {
        mainFromParent(args);
    }
}

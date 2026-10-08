                                   
                                                              
                                                          
                                      
  
  
              
                             
                          
                                                 
                                                                                                                     
                           
 
    

package testcases.CWE459_Incomplete_Cleanup;

import testcasesupport.*;

import javax.servlet.http.*;

import java.io.File;
import java.io.IOException;

import java.util.logging.Level;

public class CWE459_Incomplete_Cleanup__Servlet_temp_file_01 extends AbstractTestCaseServlet
{
    public void bad(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {

        File tempFile = null;

        try
        {
            tempFile = File.createTempFile("temp", "1234");

                                                                                               
                                                                                                   
                                                        
            tempFile.deleteOnExit();

                                                                                   
            if (!tempFile.setWritable(true, true))
            {
                IO.logger.log(Level.WARNING, "Could not set Writable permissions");
            }
            if (!tempFile.setReadable(true, true))
            {
                IO.logger.log(Level.WARNING, "Could not set Readable permissions");
            }
            if (!tempFile.setExecutable(false))
            {
                IO.logger.log(Level.WARNING, "Could not set Executable permissions");
            }

            /* complete the cleanup by deleting the temporary file now that we are
             * done with it, instead of relying only on deleteOnExit() */
            if (!tempFile.delete())
            {
                IO.logger.log(Level.WARNING, "Could not delete temporary file");
            }
        }
        catch (IOException exceptIO)
        {
            IO.logger.log(Level.WARNING, "Could not create temporary file", exceptIO);
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


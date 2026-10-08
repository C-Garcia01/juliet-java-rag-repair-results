                                   
                                                                       
                                                                                      
                                      
  
  
              
                                              
        
                                                
                                                 
                                                       
 
    

package testcases.CWE379_Temporary_File_Creation_in_Insecure_Dir;

import testcasesupport.*;

import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;

import java.util.logging.Level;

public class CWE379_Temporary_File_Creation_in_Insecure_Dir__basic_02 extends AbstractTestCase
{
    public void bad() throws Throwable
    {
        if (true)
        {
            FileOutputStream streamFileOutput = null;
            OutputStreamWriter writerOutputStream = null;
            BufferedWriter writerBuffered = null;
            File tempFile = null;
            try
            {
                tempFile = File.createTempFile("temp", "1234");
                if (tempFile != null)
                {
                    IO.writeLine("Temporary file created");
                                                                                                                       
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
                                                     
                    streamFileOutput = new FileOutputStream(tempFile);
                    writerOutputStream = new OutputStreamWriter(streamFileOutput, "UTF-8");
                    writerBuffered = new BufferedWriter(writerOutputStream);
                    writerBuffered.write(42);
                }
            }
            catch (IOException exceptIO)
            {
                IO.logger.log(Level.WARNING, "Error writing to temporary file", exceptIO);
            }
            finally
            {
                                               
                if (tempFile.exists())
                {
                    tempFile.delete();
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

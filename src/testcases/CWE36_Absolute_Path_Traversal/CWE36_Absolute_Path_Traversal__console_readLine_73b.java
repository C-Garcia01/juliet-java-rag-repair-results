                                   
                                                                  
                                                              
                                         
  
  
               
                                  
                                                                          
                                 
                  
                                             
                                                                                                                                   
  
     

package testcases.CWE36_Absolute_Path_Traversal;

import testcasesupport.*;
import java.util.LinkedList;

import java.io.*;
import javax.servlet.http.*;

import java.util.logging.Level;

public class CWE36_Absolute_Path_Traversal__console_readLine_73b
{
    public void badSink(LinkedList<String> dataLinkedList ) throws Throwable
    {
        String data = dataLinkedList.remove(2);

                                                            
        if (data != null)
        {
            File baseDirectory = new File(System.getProperty("user.dir"));
            File file = new File(baseDirectory, data);
            String canonicalBasePath = baseDirectory.getCanonicalPath();
            String canonicalFilePath = file.getCanonicalPath();
            FileInputStream streamFileInputSink = null;
            InputStreamReader readerInputStreamSink = null;
            BufferedReader readerBufferdSink = null;
            if ((canonicalFilePath.equals(canonicalBasePath)
                    || canonicalFilePath.startsWith(canonicalBasePath + File.separator))
                && file.exists() && file.isFile())
            {
                try
                {
                    streamFileInputSink = new FileInputStream(file);
                    readerInputStreamSink = new InputStreamReader(streamFileInputSink, "UTF-8");
                    readerBufferdSink = new BufferedReader(readerInputStreamSink);
                    IO.writeLine(readerBufferdSink.readLine());
                }
                catch (IOException exceptIO)
                {
                    IO.logger.log(Level.WARNING, "Error with stream reading", exceptIO);
                }
                finally
                {
                                                      
                    try
                    {
                        if (readerBufferdSink != null)
                        {
                            readerBufferdSink.close();
                        }
                    }
                    catch (IOException exceptIO)
                    {
                        IO.logger.log(Level.WARNING, "Error closing BufferedReader", exceptIO);
                    }

                    try
                    {
                        if (readerInputStreamSink != null)
                        {
                            readerInputStreamSink.close();
                        }
                    }
                    catch (IOException exceptIO)
                    {
                        IO.logger.log(Level.WARNING, "Error closing InputStreamReader", exceptIO);
                    }

                    try
                    {
                        if (streamFileInputSink != null)
                        {
                            streamFileInputSink.close();
                        }
                    }
                    catch (IOException exceptIO)
                    {
                        IO.logger.log(Level.WARNING, "Error closing FileInputStream", exceptIO);
                    }
                }
            }
        }

    }

                                                
    
}

                                   
                                                       
                                                         
                                        
  
  
              
                                                                                             
                                                                   
                                                
                                           
                           
 
    

package testcases.CWE470_Unsafe_Reflection;

import testcasesupport.*;

import javax.servlet.http.*;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.net.Socket;

import java.util.logging.Level;

public class CWE470_Unsafe_Reflection__connect_tcp_01 extends AbstractTestCase
{
                                    
    public void bad() throws Throwable
    {
        String data;

        data = "";                      

                                                        
        {
            Socket socket = null;
            BufferedReader readerBuffered = null;
            InputStreamReader readerInputStream = null;

            try
            {
                                                                
                socket = new Socket("host.example.org", 39544);

                                            

                readerInputStream = new InputStreamReader(socket.getInputStream(), "UTF-8");
                readerBuffered = new BufferedReader(readerInputStream);

                                                                                
                data = readerBuffered.readLine();
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

                                             
                try
                {
                    if (socket != null)
                    {
                        socket.close();
                    }
                }
                catch (IOException exceptIO)
                {
                    IO.logger.log(Level.WARNING, "Error closing Socket", exceptIO);
                }
            }
        }

                                                                                                          
        Class<?> tempClass = null;

                                                                                      
        if ("java.lang.String".equals(data)
                || "java.lang.Integer".equals(data)
                || "java.lang.Long".equals(data)
                || "java.lang.Object".equals(data))
        {
            tempClass = Class.forName(data);
        }

        if (tempClass != null)
        {
            Object tempClassObject = tempClass.newInstance();

            IO.writeLine(tempClassObject.toString());
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


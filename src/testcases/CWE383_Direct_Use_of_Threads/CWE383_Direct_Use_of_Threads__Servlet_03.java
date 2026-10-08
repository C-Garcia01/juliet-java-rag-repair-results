                                   
                                                       
                                                                      
                                              
  
  
              
                                                   
        
                                         
                           
                                         
 
    

package testcases.CWE383_Direct_Use_of_Threads;

import testcasesupport.*;

import javax.servlet.http.*;
import java.util.concurrent.*;

public class CWE383_Direct_Use_of_Threads__Servlet_03 extends AbstractTestCaseServletBadOnly
{
    public void bad(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        if (5 == 5)
        {
                                                            
            Runnable runnable = new Runnable()
            {
                public void run()
                {
                    try
                    {
                        Thread.sleep(10000);                                 
                    }
                    catch (InterruptedException exceptInterrupted)
                    {
                        IO.writeLine("InterruptedException");
                    }
                }
            };
            ExecutorService executor = Executors.newSingleThreadExecutor();
            Future<?> future = executor.submit(runnable);
                                                         
            try
            {
                future.get();
            }
            catch (ExecutionException exceptExecution)
            {
                IO.writeLine("ExecutionException");
            }
            finally
            {
                executor.shutdown();
            }
            response.getWriter().write("thread is done!");
        }
    }

                                                                          
                                                                            
                                                                             
                                                                       
       
    public static void main(String[] args) throws ClassNotFoundException,
           InstantiationException, IllegalAccessException
    {
        mainFromParent(args);
    }
}

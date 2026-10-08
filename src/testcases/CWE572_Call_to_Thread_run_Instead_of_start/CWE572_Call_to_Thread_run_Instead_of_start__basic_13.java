                                   
                                                                   
                                                                                  
                                      
  
  
              
                                                     
        
                                 
                               
                                                                                            
 
    

package testcases.CWE572_Call_to_Thread_run_Instead_of_start;

import testcasesupport.*;

public class CWE572_Call_to_Thread_run_Instead_of_start__basic_13 extends AbstractTestCase
{
    public void bad() throws Throwable
    {
        if (IO.STATIC_FINAL_FIVE == 5)
        {
            IO.writeLine("bad() Main thread name is: " + Thread.currentThread().getName());
            Thread threadOne = new Thread()
            {
                public void run()
                {
                    IO.writeLine("bad() In thread: " + Thread.currentThread().getName());
                }
            };
            threadOne.run();                                                          
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

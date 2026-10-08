  
                                                                                                                                
   
     
package testcases.CWE832_Unlock_Not_Locked;

import java.util.concurrent.locks.ReentrantLock;

import testcasesupport.AbstractTestCase;
import testcasesupport.IO;

public class CWE832_Unlock_Not_Locked__ReentrantLock_Thread_01 extends AbstractTestCase 
{
                                                            
    static private int intBad = 1;
    static private final ReentrantLock REENTRANT_LOCK_BAD = new ReentrantLock();

    static public void helperBad() 
    {
        REENTRANT_LOCK_BAD.lock();

                                                               
                                                                                                  
        try
        { 
            intBad = intBad * 2;
        } 
        finally 
        {
            REENTRANT_LOCK_BAD.unlock();                                                                                                           
        }
    }

    public void bad() throws Throwable 
    {
                            
        Thread threadOne = new Thread(new Runnable() 
        {
            public void run() 
            { 
                CWE832_Unlock_Not_Locked__ReentrantLock_Thread_01.helperBad(); 
            }
        });
        
        Thread threadTwo = new Thread(new Runnable() 
        {
            public void run() 
            { 
                CWE832_Unlock_Not_Locked__ReentrantLock_Thread_01.helperBad(); 
            }
        });

                           
        threadOne.start();
        threadTwo.start();

                                        
        threadOne.join();
        threadTwo.join();

                          
        IO.writeLine(intBad);  
    }

                                                                                   
    static private int intGood1 = 1;
    static private final ReentrantLock REENTRANT_LOCK_GOOD1 = new ReentrantLock();

    static public void helperGood1() 
    {
        REENTRANT_LOCK_GOOD1.lock();                                                    
                                                               
                                                                                                  
        try
        { 
            intGood1 = intGood1 * 2;
        } 
        finally 
        {
            REENTRANT_LOCK_GOOD1.unlock();                                                      
        }
    }

      

    public void good() throws InterruptedException 
    {
    }

                                                                           
                                                                             
                                                                              
                                                                        
     
    public static void main(String[] args) 
            throws ClassNotFoundException, InstantiationException, IllegalAccessException 
    {
        mainFromParent(args);
    }
}

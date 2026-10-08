  
                                                                                                                                                                                                                                       
   
     
package testcases.CWE765_Multiple_Unlocks;

import java.util.concurrent.locks.ReentrantLock;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import testcasesupport.AbstractTestCaseServlet;

public class CWE765_Multiple_Unlocks__ReentrantLock_Servlet_01 extends AbstractTestCaseServlet 
{
    private static final long serialVersionUID = 1L;

                                                   
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

    public void bad(HttpServletRequest request, HttpServletResponse response) throws Throwable 
    {
        helperBad();
        response.getWriter().write(intBad);
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

      

    public void good(HttpServletRequest request, HttpServletResponse response) throws Throwable 
    {
    } 
}

  
                                                                                                                                                                                                                                     
   
     

package testcases.CWE609_Double_Checked_Locking;

import java.util.concurrent.locks.ReentrantLock;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import testcasesupport.AbstractTestCaseServlet;

public class CWE609_Double_Checked_Locking__Servlet_01 extends AbstractTestCaseServlet 
{
    private static final long serialVersionUID = 1L;

                                               
    private static String stringBad = null;
    
                                                                                                                                                 
                                                                                              
    public static String helperBad() 
    { 
        if (stringBad == null)
        {
            synchronized(CWE609_Double_Checked_Locking__Servlet_01.class)
            {
                if (stringBad == null)
                {
                    stringBad = "stringBad";
                }
            }
        }
        return stringBad;
    }
  
    public void bad(HttpServletRequest request, HttpServletResponse response) throws Throwable 
    {
        response.getWriter().write(helperBad());
    }
  
  
                                                                 
                                                 
    private volatile static String stringGood1 = null;                                  
    
    public static String helperGood1() 
    { 
        if (stringGood1 == null)
        {
            synchronized(CWE609_Double_Checked_Locking__Servlet_01.class)
            {
                if (stringGood1 == null)
                {
                    stringGood1 = "stringGood1";
                }
            }
        }
        return stringGood1;
    }
  
    
  
                                                                                      
    private static String stringGood2 = null;  
    
    public synchronized static String helperGood2()                                  
    { 
        if (stringGood2 == null)
        {
            stringGood2 = "stringGood2";
        }
        return stringGood2;
    }
  
    
  
                                                                                        
    private static String stringGood3 = null; 

    public static String helperGood3() 
    { 
                                                                               
        synchronized(CWE609_Double_Checked_Locking__Thread_01.class) 
        { 
            if (stringGood3 == null)
            {
                stringGood3 = "stringGood3";
            }
            return stringGood3;
        }
    }
  
    
  
                                                                     
    private static String stringGood4 = null; 
    static private final Object stringGood4Lock = new Object();

    public static String helperGood4() 
    { 
                                                           
        synchronized(stringGood4Lock) 
        { 
            if (stringGood4 == null)
            {
                stringGood4 = "stringGood4";
            }
            return stringGood4;
        }
    }
  
    
  
                                                                       
    private static String stringGood5 = null; 
    static private final ReentrantLock good5ReentrantLock = new ReentrantLock();

    public static String helperGood5() 
    { 
        good5ReentrantLock.lock();                                                     
                                                               
                                                                                                  
        try 
        { 
            if (stringGood5 == null)
            {
                stringGood5 = "stringGood5";
            }
            return stringGood5;
        } 
        finally 
        {
            good5ReentrantLock.unlock();
        }
    }
  
    
  
    public void good(HttpServletRequest request, HttpServletResponse response) throws Throwable 
    {
    } 
}

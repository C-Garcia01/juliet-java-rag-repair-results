                                   
                                                                               
                                                                  
                                        
  
  
              
                                         
                                                                                   
                                                                 
                                                                       
                                                       
 
    

package testcases.CWE789_Uncontrolled_Mem_Alloc.s02;
import testcasesupport.*;

import javax.servlet.http.*;


import java.util.logging.Level;

import java.util.ArrayList;

public class CWE789_Uncontrolled_Mem_Alloc__getParameter_Servlet_ArrayList_02 extends AbstractTestCaseServlet
{
                                    
    public void bad(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        int data;
        if (true)
        {
            data = Integer.MIN_VALUE;                      
                                                                                   
            {
                String stringNumber = request.getParameter("name");
                try
                {
                    data = Integer.parseInt(stringNumber.trim());
                }
                catch(NumberFormatException exceptNumberFormat)
                {
                    IO.logger.log(Level.WARNING, "Number format exception reading data from parameter 'name'", exceptNumberFormat);
                }
            }
        }
        else
        {
                                                                           
                                                                                           
            data = 0;
        }

        final int MAX_INITIAL_CAPACITY = 1000000;
        if (data < 0 || data > MAX_INITIAL_CAPACITY)
        {
            throw new IllegalArgumentException("Requested ArrayList capacity is out of the allowed range");
        }
        ArrayList intArrayList = new ArrayList(data);

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

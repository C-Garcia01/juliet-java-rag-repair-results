                                   
                                                                       
                                                                
                                         
  
  
              
                                             
                                                                                   
                                          
        
                                     
                                          
                           
 
    

package testcases.CWE606_Unchecked_Loop_Condition;

import testcasesupport.*;

import javax.servlet.http.*;


public class CWE606_Unchecked_Loop_Condition__getParameter_Servlet_01 extends AbstractTestCaseServlet
{
    public void bad(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        String data;

                                                                             
        data = request.getParameter("name");

        int numberOfLoops;
        try
        {
            numberOfLoops = Integer.parseInt(data);
        }
        catch (NumberFormatException exceptNumberFormat)
        {
            IO.writeLine("Invalid response. Numeric input expected. Assuming 1.");
            numberOfLoops = 1;
        }

        final int MAX_NUMBER_OF_LOOPS = 10000;
        if (numberOfLoops < 0)
        {
            numberOfLoops = 0;
        }
        else if (numberOfLoops > MAX_NUMBER_OF_LOOPS)
        {
            numberOfLoops = MAX_NUMBER_OF_LOOPS;
        }

        for (int i=0; i < numberOfLoops; i++)
        {
                                                                                
            IO.writeLine("hello world");
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


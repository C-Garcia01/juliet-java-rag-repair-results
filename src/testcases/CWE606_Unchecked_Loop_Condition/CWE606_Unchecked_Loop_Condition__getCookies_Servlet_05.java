                                   
                                                                     
                                                                
                                         
  
  
              
                                             
                                                                                  
                                          
        
                                     
                                          
                                                                     
 
    

package testcases.CWE606_Unchecked_Loop_Condition;

import testcasesupport.*;

import javax.servlet.http.*;


public class CWE606_Unchecked_Loop_Condition__getCookies_Servlet_05 extends AbstractTestCaseServlet
{
                                                                        
                                                                          
                                                                  
       
    private boolean privateTrue = true;
    private boolean privateFalse = false;

    public void bad(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        String data;
        if (privateTrue)
        {
            data = "";                                                   
                                        
            {
                Cookie cookieSources[] = request.getCookies();
                if (cookieSources != null)
                {
                                                                               
                    data = cookieSources[0].getValue();
                }
            }
        }
        else
        {
                                                                           
                                                                                           
            data = null;
        }

        if (privateTrue)
        {
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
            if (numberOfLoops < 0 || numberOfLoops > 100)
            {
                IO.writeLine("Loop count out of allowed range. Assuming 1.");
                numberOfLoops = 1;
            }
            for (int i=0; i < numberOfLoops; i++)
            {
                                                                                    
                IO.writeLine("hello world");
            }
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

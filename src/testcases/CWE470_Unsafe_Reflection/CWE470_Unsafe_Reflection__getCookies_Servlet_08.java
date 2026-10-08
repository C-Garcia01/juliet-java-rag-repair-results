                                   
                                                              
                                                         
                                        
  
  
              
                                                                                             
                                                                                  
                                                
                                           
                                                                                       
 
    

package testcases.CWE470_Unsafe_Reflection;

import testcasesupport.*;

import javax.servlet.http.*;


public class CWE470_Unsafe_Reflection__getCookies_Servlet_08 extends AbstractTestCaseServlet
{
                                                                
                                                            
                                                
       
    private boolean privateReturnsTrue()
    {
        return true;
    }

    private boolean privateReturnsFalse()
    {
        return false;
    }

                                    
    public void bad(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        String data;
        if (privateReturnsTrue())
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

                                                                                                          
        java.util.Set<String> allowedClassNames = new java.util.HashSet<String>();
        allowedClassNames.add("java.lang.String");
        allowedClassNames.add("java.util.ArrayList");
        allowedClassNames.add("java.lang.Object");
        if (data != null && allowedClassNames.contains(data))
        {
            Class<?> tempClass = Class.forName(data);
            Object tempClassObject = tempClass.newInstance();

            IO.writeLine(tempClassObject.toString());
        }
        else
        {
            IO.writeLine("Requested class is not allowed");
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

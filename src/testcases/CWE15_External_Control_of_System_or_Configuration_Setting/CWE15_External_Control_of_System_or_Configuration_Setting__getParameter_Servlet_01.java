                                   
                                                                                                 
                                                                                          
                                        
  
  
              
                                                             
                                                                                   
                                
                                                       
                           
 
    

package testcases.CWE15_External_Control_of_System_or_Configuration_Setting;

import testcasesupport.*;

import javax.servlet.http.*;


import java.sql.*;

import java.util.logging.Level;

public class CWE15_External_Control_of_System_or_Configuration_Setting__getParameter_Servlet_01 extends AbstractTestCaseServlet
{
                                    
    public void bad(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        String data;

                                                                             
        data = request.getParameter("name");

        Connection dbConnection = null;

        try
        {
            dbConnection = IO.getDBConnection();

            /* Only honor the requested catalog when it is one the application
             * is configured to serve, so a request can select a legitimate
             * catalog but cannot steer the connection to an arbitrary one. */
            java.util.Set<String> allowedCatalogs = new java.util.HashSet<String>(
                java.util.Arrays.asList("inventory", "reporting", "analytics"));

            if (data != null && allowedCatalogs.contains(data))
            {
                dbConnection.setCatalog(data);
            }
        }
        catch (SQLException exceptSql)
        {
            IO.logger.log(Level.WARNING, "Error getting database connection", exceptSql);
        }
        finally
        {
            try
            {
                if (dbConnection != null)
                {
                    dbConnection.close();
                }
            }
            catch (SQLException exceptSql)
            {
                IO.logger.log(Level.WARNING, "Error closing Connection", exceptSql);
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


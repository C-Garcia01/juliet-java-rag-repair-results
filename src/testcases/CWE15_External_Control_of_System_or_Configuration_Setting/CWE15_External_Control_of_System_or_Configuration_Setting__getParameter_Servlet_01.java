                                   
                                                                                                 
                                                                                          
                                        
  
  
              
                                                             
                                                                                   
                                
                                                       
                           
 
    

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

                                                                          
                                                                                                   
            dbConnection.setCatalog(data);
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


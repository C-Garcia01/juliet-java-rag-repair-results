  
                                                                                                                                                            
   
     

package testcases.CWE772_Missing_Release_of_Resource;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.security.SecureRandom;

import java.util.logging.Level;

import testcasesupport.AbstractTestCase;
import testcasesupport.IO;

public class CWE772_Missing_Release_of_Resource__db_Connection_01 extends AbstractTestCase 
{
    public void bad()
    {
        ResultSet resultSet = null;
        Connection dBConnection = null;
        PreparedStatement preparedStatement = null;

        try
        {
            int intId = (new SecureRandom()).nextInt(200);

            dBConnection = IO.getDBConnection();
            preparedStatement = dBConnection.prepareStatement("select * from users where id=?");
            preparedStatement.setInt(1, intId);
            
            resultSet = preparedStatement.executeQuery();
            
            if (resultSet.first())
            {
                IO.writeString(resultSet.toString());
            }
        }
        catch (SQLException exceptSql)
        {
            IO.logger.log(Level.WARNING, "Error!", exceptSql);
        }
        finally
        {
            try
            {
                if (resultSet != null)
                {
                    resultSet.close();
                }
            }
            catch (SQLException exceptSqlResultSet)
            {
                IO.logger.log(Level.WARNING, "Error closing ResultSet", exceptSqlResultSet);
            }

            try
            {
                if (preparedStatement != null)
                {
                    preparedStatement.close();
                }
            }
            catch (SQLException exceptSqlStatement)
            {
                IO.logger.log(Level.WARNING, "Error closing PreparedStatement", exceptSqlStatement);
            }

            try
            {
                if (dBConnection != null)
                {
                    dBConnection.close();
                }
            }
            catch (SQLException exceptSqlConnection)
            {
                IO.logger.log(Level.WARNING, "Error closing Connection", exceptSqlConnection);
            }
        }
        
                                               
        
    }

    
    
    public void good()
    {
    }
    
                                                                           
                                                                             
                                                                              
                                                                        
     
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}

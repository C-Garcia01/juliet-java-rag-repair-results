                                   
                                                            
                                                           
                                         
  
  
               
                               
                                                              
                                                          
                       
                                                            
                                                                                                                
  
     

package testcases.CWE259_Hard_Coded_Password;

import testcasesupport.*;

import java.util.logging.Level;
import java.io.*;

public class CWE259_Hard_Coded_Password__driverManager_61b
{
    public String badSource() throws Throwable
    {
        String data;

                                                  
        data = System.getenv("DB_PASSWORD");

        return data;
    }

                                                
    
}

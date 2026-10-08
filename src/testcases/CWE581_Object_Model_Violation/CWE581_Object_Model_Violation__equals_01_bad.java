  
                                                                                     
                                                                               
   
                                                                              
                                                                                
   
     

package testcases.CWE581_Object_Model_Violation;

import testcasesupport.*;

public class CWE581_Object_Model_Violation__equals_01_bad extends AbstractTestCaseClassIssueBad 
{
    private String message = "test";
    public void setMessage(String message) 
    {
        this.message = message;
    }
    
                                                         
    private int seed = 12345;                                  
    
    public int hashCode() 
    {
        return message.hashCode() + seed;
    }

    public boolean equals(Object obj) 
    {
        if (this == obj) 
        {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) 
        {
            return false;
        }
        CWE581_Object_Model_Violation__equals_01_bad other = (CWE581_Object_Model_Violation__equals_01_bad) obj;
        if (seed != other.seed) 
        {
            return false;
        }
        if (message == null) 
        {
            return other.message == null;
        }
        return message.equals(other.message);
    }
    
    public void bad() 
    { 
                               
    }

                                                                           
                                                                             
                                                                              
                                                                        
     
    public static void main(String[] args) 
            throws ClassNotFoundException, InstantiationException, IllegalAccessException 
    {
        mainFromParent(args);
    }
}

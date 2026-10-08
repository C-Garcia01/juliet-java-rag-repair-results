  
                                                        
  
     

package testcases.CWE674_Uncontrolled_Recursion;

import testcasesupport.AbstractTestCase;
import testcasesupport.IO;

public class CWE674_Uncontrolled_Recursion__long_01 extends AbstractTestCase 
{
    private static final long RECURSION_LONG_MAX = 10;

    private static void helperBad(long level)
    {
        if (level > RECURSION_LONG_MAX) 
        {
            IO.writeLine("ERROR IN RECURSION");
            return;
        }

        if (level == 0) 
        {
            return;
        }

        helperBad(level - 1);
    }
    
    public void bad()
    {
        long longMax = Long.MAX_VALUE;
            
        helperBad(longMax);
    }
    
    private static void helperGood1(long level)
    {
                                                  
        if (level > RECURSION_LONG_MAX) 
        {
            IO.writeLine("ERROR IN RECURSION");
            return;
        }

        if (level == 0) 
        {
            return;
        }

        helperGood1(level - 1);
    }
    
    
    
    public void good()  
    {
    }    
    
                                                                           
                                                                             
                                                                              
                                                                        
     
    public static void main(String[] args) 
            throws ClassNotFoundException, InstantiationException, IllegalAccessException 
    {
        mainFromParent(args);
    }
}

                                   
                                                              
                                                                             
                                      
  
  
              
                                         
        
                                                   
                                                    
                                                                              
 
    

package testcases.CWE478_Missing_Default_Case_in_Switch;

import testcasesupport.*;

import java.io.*;

import java.security.SecureRandom;

public class CWE478_Missing_Default_Case_in_Switch__basic_14 extends AbstractTestCase
{
    public void bad() throws Throwable
    {
        if (IO.staticFive == 5)
        {
            String stringIntValue = "";
            int x = (new SecureRandom()).nextInt(3);
            switch (x)
            {
            case 0:
                stringIntValue = "0";
                break;
            case 1:
                stringIntValue = "1";
                break;
                                                                                 
            }
            IO.writeLine(stringIntValue);
        }
    }

                                                              
    

                                                         
    

    public void good() throws Throwable
    {
    }

                                                                          
                                                                            
                                                                             
                                                                       
       
    public static void main(String[] args) throws ClassNotFoundException,
           InstantiationException, IllegalAccessException
    {
        mainFromParent(args);
    }
}

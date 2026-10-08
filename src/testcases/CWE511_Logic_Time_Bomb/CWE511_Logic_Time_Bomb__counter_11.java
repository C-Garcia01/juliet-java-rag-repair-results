                                   
                                                 
                                                       
                                      
  
  
              
                          
                
                                                                       
                                                                       
                                                                                           
 
    

package testcases.CWE511_Logic_Time_Bomb;

import testcasesupport.*;

public class CWE511_Logic_Time_Bomb__counter_11 extends AbstractTestCase
{
    public void bad() throws Throwable
    {
        if (IO.staticReturnsTrue())
        {
            int count = 0;
            do
            {
                                                      
                if (count == 20000)
                {
                    Runtime.getRuntime().exec("c:\\windows\\system32\\evil.exe");
                }
                count++;
            }
            while (count < Integer.MAX_VALUE);
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

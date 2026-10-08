  
                                           
  
     

package testcases.CWE835_Infinite_Loop;

import testcasesupport.*;

public class CWE835_Infinite_Loop__do_01 extends AbstractTestCase 
{
    
    public void bad()
    {
        int i = 0;
    
                                                            
        do 
        {
            IO.writeLine(i);
            i = i + 1;
        } while(i < 256);
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

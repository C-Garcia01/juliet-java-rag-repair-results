                                   
                                                            
                                                                
                                         
  
  
              
                                   
                              
                                          
        
                                                                   
                                              
                                          
 
    

package testcases.CWE476_NULL_Pointer_Dereference;

import testcasesupport.*;

public class CWE476_NULL_Pointer_Dereference__int_array_17 extends AbstractTestCase
{
    public void bad() throws Throwable
    {
        int [] data;

                                                                    
                                                                        
                                
           

                                          
        data = new int[] {1, 2, 3, 4, 5};

        for (int j = 0; j < 1; j++)
        {
                                                                             
            IO.writeLine("" + data.length);
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

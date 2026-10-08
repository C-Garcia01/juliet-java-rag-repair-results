                                   
                                                             
                                                             
                                          
  
  
               
                          
                                                                                             
                                                
                
                                            
                                                  
                                                                                                                                           
  
     

package testcases.CWE369_Divide_by_Zero.s02;
import testcasesupport.*;

public class CWE369_Divide_by_Zero__float_random_modulo_22b
{
    public void badSink(float data ) throws Throwable
    {
        if (CWE369_Divide_by_Zero__float_random_modulo_22a.badPublicStatic)
        {
            if (data != 0.0f)
            {
                int result = (int)(100.0 % data);
                IO.writeLine(result);
            }
            else
            {
                IO.writeLine("This would result in a divide by zero");
            }
        }
        else
        {
                                                                           
                                                                                           
            data = 0.0f;
        }
    }

                                                                                                         
    

                                                                                                        
    

                                                
    
}

                                   
                                                             
                                                         
                                         
  
  
               
                             
                                                    
                                                                  
                  
                                                                                  
                                                                                
                                                                                         
  
     

package testcases.CWE191_Integer_Underflow.s01;
import testcasesupport.*;

public class CWE191_Integer_Underflow__byte_min_multiply_42 extends AbstractTestCase
{
    private byte badSource() throws Throwable
    {
        byte data;

                                                                   
        data = Byte.MIN_VALUE;

        return data;
    }

    public void bad() throws Throwable
    {
        byte data = badSource();

        if(data < 0)                                       
        {
                                                                                     
            int result = data * 2;
            IO.writeLine("result: " + result);
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

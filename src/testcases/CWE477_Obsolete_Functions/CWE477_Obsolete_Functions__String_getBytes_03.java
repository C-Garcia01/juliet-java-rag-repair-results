                                   
                                                            
                                                          
                                      
  
  
              
                                    
                        
                                                                  
                                                                                        
                                                      
 
    

package testcases.CWE477_Obsolete_Functions;

import testcasesupport.*;

public class CWE477_Obsolete_Functions__String_getBytes_03 extends AbstractTestCase
{
    public void bad() throws Throwable
    {
        if (5 == 5)
        {
            String sentence = "Convert this to bytes";
            byte[] sentenceAsBytes = new byte[sentence.length()];
                                                                                       
            sentence.getBytes(0, sentence.length(), sentenceAsBytes, 0);
            IO.writeLine(IO.toHex(sentenceAsBytes));                          
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

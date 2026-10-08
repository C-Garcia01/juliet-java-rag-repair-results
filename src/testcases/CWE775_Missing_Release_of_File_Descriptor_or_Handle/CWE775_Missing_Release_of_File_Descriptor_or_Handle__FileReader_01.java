  
                                                                                                                                                                              
   
     

package testcases.CWE775_Missing_Release_of_File_Descriptor_or_Handle;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import java.util.logging.Level;

import testcasesupport.AbstractTestCase;
import testcasesupport.IO;

public class CWE775_Missing_Release_of_File_Descriptor_or_Handle__FileReader_01 extends AbstractTestCase 
{    
    public void bad()
    {
        BufferedReader readerBuffered = null;
        FileReader readerFile = null;
        try
        {
            File file = new File("c:\\file.txt");
            readerFile = new FileReader(file);
            readerBuffered = new BufferedReader(readerFile);
            String readString = readerBuffered.readLine();
            
            IO.writeLine(readString);
        }
        catch (IOException exceptIO)
        {
            IO.logger.log(Level.WARNING, "Error with stream reading", exceptIO);
        }
                                                                   
    }
    
    
    
    public void good() throws IOException 
    {
    }

                                                                           
                                                                             
                                                                              
                                                                        
     
    public static void main(String[] args) 
            throws ClassNotFoundException, InstantiationException, IllegalAccessException 
    {
        mainFromParent(args);
    }
}

                                   
                                                                
                                                       
                                         
  
  
              
                          
                                                                                                             
                                
        
                                                       
                                                  
                                                                                                      
 
    

package testcases.CWE643_Xpath_Injection;

import testcasesupport.*;

import javax.servlet.http.*;

import java.util.StringTokenizer;

import javax.xml.xpath.*;

import org.xml.sax.InputSource;

import org.apache.commons.lang.StringEscapeUtils;

public class CWE643_Xpath_Injection__getQueryString_Servlet_06 extends AbstractTestCaseServlet
{
                                                                       
                                                                      
                
    private static final int PRIVATE_STATIC_FINAL_FIVE = 5;

    public void bad(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        String data;
        if (PRIVATE_STATIC_FINAL_FIVE==5)
        {
            data = "";                                                        
                                                                                                          
            {
                StringTokenizer tokenizer = new StringTokenizer(request.getQueryString(), "&");
                while (tokenizer.hasMoreTokens())
                {
                    String token = tokenizer.nextToken();                                    
                    if(token.startsWith("id="))                                           
                    {
                        data = token.substring(3);                        
                        break;                      
                    }
                }
            }
        }
        else
        {
                                                                           
                                                                                           
            data = null;
        }

        if (PRIVATE_STATIC_FINAL_FIVE==5)
        {
            String xmlFile = null;
            if(System.getProperty("os.name").toLowerCase().indexOf("win") >= 0)
            {
                                        
                xmlFile = "\\src\\testcases\\CWE643_Xpath Injection\\CWE643_Xpath_Injection__Helper.xml";
            }
            else
            {
                                            
                xmlFile = "./src/testcases/CWE643_Xpath Injection/CWE643_Xpath_Injection__Helper.xml";
            }
            if (data != null)
            {
                                                         
                String [] tokens = data.split("||");
                if (tokens.length < 2)
                {
                    return;
                }
                String username = tokens[0];
                String password = tokens[1];
                                 
                XPath xPath = XPathFactory.newInstance().newXPath();
                InputSource inputXml = new InputSource(xmlFile);
                                                                                            
                                                                                   
                                                                         
                String query = "//users/user[name/text()='" + username +
                               "' and pass/text()='" + password + "']" +
                               "/secret/text()";
                String secret = (String)xPath.evaluate(query, inputXml, XPathConstants.STRING);
            }
        }
    }

                                                                                                                                
    

                                                                                     
    

                                                                                                                                 
    

                                                                                       
    

    public void good(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
    }

                                                                          
                                                                            
                                                                             
                                                                       
       
    public static void main(String[] args) throws ClassNotFoundException,
           InstantiationException, IllegalAccessException
    {
        mainFromParent(args);
    }
}

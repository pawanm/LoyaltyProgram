import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;
import org.xml.sax.SAXParseException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;

public class XmlParser
{
    public static void convertXmlToKeyValue()
    {
        try
        {
            String stringXmlFileName="/media/New Volume/refs/projects/pwm_android/res/values/strings.xml";
            DocumentBuilderFactory docBuilderFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder docBuilder = docBuilderFactory.newDocumentBuilder();
            Document doc = docBuilder.parse(new File(stringXmlFileName));

            NodeList childNodes = doc.getFirstChild().getChildNodes();

            for (int i = 0; i < childNodes.getLength(); i++)
            {
                Node childNode = childNodes.item(i);
                if (childNode.getNodeType() == Node.ELEMENT_NODE)
                {
                    Element element = (Element) childNode;
                    String key = element.getAttribute("name");
                    String value = element.getTextContent();
                    System.out.println(key + "=" + value);
                }
            }

        } catch (SAXParseException err)
        {
            System.out.println("** Parsing error" + ", line "
                    + err.getLineNumber() + ", uri " + err.getSystemId());
            System.out.println(" " + err.getMessage());

        } catch (SAXException e)
        {
            Exception x = e.getException();
            ((x == null) ? e : x).printStackTrace();

        } catch (Throwable t)
        {
            t.printStackTrace();
        }


    }


}
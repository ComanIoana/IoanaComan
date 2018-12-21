/*
 * Displaying existing data about Users
 */
package xmlasdb;

import java.io.File;
import java.io.IOException;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.DOMException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

/**
 *
 * @author AJC
 */
public class Retrieve {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            File inputFile = new File("E:\\Chiut\\IT\\Java\\Class\\Class\\ClassWork\\src\\xmlasdb\\tableUsers.xml");
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(inputFile);
            doc.getDocumentElement().normalize();
            System.out.println("Root element : " + doc.getDocumentElement().getNodeName());
            NodeList nList = doc.getElementsByTagName("User");
            System.out.println("----------------------------");
            int length = nList.getLength();
            System.out.println("XML number of elements = " + length);
            for (int temp = 0; temp < length; temp++) {
                Node nNode = nList.item(temp);
                System.out.println("\nCurrent Element : " + nNode.getNodeName() + (temp + 1));
                if (nNode.getNodeType() == Node.ELEMENT_NODE) {
                    Element eElement = (Element) nNode;
                    System.out.println("Username : "
                        + eElement.getElementsByTagName("Username")
                                   .item(0)
                                   .getTextContent());
                    System.out.println("Password : "
                        + eElement.getElementsByTagName("Password")
                                   .item(0)
                                   .getTextContent());
                }
            }            
        } catch (ParserConfigurationException | SAXException | IOException | DOMException e) {
            e.printStackTrace();
        }
    }
}

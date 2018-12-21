/*
 * Adding data to Users XML
 */
package xmlasdb;

import java.io.IOException;
import java.util.Scanner;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.xml.sax.SAXException;

/**
 *
 * @author AJC
 */
public class Create {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            Scanner in = new Scanner(System.in);
            DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
            Document document = documentBuilder.parse("E:\\Chiut\\IT\\Java\\Class\\Class\\ClassWork\\src\\xmlasdb\\tableUsers.xml");
            Element root = document.getDocumentElement();
            Element user = document.createElement("User");
            root.appendChild(document.createTextNode("\n"+"\t"));
            root.appendChild(user);
            Element username = document.createElement("Username");
            System.out.println("Username:");
            username.appendChild(document.createTextNode(in.next()));
            user.appendChild(document.createTextNode("\n"+"\t"));
            user.appendChild(username);
            user.appendChild(document.createTextNode("\n"+"\t"));
            Element password = document.createElement("Password");
            System.out.println("Password:");
            password.appendChild(document.createTextNode(in.next()));
            user.appendChild(password);
            user.appendChild(document.createTextNode("\n"+"\t"));
            root.appendChild(document.createTextNode("\n"));
            
            DOMSource source = new DOMSource(document);

            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            StreamResult result = new StreamResult("E:\\Chiut\\IT\\Java\\Class\\Class\\ClassWork\\src\\xmlasdb\\tableUsers.xml");
            transformer.transform(source, result);
        } catch (TransformerException | ParserConfigurationException | SAXException | IOException ex) {
            ex.printStackTrace();
        }

    }

}

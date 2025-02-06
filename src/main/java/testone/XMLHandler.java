package testone;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;

public class XMLHandler {
	   private Document document;
	    private DocumentBuilderFactory factory;
	    private DocumentBuilder builder;

	    // Constructor to initialize the XML parsing objects
	    public XMLHandler(String xmlFilePath) throws Exception {
	        // Initialize the XML parsing objects
	        File xmlFile = new File(xmlFilePath);
	        factory = DocumentBuilderFactory.newInstance();
	        builder = factory.newDocumentBuilder();
	        document = builder.parse(xmlFile); // Parse the XML file and load the document
	    }
	    public static void maintest() {
	        try {
	            // Create an XMLHandler object by passing the XML file path
	            XMLHandler handler = new XMLHandler("path_to_your_file.xml");

	            // Example usage of the method to update a phone number
	           // handler.updatePhoneNumber("business", "123456789");
	            
	            // Optionally save the document to a new file
	           // handler.saveDocument("updated_phone_numbers.xml");
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }


}

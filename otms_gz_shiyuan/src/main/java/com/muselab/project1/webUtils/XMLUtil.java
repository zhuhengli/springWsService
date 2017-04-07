package com.muselab.project1.webUtils;

import java.io.StringWriter;
import java.io.StringReader;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.transform.stream.StreamSource;


@SuppressWarnings(value = { "rawtypes" })
public final  class XMLUtil {
	  private XMLUtil() {

	    }
	  
	  
	  public static <T> JAXBElement<T> unmarshall(Class<T> clazz, String xml) throws JAXBException {
	        JAXBContext jaxb = JAXBContext.newInstance(clazz);
	        Unmarshaller unmarshaller = jaxb.createUnmarshaller();
	        return unmarshaller.unmarshal(new StreamSource(new StringReader(xml)), clazz);
	    }

	    public static String marshall(Object xmlObject, Class clazz) throws JAXBException {
	        JAXBContext jaxb = JAXBContext.newInstance(clazz);
	        Marshaller marshaller = jaxb.createMarshaller();
	        StringWriter writer = new StringWriter();
	        marshaller.marshal(xmlObject, writer);
	        return writer.toString();
	    }
}

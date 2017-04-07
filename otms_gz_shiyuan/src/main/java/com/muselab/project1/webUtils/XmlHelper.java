package com.muselab.project1.webUtils;

import java.io.StringReader;
import java.util.HashMap;
import java.util.Iterator;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import org.xml.sax.InputSource;

public class XmlHelper {
	
	 public static HashMap<String,String> getvalueByXml(String xmlStr){
			
			HashMap<String,String> maplist = new HashMap<String,String>();
			 StringReader read = new StringReader(xmlStr);
	    	 InputSource source = new InputSource(read);
	    	 SAXReader sb = new SAXReader();
	    	 Document doc;
	    	 String reStr = "";
			try {
				 doc = sb.read(source);
				 Element root = doc.getRootElement();
			     for (Iterator iter = root.elementIterator(); iter.hasNext();) {
			    	    Element element = (Element) iter.next(); // 获取标签对象
		                // 获取该标签对象的属性
			    	    maplist.put(element.getName(),element.getTextTrim());
		                // 循环第一层节点，获取其子节点
		                for (Iterator iterInner = element.elementIterator(); iterInner
		                        .hasNext();) {
		                    // 获取标签对象
		                    Element elementOption = (Element) iterInner.next();
		                    maplist.put(elementOption.getName(),elementOption.getTextTrim());
		                    
		                    for (Iterator iterInnerlast = elementOption.elementIterator(); iterInnerlast
			                        .hasNext();) {
			                    // 获取标签对象
			                    Element elementOptionChaild = (Element) iterInnerlast.next();
			                    maplist.put(elementOptionChaild.getName(),elementOptionChaild.getTextTrim());
			                }
		                    
		                }
	             }
		         return maplist;
			} catch (DocumentException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    	
	            return maplist;
		}

}

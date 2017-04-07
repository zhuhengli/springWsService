package com.muselab.project1.domain;


import java.util.List;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
/**
 * 中柱注册特殊费用 模板
 * @author wil.zhu
 *
 */
@XmlRootElement(name = "externalTrackAndTraceRequest")
@XmlType(propOrder = {"operation", "externalOrderQueries","externalOrderException"}) 
public class ZzccTemplate {

	 private  String version;
	
	 private String login;
	 
	 private String passWord;
	 
	 private ExternalOrderException externalOrderException;
	 
	 private List<ExternalOrderQuery>  externalOrderQueries;
	  
     private String operation;
     
    
     
    
     
     public ZzccTemplate(){
    	 super(); 
     }
     public ZzccTemplate(String version,String login,String passWord,String operation){
    	  
          this.version = version;
          this.login = login;
          this.passWord = passWord;
          this.operation = operation;
          
     }
     
    @XmlAttribute(name="version")
    public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}
	@XmlAttribute(name="login")
	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}
	@XmlAttribute(name="password")
	public String getPassWord() {
		return passWord;
	}

	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}

	
	@XmlElement(name = "externalOrderException")
	public ExternalOrderException getExternalOrderException() {
		return externalOrderException;
	}

	public void setExternalOrderException(
			ExternalOrderException externalOrderException) {
		this.externalOrderException = externalOrderException;
	}
	
	 @XmlElementWrapper(name = "externalOrderQueries")  
     @XmlElement(name = "externalOrderQuery")
	public List<ExternalOrderQuery> getExternalOrderQueries() {
		return externalOrderQueries;
	}

	public void setExternalOrderQueries(
			List<ExternalOrderQuery> externalOrderQueries) {
		this.externalOrderQueries = externalOrderQueries;
	}

	
	@XmlElement(name = "operation") 
	public String getOperation() {
		return operation;
	}

	public void setOperation(String operation) {
		this.operation = operation;
	}
	
     
     
     
     
}

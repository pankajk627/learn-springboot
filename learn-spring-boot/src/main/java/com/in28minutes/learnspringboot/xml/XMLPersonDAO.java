package com.in28minutes.learnspringboot.xml;

public class XMLPersonDAO {
	
	XMLJdbcConnection xmlJdbcConnection;

	public XMLJdbcConnection getXMLJdbcConnection() {
		return xmlJdbcConnection;
	}

	public void setXMLJdbcConnection(XMLJdbcConnection jdbcConnection) {
		this.xmlJdbcConnection = jdbcConnection;
	}
		
}
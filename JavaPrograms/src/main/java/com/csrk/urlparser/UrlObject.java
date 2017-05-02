package com.csrk.urlparser;

public class UrlObject {

	private String protocol;
	private String ipAddress;
	private String portNumber;
	private String dnsName;
	private String path;
	
	
	public void setProtocol(String protocol){
		this.protocol=protocol;
	}
	public String getIpAddress() {
		return ipAddress;
	}
	public void setIpAddress(String ipAddress) {
		this.ipAddress = ipAddress;
	}
	public String getPortNumber() {
		return portNumber;
	}
	public void setPortNumber(String portNumber) {
		this.portNumber = portNumber;
	}
	public String getDnsName() {
		return dnsName;
	}
	public void setDnsName(String dnsName) {
		this.dnsName = dnsName;
	}
	public String getPath() {
		return path;
	}
	public void setPath(String path) {
		this.path = path;
	}
	public String getProtocol(){
		return protocol;
	}
}

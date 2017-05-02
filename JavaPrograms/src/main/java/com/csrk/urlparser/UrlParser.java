package com.csrk.urlparser;

import com.csrk.exceptions.NotAValidInputException;

public class UrlParser {

	public UrlObject parseUrl(String url) throws NotAValidInputException {
		String[] urlSplit = url.split("/");

		if (url.isEmpty())
			throw new NotAValidInputException();

		if (urlSplit.length != 4)
			throw new NotAValidInputException();
		if (!urlSplit[0].equalsIgnoreCase("http:"))
			throw new NotAValidInputException();

		UrlObject urlObject = new UrlObject();
		urlObject.setProtocol(urlSplit[0]);
		urlObject.setPath(urlSplit[3]);
      
		String[] urlIp = urlSplit[2].split(":");
		if (urlIp.length == 2){
			urlObject.setIpAddress(urlIp[0]);
		urlObject.setPortNumber(urlIp[1]);
		}else 
		if(urlIp.length==1)
		urlObject.setDnsName(urlIp[0]);
		

		return urlObject;

	}

}

package com.csrk.urlparser;

import com.csrk.exceptions.NotAValidInputException;

public class UrlParserApp {

	public static void main(String[] args) {
		UrlParser urlparser = new UrlParser();
		
		try {
			UrlObject urlObject = urlparser.parseUrl(args[0]);
			System.out.println("The Protocol of URL-->"+urlObject.getProtocol().substring(0, 4));
			
			if(urlObject.getDnsName()!=null && !urlObject.getDnsName().isEmpty()){
			System.out.println("The DNS Name of URL-->"+urlObject.getDnsName());
			}else if(urlObject.getIpAddress()!=null && !urlObject.getIpAddress().isEmpty()){
			System.out.println("The Ip Address of URL-->"+urlObject.getIpAddress());
			System.out.println("The Port Number of URL-->"+urlObject.getPortNumber());
			} System.out.println("The Path of URL-->"+urlObject.getPath());
		} catch (NotAValidInputException e) {
			System.out.println("Please give Valid Input URL");
		} catch (ArrayIndexOutOfBoundsException aioe){
			System.out.println("Please Enter some Input");
		}

	}

}

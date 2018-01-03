package com.phone;

public class OperatingFactor {
	
	public OS getInstance(String str) {
		
		if(str.equals("And")){
			return new Android();
		}
		if(str.equals("Win")){
			return new Windows();
		}
		else{
			//System.out.println( new IOS());
			return new IOS();
		}
			
		
	}

}

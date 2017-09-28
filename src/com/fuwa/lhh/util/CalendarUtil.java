package com.fuwa.lhh.util;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;

import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

public class CalendarUtil {


	
	private static class ToolUtilsHolder {
		private final static CalendarUtil INSTANCE = new CalendarUtil();
	}
	public static CalendarUtil getInstance() {
	   return ToolUtilsHolder.INSTANCE;
	}


	  public XMLGregorianCalendar convertToXMLGregorianCalendar(Date date) {

	        GregorianCalendar cal = new GregorianCalendar();
	        cal.setTime(date);
	        XMLGregorianCalendar gc = null;
	        try {
	            gc = DatatypeFactory.newInstance().newXMLGregorianCalendar(cal);
	        } catch (Exception e) {

	             e.printStackTrace();
	        }
	        return gc;
	    }
	 
	     public  Date convertToDate(XMLGregorianCalendar cal) throws Exception{
	         GregorianCalendar ca = cal.toGregorianCalendar();
	         return ca.getTime();
	     }
	 
	     public static void main(String[] args) throws Exception {
	    	 CalendarUtil dateTest = new CalendarUtil();
	    	 XMLGregorianCalendar d = dateTest.convertToXMLGregorianCalendar(new Date());
	    	 System.out.println(d.getDay());
	    	 XMLGregorianCalendar cal = null;
	    	 cal = DatatypeFactory.newInstance().newXMLGregorianCalendar();
	    	 cal.setMonth(06);
	    	 cal.setYear(2010); 
	    	 Date date = dateTest.convertToDate(d);
	    	 String format = "yyyy-MM-dd HH:mm:ss";
	    	 SimpleDateFormat formatter = new SimpleDateFormat(format);
	    	 System.out.println(formatter.format(date));

	     }

	

}

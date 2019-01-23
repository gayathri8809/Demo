package practice_Java;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Buffer_builder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	      /*StringBuffer sBuffer = new StringBuffer("test");
	      sBuffer.append(" String Buffer");
	      sBuffer.reverse();
	      System.out.println(sBuffer);*/
	      Date d=new Date();
	      System.out.println(d.toString());
	      Calendar cal = Calendar.getInstance();
	      System.out.println(cal.get(Calendar.DAY_OF_WEEK));
	      System.out.println(cal.get(Calendar.HOUR_OF_DAY));
	      System.out.println(cal.get(Calendar.DATE));
	      System.out.println(cal.get(Calendar.AM_PM));
	      
	      
	      try {
	    	 int i=78/0; 
	      }
	      catch(Exception e){
	    	  System.out.println("I catched the exception");
	    	  
	      }
	      SimpleDateFormat today=new SimpleDateFormat("M/d/yyyy");
	      System.out.println(today.format(d));
	}

}

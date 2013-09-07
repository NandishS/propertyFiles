package testClassForProperties;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.Properties;
import java.util.Scanner;




public class testerProperties {

	public static void main(String [] args) throws FileNotFoundException{
		Date d = new Date();
		Properties properties = new Properties();
		//retrieves property file
		File file = new File("C:/Users/Tanes/workspace/testClassForProperties/Files/test1.properties");
		//loads the property file
		FileInputStream fileReader = new FileInputStream(file);
		Calendar cal = Calendar.getInstance();
		d.setMonth(7);
		cal.setTime(d);
		
		String d2 = d.toString();
		System.out.println(d);
		System.out.println(Calendar.MONTH);
		System.out.println(cal.get(Calendar.MONTH) + 1);
		System.out.println(15 >= Integer.parseInt(d2.substring(26, 28)));
		
		
		/*try {
			  //loads fileInputStream
			  //properties.load();
			
			} catch (IOException e) {
				System.out.println("load error");
				e.printStackTrace();
			}
		finally {
			try{
			  //closes the FileInputStream
			  fileReader.close();
			}
			catch(IOException e){
				System.out.println("close error");
				e.printStackTrace();
			}
			}
	    //iterate each key from the properties file
		for(String key : properties.stringPropertyNames()) {
				  //get value from the key
				  String value = properties.getProperty(key);
				  System.out.println(key + " => " + value);
				}
		
		*/
		
	}
}

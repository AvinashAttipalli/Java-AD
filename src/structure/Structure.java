package structure;

import java.util.Date;
import java.util.ArrayList;
import java.util.List;

// we should have only one public class in a source file
public class Structure {

	/*The basic entry point of program execution is main method. but lots of other ways
	of doing it by frameworks like struts etc., */
	
	/* If the method has a static in front of it we don't have to create 
	 * instance of it.
	*/
	
	/* public static void main(String... args) will also work
	*/
	public static void main(String[] args) {
		Date d = new Date();
		System.out.println("today's date is "+d);
		List l = new ArrayList();
		//List l = new java.util.ArrayList();
	}
}
	class OtherClass{
		
	}
	
	interface AnInterfce{
		
	}


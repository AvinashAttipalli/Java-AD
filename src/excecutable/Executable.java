package excecutable;

//We don't see any output when we run from IDE, run it from CMD line  
public class Executable {

	/* To pass the arguments in the IDE goto the run and then run config., 
	 * look for the java application under that look for the 
	 * class name that we are trying to pass arguments
	*/
	public static void main(String[] args) { // Method entry
		System.out.println("Hello World!"); 
		
		for(int i=0;i<args.length;i++) {
			System.out.println("args[" + i + "] is " +args[i]);
		}
		
		System.out.println("No More"); // Method Exist
	}

}

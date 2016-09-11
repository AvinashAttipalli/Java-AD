package structure;

public class ClassStructure {

		public float getTemperature() {
		return temperature;
	}
    public static int getBigNumber() {
    	return A_BIG_NUMBER;
    }
    public static int A_BIG_NUMBER=123456;
    public float temperature;
	
    //constructor have same name as class name.
    public ClassStructure() {
    	temperature=98.4F;
    }
    
    /* AConcept class is in same package, but that not to be abstract.
     * if that is abstract then we can't create an instance to it.
    */
    public void makeOne() {
    	AConcept c = new AConcept();
    }

/* The class not have the public then we can't access outside the package.
    */
   public structure.sub.SecretiveClass sc;
   
   // Inner class(or)nested classes, A class that has another class in it.
   
   class AnInnerClass {
	   public void doStuff(){
		   
	   }
   }
}

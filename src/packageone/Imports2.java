package packageone;

import packageone.subpackage.ClassB;

//import packagetwo.ClassOne;

/* If we use the above import the output always get from 
 * this package so we do it by adding package name to the classname

*/
public class Imports2 {

	public static void main(String[] args) {
		
		ClassOne cOne = new ClassOne();
		System.out.println(cOne.toString());
		
		/* packageone.subpackage is not at all related to the packageone.
		   They both are two different packages.
		*/
		packageone.subpackage.ClassA cA = new packageone.subpackage.ClassA();
		System.out.println(cA.toString());
		
		// to get the below one workable i need to import the package of it
		ClassB cB = new ClassB();
		System.out.println(cA.toString());
		
		
		packagetwo.ClassOne cOneAgain = new packagetwo.ClassOne();
		System.out.println(cOneAgain.toString());
		
	}

}

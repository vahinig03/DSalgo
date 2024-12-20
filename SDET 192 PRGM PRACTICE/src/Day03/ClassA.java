package Day03;

public class ClassA {
	
   public int varA=100;
     
    public void methodA() {
    	 System.out.println("I am a method A");
     }
    
    //4 diffrent access modifiers//
    //public : we can access any where(variables and methods any where)//
    //private : we can access only inside the same class(we can access someone AorBorC it will showing the error so this is not visible) //
    //if we write the private 
    //default{blank} : we can access only inside the same package//
    //protected : we can access outside the package by subclass//
    
    
	public static void main(String[] args) {
	ClassA obj = new ClassA();
	System.out.println("value of var A is"+obj.varA);
	obj.methodA();

	}

}

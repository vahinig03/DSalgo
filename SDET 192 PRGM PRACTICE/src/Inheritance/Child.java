package Inheritance;

public class Child extends Parent {//child class  dont have variables and method it access to parent class variables and methods through object//
	//child has create they own object and can access parent variables and methods//
	
	int parentvar=4500;

	public static void main(String[] args) {
		Child Cobj = new Child();
		
		System.out.println("parent variable is :"+Cobj.parentvar);
		Cobj.parentmethod();
		
		System.out.println("grandparent variable is :"+Cobj.grandparentvar);
		Cobj.grandparentmethod();

	}

}

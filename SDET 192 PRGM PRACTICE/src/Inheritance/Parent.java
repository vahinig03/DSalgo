package Inheritance;

public class Parent extends GrandParent {
	int parentvar=1200;
	
	public void parentmethod() {
	System.out.println("I am a parent")	;
	}

	public static void main(String[] args) {
		Parent parobj = new Parent();
		System.out.println("parent variable is :"+parobj.parentvar);
		parobj.parentmethod();
		

	}

}

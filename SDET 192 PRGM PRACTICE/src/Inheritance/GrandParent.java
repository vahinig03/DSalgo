package Inheritance;

public class GrandParent {
	
	int grandparentvar=3400;
	
	public void grandparentmethod() {
		System.out.println("I am a grandparent")	;
		}

		public static void main(String[] args) {
			GrandParent gpobj = new GrandParent();
			System.out.println("grandparent variable is :"+gpobj.grandparentvar);
			gpobj.grandparentmethod();

		

	}

}

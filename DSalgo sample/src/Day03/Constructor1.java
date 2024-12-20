package Day03;

public class Constructor1 {
	//global variables//
	float m1;
	float m2;
	float m3;
	float m4;
	float sum;
	
	//1.class name and constructor name should be same//
	//2.constructor is always public(before the constructor name always will give public)//
	//3.constructor will not have any return type(void)[ we don't want to give public void constructor,only to give public constructor]//
	//4.constructor is a method to assign the values to global variables//
	
	public Constructor1(float mar1,float mar2,float mar3,float mar4)
	{
	 m1=mar1;
	 m2=mar2;
	 m3=mar3;
	 m4=mar4;
	}	
	
	public void sum() {
	sum = m1+m2+m3+m4;
	System.out.println("sum of the student marks:"+sum);
	}
	
	public static void main(String[] args) {
	Constructor1 con = new Constructor1(78,89,56,88);//object creation[to receiving the input at the time of object creating to assign the global varables//
	 con.sum();
	 Constructor1 con2 = new Constructor1(100,100,100,55);
	 con2.sum();
	}

}




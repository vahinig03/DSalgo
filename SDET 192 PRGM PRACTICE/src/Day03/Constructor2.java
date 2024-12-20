package Day03;

public class Constructor2 {
	float m1;
	float m2;
	float m3;
	float m4;
	float sum;
	
	//5.constructor can be zero or one or more constructor in a class//
	
	//assume its a pandemic scenario//
	//student are not mandated to come to school//
	//students can optionally attend there exam//
	//if a student attend there exam then actual marks will be given//
	//if a student did not attend there exam the deafult marks will be given(35)//
	
	
	public Constructor2(float mar1,float mar2,float mar3,float mar4)
	{
	 m1=mar1;
	 m2=mar2;
	 m3=mar3;
	 m4=mar4;
	}
	public Constructor2(float mar1,float mar2,float mar3)
	{
	 m1=mar1;
	 m2=mar2;
	 m3=mar3;
	 m4=35;
	}
	public Constructor2(float mar1,float mar2)//students will attend 2 exams//
	{
	 m1=mar1;
	 m2=mar2;
	 m3=35;
	 m4=35;
	}
	public Constructor2(float mar1)//students will attend only one exam,3 exams are given default marks//
	{
	 m1=mar1;
	 m2=35;
	 m3=35;
	 m4=35;
	}
    public Constructor2()//students not attend the exams default marks will given////
	{
	 m1=35;
	 m2=35;
	 m3=35;
	 m4=35;
	}
    public void sum() {
    	sum = m1+m2+m3+m4;
    	System.out.println("sum of the student marks:"+sum);
    	}
    
	public static void main(String[] args) {
			Constructor2 con = new Constructor2(78,89,56,88);//object creation[to receiving the input at the time of object creating to assign the global varables//
			 con.sum();
			 Constructor2 con2 = new Constructor2(100,100,100);
			 con2.sum();
			 Constructor2 con3 = new Constructor2(78,89);//object creation[to receiving the input at the time of object creating to assign the global varables//
			 con3.sum();
			 Constructor2 con4 = new Constructor2();
			 con4.sum();
			 
	}

}

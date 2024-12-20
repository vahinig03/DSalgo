package Day04;

import java.util.Scanner;

public class StudentConstructer2 {
 
		public int mark1,mark2,mark3,mark4,sum;
		public String name;
		double average;
		
		StudentConstructer2(int m1,int m2,int m3,int m4){//constructor//
			mark1=m1;
			mark2=m2;
			mark3=m3;
			mark4=m4;
		}
		
		StudentConstructer2(int m1,int m2,int m3){//constructor//
			mark1=m1;
			mark2=m2;
			mark3=m3;
			mark4=35;
		}
		public void sum() {//method//
			sum=mark1+mark2+mark3+mark4;
			System.out.println("sum of the student marks:"+sum);
			}
		
		public void average() {//method//
			average=sum/4;
			System.out.println("sum of the average marks:"+average);

		}
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in); //using scanner//
		StudentConstructer2 con = new StudentConstructer2(100,100,100,100);
	            con.sum();
	            con.average();
	            
	            StudentConstructer2 con2 = new StudentConstructer2(100,100,100);
	            con2.sum();
	            con2.average();
	            
	
sc.close();
}
}
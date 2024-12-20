package Day02;

import java.util.Scanner;


public class MonthlySalary1 {
	
	 int basicpay;
	 int bof;
	 int bonus;
	 double mg,yg,yt,mt;
	 double pf;
	  double taxRate;
       double mths;
       
      public void mg() {
    	   mg=(basicpay+bof+bonus)-pf;
    	   System.out.println("monthly grass salary:"+mg);  
       }
      public void yg() {
    	  yg=mg*12;
    	  System.out.println("yearly grass salary:"+yg);
    		  
      }
       
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	
		
		System.out.println("Employee basicpay");
		int basicpay = sc.nextInt();
		
		System.out.println("bof");
		int bof = sc.nextInt();
		
		System.out.println("bonus");
		int bonus = sc.nextInt();
		
		 double pf = basicpay*0.12; 
		double mg = (basicpay+bof+bonus)-pf;
		//System.out.println("monthly grass salary:");//
		double yg = mg*12;
	// System.out.println("yearly grass salary:");//
	
		
		double taxRate;
		
		if(yg<=250000) {
			taxRate=0.0;
		}
		else  if(yg<=500000) {
		 taxRate=0.05;
	 }
	 else if(yg<=750000) {
		 taxRate=0.10;
	 }
	 else if(yg<=1000000) {
		 taxRate=0.15;
	 }
	 else if(yg<=1250000) {
		 taxRate=0.20;
	 }
	 else if(yg<=1500000) {
		 taxRate=0.25;
	 }
	 else {	taxRate=0.30;
	 }
		
		double yt = yg*taxRate;
		double mt = yt/12;
		double mths = mg-mt;
		
		System.out.println("monthly grass salary:"+ mg);
		 System.out.println("yearly grass salary:"+ yg);
		System.out.println("yearly tax:"+ yt);
		System.out.println("monthly tax:"+ mt);
		System.out.println("monthly-take-home-salary:"+ mths);
		
		
		sc.close();
			
		}
		
}
		
		
		
		




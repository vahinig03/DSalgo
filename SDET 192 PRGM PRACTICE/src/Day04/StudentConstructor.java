package Day04;

import java.util.Scanner;

public class StudentConstructor {
	public int mark1,mark2,mark3,sum;
	public String name;
	double average;
	
	StudentConstructor(){//constructor//
		mark1=0;
		mark2=0;
		mark3=0;
		
	}
	double sum() {
		double sum=mark1+mark2+mark3;
		return sum;
	}
	
	double Average() {
	double Average=(mark1+mark2+mark3)/3;
	 return Average;
		
	}
	public  String name() {//method//
		name = "ABC";
		return name;
		
	}

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	StudentConstructor sc1 = new StudentConstructor();//object creating//
	
	System.out.println("Studentconstructor mark1:");
	sc1.mark1 = sc.nextInt();
	
	System.out.println("Studentconstructor mark2:");
	sc1.mark2 = sc.nextInt();

	System.out.println("Studentconstructor mark3:");
	sc1.mark3= sc.nextInt();
	

	System.out.println("name:"+sc1.name());
	System.out.println("Studentconstructor sum:"+sc1.sum());
	System.out.println("Studentconstructer Averagemarks:"+sc1.Average());
	sc.close();
	}
	
	}



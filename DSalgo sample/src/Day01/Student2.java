package Day01;


	import java.util.Scanner;

	public class Student2 {  //student class//
		int math;
		int english;
		int science;//student variables//
		int social;
		int totalmarks;
		int average;
		
		public void totalmarks() {  //method creating//
			totalmarks=math+english+science+social; //business logic//
			System.out.println("totalmarks of all subjects"+totalmarks);
		}
		public void average() {  //2.method creating//
			average=totalmarks/4;
			System.out.println("average of totalmarks"+average);
		}

		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in); //using scanner//
			System.out.println("Enter marks of math:");
			int math=sc.nextInt();
			
			System.out.println("Enter marks of english:");
			int english=sc.nextInt();
			
			System.out.println("Enter marks of science:");
			int science=sc.nextInt();
			
			System.out.println("Enter marks of social:");
			int social=sc.nextInt();
			
			int totalmarks=math+english+science+social;
			System.out.println("totalmarks of all subjects:"+totalmarks);
			int average=(totalmarks/4);
			
			System.out.println("student averagemarks:"+average);
			sc.close();
}
}
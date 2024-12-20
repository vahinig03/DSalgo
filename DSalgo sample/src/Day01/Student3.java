package Day01;


	import java.util.Scanner;

	public class Student3 {

		public static void main(String[] args) {
			Scanner scanner=new Scanner(System.in);
			
			System.out.println("Enter marks for subject1:");
			double subject1=scanner.nextDouble();
			
			
			System.out.println("Enter marks for subject2:");
			double subject2=scanner.nextDouble();
			
			
			System.out.println("Enter marks for subject3:");
			double subject3=scanner.nextDouble();
			
			
		System.out.println("Enter marks for subject4:");
		double subject4=scanner.nextDouble();
		
		double totalmarks=subject1+subject2+subject3+subject4;
		System.out.println("totalmarks of all subjects:"+totalmarks);
		double average=(totalmarks/400)*100;
		
		System.out.println("average:"+average);
		scanner.close();
		}
}

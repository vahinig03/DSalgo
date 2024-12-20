package Day02;


	import java.util.Scanner;

	public class MonthlySalary2 {

		public static void main(String[] args) {
		
			 Scanner scanner = new Scanner(System.in);
			 
			 System.out.println("Employe basicpay");
				double basicpay = scanner.nextDouble();
				
				System.out.println("bof");
				double bof = scanner.nextDouble();
				
				System.out.println("bonus");
				double bonus = scanner.nextDouble();
				
				 double pf = basicpay*0.12; 
			
				double monthlyGross = (basicpay+bof+bonus)-pf;
		        System.out.print("Enter your monthlyGross salary: ");
		       double yearlyGross = monthlyGross * 12;
		       System.out.println("Enter your yearlyGross salary: ");

		        double taxRate;
		        
		        if (yearlyGross <= 250000) {
		            taxRate = 0.05;
		        } else if (yearlyGross <= 500000) {
		           taxRate = 0.10;
		        } else if (yearlyGross <= 750000) {
		            taxRate = 0.15;
		        }
		        else if (yearlyGross <= 1000000) {
		        	taxRate = 0.20;
		        }
		        else if (yearlyGross <= 1250000) {
		        	taxRate = 0.25;
		        }
		        else {
		        	taxRate = 0.30;
		        }

		        double yearlyTax = yearlyGross * taxRate;
		        double monthlyTax = yearlyTax / 12;
		        double monthlyTakeHomeSalary = monthlyGross-monthlyTax;

		        System.out.println("Monthly Gross: " + monthlyGross);
		        System.out.println("Yearly Gross: " + yearlyGross);
		        System.out.println("Monthly Tax: " + monthlyTax);
		        System.out.println("Yearly Tax: " + yearlyTax);
		        System.out.println("monthly Take Home Salary:"+monthlyTakeHomeSalary);

		        scanner.close();
		}

	}



package Day02;
import java.util.Scanner;

public class MonthlySalary3 {

	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

        // Inputs
        System.out.print("Enter Basic Pay: ");
        double basic = scan.nextDouble();
        
        System.out.print("Enter BOA: ");
        double boa = scan.nextDouble();
        
        System.out.print("Enter Bonus: ");
        double bonus = scan.nextDouble();

        // Calculate PF contribution
        double pf = basic * 0.12;

        // Calculate Monthly Gross Salary
        double monthlyGross = basic + boa + bonus - pf;

        // Calculate Yearly Gross Salary
        double yearlyGross = monthlyGross * 12;

        // Determine Tax Rate
        double taxRate;
        if (yearlyGross <= 250000) {
            taxRate = 0.0;
        } else if (yearlyGross <= 500000) {
            taxRate = 0.05;
        } else if (yearlyGross <= 750000) {
            taxRate = 0.10;
        } else if (yearlyGross <= 1000000) {
            taxRate = 0.15;
        } else if (yearlyGross <= 1250000) {
            taxRate = 0.20;
        } else if (yearlyGross <= 1500000) {
            taxRate = 0.25;
        } else {
            taxRate = 0.30;
        }

        // Calculate Yearly and Monthly Tax
        double yearlyTax = yearlyGross * taxRate;
        double monthlyTax = yearlyTax / 12;

        // Calculate Monthly Take-Home Salary
        double monthlyTakeHome = monthlyGross - monthlyTax;

        // Output results
        System.out.printf("Monthly Gross Salary: %.2f%n", monthlyGross);
        System.out.printf("Yearly Gross Salary: %.2f%n", yearlyGross);
        System.out.printf("Yearly Tax: %.2f%n", yearlyTax);
        System.out.printf("Monthly Tax: %.2f%n", monthlyTax);
        System.out.printf("Monthly Take-Home Salary: %.2f%n", monthlyTakeHome);
	}

}


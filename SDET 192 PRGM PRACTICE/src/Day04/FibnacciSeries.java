package Day04;

public class FibnacciSeries {

	public static void main(String[] args) {
	int n = 10; 
	int firstTerm = 0;
	int secondTerm = 1;
    System.out.println("Fibonacci Series till " + n + " terms:");

    for (int i = 1; i <= n; i++) {
      System.out.print(firstTerm + ", ");

      // compute the next term
      int nextTerm = firstTerm + secondTerm;
      firstTerm = secondTerm;
      secondTerm = nextTerm;

    }
	}
}


		
	
	/*static int fibo(int num){
	      int first = 0, second = 1, temp;
	      if (num == 0)
	      return first;
	      if (num == 1)
	      return second;
	      for (int i = 2; i <= num; i++){
	         temp = first + second;
	         first = second;
	         second = temp;
	      }  
	      return second;
	   }
	   public static void main(String args[]){
	      int num = 9;
	      System.out.print("The 9th fibonacci number is : ");
	      System.out.println(fibo(num));

		
		}
	}*/





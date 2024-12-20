package Day05;

import java.util.ArrayList;

public class Student_ArrayList {
	float sum;
	
	void arryListExample() {
		//1.how to create an empty collection
		//2.how to add data to the collection
		//3.how to retrieve the data from the collection
		
		 ArrayList<Float> marks = new ArrayList<>();//object creating//marks is an empty collection,we can add any number of data//
                 marks.add(56.7f);  //index 0
                  marks.add(88.3f);   //index1
                 marks.add(98.2f);
                 marks.add(76.2f);
                 marks.add(66.1f);  //index 4
                 
                 calculatesum(marks);
	}
	  void calculatesum(ArrayList<Float>marks) {
		for  (int index=0; index<marks.size(); index++) { //we can use arraylist use this position index because array start from index//
			float mark = marks.get(index);
			 sum = sum+mark;
		}
            System.out.println("sum of mark scored by student is :"+sum);
	  }
	public static void main(String[] args) {
		Student_ArrayList obj = new Student_ArrayList();
		obj.arryListExample();
	}
}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/* // Create an ArrayList of Strings
        ArrayList<String> names = new ArrayList<>();

        // Add elements to the list
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");

        // Access an element
        System.out.println(names.get(1)); // Output

        // Remove an element
        names.remove("Alice");

        // Iterate through the list
        for (String name : names) {
            System.out.println(name);*/
	

package Day05;

import java.util.ArrayList;

public class Student3_ArrayList {
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
                 marks.add(55.2f);
                 marks.add(77.2f);
                 
                 System.out.println(marks);//stored data in backend//
                 calculatesum(marks);
	}
	  void calculatesum(ArrayList<Float>marks) {
		  for(float mark : marks) {//this for eachloop  retrieving the any type of data collection//
			  sum = sum+mark;
		  }
	  }

	public static void main(String[] args) {
		

	}

}

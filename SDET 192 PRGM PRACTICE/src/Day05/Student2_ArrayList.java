package Day05;

import java.util.ArrayList;

public class Student2_ArrayList {
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
		for  (int index=0; index<marks.size(); index++) { //we can use arraylist use this position index because array start from index//
			float mark = marks.get(index);                //retrieveing data for index position use this for loop//
			 sum = sum+mark;
		}
            System.out.println("sum of mark scored by student is :"+sum);
	  }
	public static void main(String[] args) {
	
		Student2_ArrayList obj = new Student2_ArrayList();
		obj.arryListExample();
	}

}

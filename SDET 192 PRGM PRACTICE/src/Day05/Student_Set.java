package Day05;

import java.util.HashSet;

public class Student_Set {
	
	void setExample() {
		HashSet<String> names = new HashSet<>();//this is how create an empty collection//
		// how to  add data to the collection
		names.add("vijaya");
		names.add("haritha");
		names.add("kavitha");
		names.add("java");
		names.add("selenium");
		names.add("java");
		//stored the data in backend//
		System.out.println(names);
		
				//how to retriving data from the collection// 
		for(String name : names) {
			System.out.println("name of the student is:"+name);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student_Set obj = new Student_Set();
		obj.setExample();
	}

}  //hash set is stored randaomly and not allowed to duplicates//

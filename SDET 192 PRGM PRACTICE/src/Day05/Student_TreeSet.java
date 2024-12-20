package Day05;


import java.util.TreeSet;

public class Student_TreeSet {


		
		void setExample() {
			TreeSet<String> names = new TreeSet <>();//this is how create an empty collection//
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
			Student_TreeSet obj = new Student_TreeSet();
			obj.setExample(); 
			

		}

	}




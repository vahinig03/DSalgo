package Day05;

  
import java.util.HashMap;
import java.util.Map.Entry;

public class Student_HashMap {

        void hashmapExamples() {
		 HashMap<Integer,String> namesList = new HashMap<>();
		 
		 namesList.put(1001,"vijaya");
			namesList.put(10002,"haritha");
			namesList.put(10003,"kavitha");
			namesList.put(10004,"java");
			namesList.put(10005,"selenium");
			namesList.put(10003,"java");
			
			System.out.println(namesList);
			System.out.println(namesList.entrySet());//this is entry set
			
			for(Entry<Integer, String> student : namesList.entrySet()) {
				System.out.println("roll no:"+student.getKey()); 
				System.out.println("names:"+student.getValue());
			}
	 }
	
	
	

	public static void main(String[] args) {
		Student_HashMap obj = new Student_HashMap();
		obj.hashmapExamples();

	}

}//hashmap//
//key=value//
//stored randomly//
//duplicate values are allowed(it means names are allowed)//
//duplicate keys are naot allowed(it means numbers)//
//it is pair of data//
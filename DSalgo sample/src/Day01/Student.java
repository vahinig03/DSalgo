package Day01;

public class Student {

			String studentname;
			int math;
			int english;
			int science;
			int social;
			int totalmarks;
			double average;
			
			public void totalmarks() {
				totalmarks=math+english+science+social;
				System.out.println(studentname+ "totalmarks of all subjects:"+totalmarks);
			}
			public void average() {
				average=totalmarks/4;
				System.out.println(studentname+ "average of totalmarks:"+average);
			}

			public static void main(String[] args) {
				Student stu1=new Student();
				stu1.studentname="Uma";
				stu1.math=60;
				stu1.english=70;
				stu1.science=50;
				stu1.social=75;
				stu1.totalmarks();
				stu1.average();
				
						
				Student stu2=new Student();
				stu2.studentname="Nikki";
				stu2.math=65;
				stu2.english=75;
				stu2.science=55;
				stu2.social=70;
				stu2.totalmarks();
				stu2.average();

				Student stu3=new Student();
				stu3.studentname="Pinky";
				stu3.math=68;
				stu3.english=75;
				stu3.science=80;
				stu3.social=90;
				stu3.totalmarks();
				stu3.average();
				
				
				Student stu4=new Student();
				stu4.studentname="Dan";
				stu4.math=65;
				stu4.english=75;
				stu4.science=55;
				stu4.social=70;
				stu4.totalmarks();
				stu4.average();
	}

}

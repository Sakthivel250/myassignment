package week1.day1;

public class Student {
 private void classreport() {
	String Name="Sakthivel";
	int rollnum=0064;
	String collegename="AAMEC";
	int mark=6;
	float cgpa=6.29f;
	System.out.println("Student Name="+Name);
	System.out.println("Roll Number="+rollnum);
	System.out.println("College Name="+collegename);
	System.out.println("Mark="+mark);
	System.out.println("CGPA"+cgpa);
}
public static void main(String[] args) {
	Student power=new Student();
	power.classreport();
	
}
}

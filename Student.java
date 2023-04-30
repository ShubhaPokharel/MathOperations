import java.util.Scanner;
class Student{
	public static void main(String[] args){
	Scanner s = new Scanner(System.in);
	System.out.println("Enter your Student name:  ");
	String sname = s.nextLine();

	System.out.println("Enter Student Science marks:  ");
	float sScienceMarks = s.nextFloat();

System.out.println("Enter Student Social Studies marks:  ");
	float sSocialMarks = s.nextFloat();

System.out.println("Enter Student Math marks:  ");
	float sMathMarks = s.nextFloat();

	float totalMarks = sScienceMarks + sSocialMarks + sMathMarks;

	System.out.println("Students name: "+ sname);
	System.out.println("Students Science Marks : "+ sScienceMarks);
	System.out.println("Students Social Marks: "+ sSocialMarks);
	System.out.println("Students Math Marks: "+ sMathMarks);
	System.out.println("Total Marks : " + totalMarks);

	System.out.println("Averge Marks:  " +totalMarks/3 ); 

	s.close();
	}
}
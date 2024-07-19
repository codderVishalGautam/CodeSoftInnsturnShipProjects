package Student;

import java.text.DecimalFormat;
import java.util.Scanner;

public class StudGradeCalc {

	
	public float calcTotalMarks(int num_Sub) {
		
		int totalMarks = 0;
		try {
			Scanner sc = new Scanner(System.in);
			float inputSub[] = new float[num_Sub];
			System.out.println("Enter Marks Obtained in " + num_Sub + " Subjects = ");
			for (int i = 0; i < num_Sub; i++) {
				inputSub[i] = sc.nextFloat();
				totalMarks += inputSub[i];
			}

		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return totalMarks;
	}
	
	public float calcAvgPercentage() {
		float avgPercentage=1;
		try {
	    	float totalMarks=1;
	    	int out_Of_Marks=1;
	    	Scanner sc = new Scanner(System.in);
			System.out.println("Enter Total Number of Subjects =  ");
			int num_Sub = sc.nextInt();
			out_Of_Marks = num_Sub*100;
			totalMarks = calcTotalMarks(num_Sub);
			avgPercentage = ((totalMarks*100)/out_Of_Marks);
			System.out.println("Your Total Marks = "+totalMarks);

		} catch (Exception e) {
			e.printStackTrace();
		}
		return avgPercentage;
	}
	
	public char calculateGrade(float marks) {
		if (marks >= 90) {
			return 'A';
		} else if (marks >= 80) {
			return 'B';
		} else if (marks >= 70) {
			return 'C';
		} else if (marks >= 60) {
			return 'D';
		} else {
			return 'F';
		}
	}
		
	public static void main(String[] args) {
		StudGradeCalc studGradeCalc = new StudGradeCalc();
	    final DecimalFormat decfor = new DecimalFormat("0.00"); 
		float result=studGradeCalc.calcAvgPercentage();
		System.out.println("Your Average Percentage = " + decfor.format(result)+"%");
		char grade = studGradeCalc.calculateGrade(result);
		System.out.println("Your Grade = " +grade);
	}

}

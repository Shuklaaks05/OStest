package cdac_OS_Exam;
import java.util.Scanner;

	public class MarksDistribution {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Input: Marks obtained
	        System.out.print("Enter marks obtained (0-100): ");
	        int marks = scanner.nextInt();

	        // Validate input
	        if (marks < 0 || marks > 100) {
	            System.out.println("Invalid marks! Please enter a value between 0 and 100.");
	            return;
	        }

	        // Determine grade
	        String grade;
	        if (marks >= 90) {
	            grade = "EXCELLENT";
	            } else if (marks >= 80) {
	            grade = "GOOD";
	        } else if (marks >= 70) {
	            grade = "GOOD";
	        } else if (marks >= 60) {
	            grade = "GOOD";
	        
	        } else {
	            grade = "FAIL"; // Fail
	        }

	        // Output: Marks and grade
	        System.out.println("Marks obtained: " + marks);
	        System.out.println("Grade: " + grade);

	        // Suggestion based on grade
	        if (grade == "FAIL") {
	            System.out.println("Suggestion: Need to work harder to pass.");
	        } else {
	            System.out.println("Good job! Keep up the hard work.");
	        }

	        scanner.close();
	    }
	}


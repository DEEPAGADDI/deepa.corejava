package selectionstatement;
import java.util.Scanner;
public class SwitchGradeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

					Scanner scanner=new Scanner(System.in);
			        System.out.print("Enter your numeric score: ");
			        double score = scanner.nextDouble();

			        char grade;

			        // Use a switch-case statement to determine the grade
			        switch ( (int)score) {
			            case 10:
			            case 9:
			                grade = 'A';
			                break;
			            case 8:
			                grade = 'B';
			                break;
			            case 7:
			                grade = 'C';
			                break;
			            case 6:
			                grade = 'D';
			                break;
			            default:
			                grade = 'F';
			        }

			        System.out.println("Your grade is: " + grade);
			    }
			
	}
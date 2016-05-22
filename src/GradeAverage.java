import java.util.*;

public class GradeAverage {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		String val;
		int count;
		float gradeval, sum = 0;
		System.out.println("Program to print grade average.");
		System.out.println("Enter the number of grades:");
		val = scanner.nextLine();
		count = Integer.parseInt(val);
		for (int i = 1; i <= count; i++) {
			System.out.println("Enter the grade " + i + ":");
			val = scanner.nextLine();
			gradeval = Float.parseFloat(val);
			sum = sum + gradeval;
		}
		System.out.println("the average of grades is : " + (sum / count));
	}

}

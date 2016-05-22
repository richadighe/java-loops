
public class PrintEvenNumbers {
	public static void main(String[] args) {
		System.out.println("program to print even numbers. " + "\n List of even numbers from 1 to 100 are ");
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0)
				System.out.println(i);
		}
	}

}

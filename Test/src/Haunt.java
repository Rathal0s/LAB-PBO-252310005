import java.util.Scanner;

public class Haunt {

	public static void main(String[] args) {
	System.out.println("Masukan Celsius: ");
	Celsius cels = new Celsius();
	Scanner scanner = new Scanner(System.in);
	cels.C = scanner.nextInt();
	
	
	System.out.println("Fahrenheit:" + cels.ConF());
	}

}

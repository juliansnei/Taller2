import java.util.Scanner;
public class Ejercicio2 {
	public static void main(String[] ar) {
		Scanner scanner = new Scanner(System.in);
		int edad;
		System.out.print("Ingresa tu edad: ");
		edad = scanner.nextInt();
		scanner.close();
		if(edad > 18) {
			System.out.println("Eres mayor de edad");
		} else {
			System.out.print("Eres menor de edad");
		}
	}

}

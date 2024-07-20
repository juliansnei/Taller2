import java.util.Scanner;
public class Ejercicio1 {
	public static void main(String[] ar) {
		Scanner entry = new Scanner(System.in);
		int num1, num2, option;
		System.out.println("Escoja alguna de las siguientes opciones (solo ponga el número correspondiente): 1. Sumar, 2. Restar, 3. Multiplicar, 4.Dividir ");
		option = entry.nextInt();
		System.out.print("Ingrese el primer número: ");
		num1 = entry.nextInt();
		System.out.print("Ingrese el segundo número: ");
		num2 = entry.nextInt();
		entry.close();
		if(option == 1) {
			int sum = num1 + num2;
			System.out.print("EL resultado de la suma es: " + sum);
		} else if(option ==2) {
			int diference = num1 - num2;
			System.out.println("EL resultado de la resta es: " + diference);
		} else if(option ==3) {
			int product = num1 * num2;
			System.out.println("EL resultado de la multiplicación es: " + product);
		} else if(option ==4) {
			int div = num1 / num2;
			System.out.println("El resultado de la división es: " + div);
		}
	}
}

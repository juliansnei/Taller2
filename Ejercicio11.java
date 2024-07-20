import java.util.Scanner;
public class Ejercicio11 {
	public static void main(String[] arg) {
		Scanner entry = new Scanner(System.in);
		int num1,num2,num3;
		System.out.print("Ingresar el primer número: ");
		num1 = entry.nextInt();
		System.out.print("Ingresar el segundo número: ");
		num2 = entry.nextInt();
		System.out.print("Ingresar el tercer número: ");
		num3 = entry.nextInt();
		entry.close();
		if(num1 < num2) {
			if(num1 < num3) {
				if(num2 < num3) {
					System.out.print("Números ordenados de menor a mayor: " + num1 + num2 + num3);
				} else {
					System.out.print("Números ordenados de menor a mayor: " + num1 + num3 + num2);
				}
			} else {
				System.out.print("Números ordenados de menor a mayor: " + num3 + num1 + num2);
			}
		} else if(num2 < num3) {
			if(num1 < num3) {
				System.out.print("Números ordenados de menor a mayor: " + num2 + num1 + num3);
			} else {
				System.out.print("Números ordenados de menor a mayor: " + num2 + num3 + num1);
			}
		} else {
			System.out.print("Números ordenados de menor a mayor: " + num3 + num2 + num1);
		}	
	}

}

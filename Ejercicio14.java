import java.util.Scanner;
public class Ejercicio14 {
	public static void main(String[] arg) {
		Scanner entry = new Scanner(System.in);
		byte option;
		float temp;
		System.out.print("Ingresa el número 1 si quieres transformar de Celsius a Farenheit, ó el número 2 si quieres transformar de Farenheit a Celsius: ");
		option = entry.nextByte();
		if(option == 1) {
			System.out.print("Ingresa la temperatura en Celsius: ");
			temp = entry.nextInt();
			System.out.print("La temperatura: " + temp + " Celsius equivale a " + (temp*9/5+32) + " Farenheit");
		} else if (option ==2) {
			System.out.print("Ingresa la temperatura en Farenheit: ");
			temp = entry.nextInt();
			System.out.print("La temperatura: " + temp + " Farenheit equivale a " + (temp-32)*5/9 + " Celsius");
		} else {
			System.out.print("No existe esa opción");
		}
		entry.close();
	}

}

import java.util.Scanner;
public class Ejercicio5 {
	public static void main(String[] ar) {
		Scanner entry = new Scanner(System.in);
		int num; 
		String evenOrOdd;
		System.out.print("Ingresa un número cualquiera: ");
		num = entry.nextInt();
		entry.close();
		if(num%2 == 0) {
			evenOrOdd = " es Par";
		} else {
			evenOrOdd = " es Impar";
		}
		
		if(num>0) {
			System.out.print("EL número que ingresaste es positivo y" + evenOrOdd);
		} else if(num<0) {
			System.out.print("EL número que ingresaste es negativo y" + evenOrOdd);
		} else {
			System.out.print("EL número que ingresaste es cero y" + evenOrOdd);
		}
	}

}

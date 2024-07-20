import java.util.Scanner;
public class Ejercicio9 {
	public static void main(String[] ar) {
		Scanner entry = new Scanner(System.in);
		int year;
		System.out.print("Ingresa el año que quieras determinar si es bisiesto o no: ");
		year = entry.nextInt();
		entry.close();
		if(year%4 == 0) {
			if(year%100 == 0) {
				if(year%400 == 0) {
					System.out.print("El año " + year + " es bisiesto");
				} else {
					System.out.print("El año "+ year + " no es bisiesto");
				}
			} else {
				System.out.print("El año " + year + " es bisiesto");
			}
		} else {
			System.out.print("El año "+ year + " no es bisiesto");
		}
	}

}

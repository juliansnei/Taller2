import java.time.LocalDate;
import java.util.Scanner;

public class Ejercicio19 {
	public static void main(String[] arg) {
		Scanner scanner = new Scanner(System.in);
		int año, mes, dia, year, day, age;
		System.out.println("Ingrese tu año de nacimiento:");
		año = scanner.nextInt();
		System.out.println("Ingresa tu dia de nacimiento:");
		dia = scanner.nextInt();
		System.out.println("Ingrese el número del mes de nacimiento:");
		mes = scanner.nextInt();
		scanner.close();
		LocalDate currentDate = LocalDate.now();
		day = currentDate.getDayOfMonth();
		year = currentDate.getYear();
		age = year - año - 1;
		if(mes < currentDate.getMonthValue()) {
			age++;
		} else if(mes == currentDate.getMonthValue()) {
			if(dia <= day) {
				age++;
			}
		}
		System.out.println(age);
	}
}

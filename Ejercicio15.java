import java.util.Scanner;
public class Ejercicio15 {
	public static void main(String[] arg) {
		Scanner entry = new Scanner(System.in);
		int grade;
		System.out.print("Ingrese su nota en el examen: ");
		grade = entry.nextInt();
		entry.close();
		if(grade >=90 && grade <= 100) {
			System.out.print("A");
		} else if(grade >=80 && grade <= 90) {
			System.out.print("B");
		} else if(grade >=70 && grade <= 80) {
			System.out.print("C");
		} else if(grade >=60 && grade <= 70) {
			System.out.print("D");
		} else if(grade >=50 && grade <= 60) {
			System.out.print("E");
		} else if(grade >=40 && grade <= 50) {
			System.out.print("F");
		} else if(grade >=30 && grade <= 40) {
			System.out.print("G");
		} else if(grade >=20 && grade <= 30) {
			System.out.print("H");
		} else if(grade >=10 && grade <= 20) {
			System.out.print("I");
		} else if(grade >=0 && grade <= 10) {
			System.out.print("J");
		} else {
			System.out.print("Ingresa solo números entre 0 y 100");
		}
		
	}

}

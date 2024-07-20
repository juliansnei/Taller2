import java.util.Scanner;
public class Ejercicio8 {
	public static void main(String[] ar) {
		Scanner entry = new Scanner(System.in);
		float grade1, grade2, grade3, prom;
		System.out.print("Ingrese la primera nota: ");
		grade1 = entry.nextFloat();
		System.out.print("Ingrese la segunda nota: ");
		grade2 = entry.nextFloat();
		System.out.print("Ingrese la tercera nota: ");
		grade3 = entry.nextFloat();
		entry.close();
		prom = (grade1 + grade2 + grade3)/3;
		if(prom>=6) {
			System.out.print("Estas aprobado");
		} else {
			System.out.print("No estas aprobado");
		}
	}

}

import java.util.Scanner;
public class Ejercicio4 {
	public static void main(String[] ar) {
		Scanner entry = new Scanner(System.in);
		float weight, height, IMC;
		System.out.print("Ingrese su altura en metros: ");
		height = entry.nextFloat();
		System.out.print("Ingrese su peso en kilogramos: ");
		weight = entry.nextFloat();
		entry.close();
		IMC = weight/(height*height);
		System.out.println("Tu Índice de masa corporal es de: " + IMC);
	}
}

import java.util.Scanner;
public class Ejercicio3 {
	public static void main(String[] ar) {
		Scanner scanner = new Scanner(System.in);
		double distanciaEnKM, distanciaEnMillas;
		System.out.print("Ingrese la distancia en kilometros: ");
		distanciaEnKM = scanner.nextInt();
		scanner.close();
		distanciaEnMillas = distanciaEnKM*1.60934;
		System.out.println("La distancia en Km es: " + distanciaEnKM + " y transformado en Millas es: " + distanciaEnMillas);
	} 

}

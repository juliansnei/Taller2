import java.util.Scanner;
public class Ejercicio13 {
	public static void main(String[] arg) {
		Scanner entry = new Scanner(System.in);
		float distance, totalTariff;
		float baseTariff = 4000;
		float tariffByKm = 2000;
		System.out.print("Ingresa la distancia del viaje en kilometros: ");
		distance = entry.nextFloat();
		entry.close();
		totalTariff = baseTariff + (distance*tariffByKm);
		System.out.print("La tarifa del viaje en taxi es de : " + totalTariff);
	}

}

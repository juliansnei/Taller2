import java.util.Scanner;
public class Ejercicio10 {
	public static void main(String[] ar) {
		Scanner entry = new Scanner(System.in);
		float totalBill, percentageTip, tip;
		System.out.print("Ingresa el total de la cuenta a pagar: ");
		totalBill = entry.nextFloat();
		System.out.print("Ingresa el porcentaje de propina que quieras dar:  ");
		percentageTip = entry.nextFloat();
		entry.close();
		tip = (totalBill*percentageTip)/100;
		System.out.print("La propina a pagar es de: " + tip + "$");
	}

}

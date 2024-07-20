import java.util.Scanner;
public class Ejercicio6 {
	public static void main(String[] ar) {
		Scanner entry = new Scanner(System.in);
		byte monthNum;
		System.out.print("Ingrese el número de un mes específico: ");
		monthNum = entry.nextByte();
		entry.close();
		switch(monthNum){
			case 1:
				System.out.print("El mes de enero tiene 31 días");
				break;
			case 2:
				System.out.print("El mes de febrero tiene 28 días");
				break;
			case 3:
				System.out.print("El mes de marzo tiene 31 días");
				break;
			case 4:
				System.out.print("El mes de abril tiene 30 días");
				break;
			case 5:
				System.out.print("El mes de mayo tiene 31 días");
				break;
			case 6:
				System.out.print("El mes de junio tiene 30 días");
				break;
			case 7:
				System.out.print("El mes de julio tiene 31 días");
				break;
			case 8:
				System.out.print("El mes de agosto tiene 31 días");
				break;
			case 9:
				System.out.print("El mes de septiembre tiene 30 días");
				break;
			case 10:
				System.out.print("El mes de octubre tiene 31 días");
				break;
			case 11:
				System.out.print("El mes de noviembre tiene 30 días");
				break;
			case 12:
				System.out.print("El mes de diciembre tiene 31 días");
				break;
			default:
				System.out.print("Ese número de mes no existe");
		}
	}

}

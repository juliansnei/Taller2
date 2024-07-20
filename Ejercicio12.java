import java.util.Scanner;
public class Ejercicio12 {
	public static void main(String[] arg) {
		Scanner entry = new Scanner(System.in);
		byte day, month;
		System.out.print("Ingrese su día de nacimiento");
		day = entry.nextByte();
		System.out.print("Ingrese el número del mes de nacimiento(1 si es enero, 2 si es febrero etc.)");
		month = entry.nextByte();
		entry.close();
		switch(month) {
		case 1:
			if(day >=1 && day<=19) {
				System.out.print("Su signo es Capricornio");
			} else if(day > 19 && day <= 31) {
				System.out.print("Su signo es Acuario");
			} else {
				System.out.print("Número no válido");
			}
		case 2:
			if(day >=1 && day<=18) {
				System.out.print("Su signo es Acuario");
			} else if(day > 18 && day <= 29) {
				System.out.print("Su signo es Piscis");
			} else {
				System.out.print("Número no válido");
			}
		case 3:
			if(day >=1 && day<=20) {
				System.out.print("Su signo es Piscis");
			} else if(day > 20 && day <= 31) {
				System.out.print("Su signo es Aries");
			} else {
				System.out.print("Número no válido");
			}
		case 4:
			if(day >=1 && day<=19) {
				System.out.print("Su signo es Aries");
			} else if(day > 19 && day <= 30) {
				System.out.print("Su signo es Tauro");
			} else {
				System.out.print("Número no válido");
			}
		case 5:
			if(day >=1 && day<=20) {
				System.out.print("Su signo es Tauro");
			} else if(day > 20 && day <= 31) {
				System.out.print("Su signo es Géminis");
			} else {
				System.out.print("Número no válido");
			}
		case 6:
			if(day >=1 && day<=20) {
				System.out.print("Su signo es Géminis");
			} else if(day > 20 && day <= 30) {
				System.out.print("Su signo es Cáncer");
			} else {
				System.out.print("Número no válido");
			}
		case 7:
			if(day >=1 && day<=22) {
				System.out.print("Su signo es Cáncer");
			} else if(day > 22 && day <= 31) {
				System.out.print("Su signo es Leo");
			} else {
				System.out.print("Número no válido");
			}
		case 8:
			if(day >=1 && day<=22) {
				System.out.print("Su signo es Leo");
			} else if(day > 22 && day <= 31) {
				System.out.print("Su signo es Virgo");
			} else {
				System.out.print("Número no válido");
			}
		case 9:
			if(day >=1 && day<=22) {
				System.out.print("Su signo es Virgo");
			} else if(day > 22 && day <= 30) {
				System.out.print("Su signo es Libra");
			} else {
				System.out.print("Número no válido");
			}
		case 10:
			if(day >=1 && day<=22) {
				System.out.print("Su signo es Libra");
			} else if(day > 22 && day <= 31) {
				System.out.print("Su signo es Escorpio");
			} else {
				System.out.print("Número no válido");
			}
		case 11:
			if(day >=1 && day<=21) {
				System.out.print("Su signo es Escorpio");
			} else if(day > 21 && day <= 30) {
				System.out.print("Su signo es Sagitario");
			} else {
				System.out.print("Número no válido");
			}
		case 12:
			if(day >=1 && day<=21) {
				System.out.print("Su signo es Sagitario");
			} else if(day > 21 && day <= 31) {
				System.out.print("Su signo es Capricornio");
			} else {
				System.out.print("Número no válido");
			}
			
		}
	}

}

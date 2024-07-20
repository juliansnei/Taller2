import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Ejercicio16 {
	public static void main(String[] arg) {
		Scanner entry = new Scanner(System.in);
		String password;
		int contador = 1, posicion = 0;
		boolean hasCapitalLetters = false, hasLowerCase = false, hasSpecialCharacter = false;
		System.out.print("Ingrese una contraseña: ");
		password = entry.nextLine();
		entry.close();
		if(password.length() > 8) {
			while(contador <= password.length()) {
				if(hasCapitalLetters == false) {
					if(Character.isUpperCase(password.charAt(posicion)) == true) {
						hasCapitalLetters = true;
					} 
				}
				if(hasLowerCase == false) {
					if(Character.isLowerCase(password.charAt(posicion)) == true) {
						hasLowerCase = true;
					}
				}
				contador++;
				posicion++;
			}
			if(hasSpecialCharacter == false) {
				Pattern p = Pattern.compile("[^A-Za-z0-9]");
			    Matcher m = p.matcher(password);
			    hasSpecialCharacter = m.find();
			}
			if(hasCapitalLetters == true) {
				System.out.println("La contraseña tiene al menos una mayuscula");
			} else {
				System.out.println("La contraseña no tiene mayusculas");
			}
			if(hasLowerCase == true) {
				System.out.println("La contraseña tiene al menos una minuscula");
			} else {
				System.out.println("La contraseña no tiene minusculas");
			}
			if(hasSpecialCharacter == true) {
				System.out.println("La contraseña tiene al menos un caracter especial");
			} else {
				System.out.println("La contraseña no tiene  caracteres especiales");
			}
		} else {
			System.out.println("La contraseña tiene que ser mayor a 8 caracteres");
		}
		
		
	}

}

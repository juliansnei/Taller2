import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Ejercicio17 {
	public static void main(String[] arg) {
		Scanner entry = new Scanner(System.in);
		char sign;
		System.out.print("Ingrese solo un caracter: ");
		sign = entry.next().charAt(0);
		entry.close();
		String signStr = String.valueOf(sign);
		Pattern specials = Pattern.compile("[^A-Za-z0-9]");
		Pattern vowels = Pattern.compile("[aeiouAEIOUáéíóúÁÉÍÓÚ]");
		Pattern consonants = Pattern.compile("[a-z&&[^aeiou]]");
		
		Matcher special = specials.matcher(signStr);
		Matcher vowel = vowels.matcher(signStr);
		Matcher consonant = consonants.matcher(signStr);
		
		if(special.find()) {
			System.out.println("The character is an special character");
		} else if(vowel.find()) {
			System.out.println("The character is a vowel");
		} else if(consonant.find()) {
			System.out.println("The character is a consonant");
		} else {
			System.out.println("The character is neither an special character, a vowel or a consonant");
		}
	}

}

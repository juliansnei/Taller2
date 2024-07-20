import java.util.Scanner;
public class Ejercicio20 {
	public static void main(String[] arg) {
		Scanner scanner = new Scanner(System.in);
		int num;
		System.out.println("Dame el desplazamiento del cifrado cesar:");
		num = scanner.nextInt();
		scanner.nextLine();
		String[] arrayLetters = new String[] {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","Ñ","O","P","Q","R","S","T","U","V","X","Y","Z"};
		String mensaje, newMensaje = "";
		System.out.println("Ingresa el mensaje al que se le aplicara el cifrado cesar: ");
		mensaje = scanner.nextLine();
		scanner.close();
		for(int i = 0; i < mensaje.length(); i++) {
			String letter = String.valueOf(mensaje.charAt(i));
			int index = 0;
			boolean found = false;
			for(int j = 0; j < arrayLetters.length; j++) {
				if(letter.equalsIgnoreCase(arrayLetters[j])) {
					found = true;
					index = j;
					break;
				}
			}
			if(found) {
				if((index + num) > (arrayLetters.length - 1)) {
					newMensaje += arrayLetters[(index + num) - (arrayLetters.length)];
				} else {
					newMensaje += arrayLetters[index + num];
				}
				
			} else {
				newMensaje += letter;
			}
		}
		System.out.println(newMensaje);
	}

}

import java.util.Scanner;
public class Ejercicio7 {
	public static void main(String[] ar) {
		Scanner entry = new Scanner(System.in);
		int num1,num2,option;
		System.out.print("Ingresa el primer número: ");
		num1 = entry.nextInt();
		System.out.print("Ingresa el segundo número: ");
		num2 = entry.nextInt();
		System.out.print("Ingresa el número de las siguientes opciones: 1. Sumar, 2. Restar, 3. Multiplicar, 4. Dividir");
		option = entry.nextInt();
		entry.close();
		switch(option) {
			case 1:
				System.out.print("La suma entre " + num1 + " y " + num2 + " es " + (num1+num2));
				break;
			case 2:
				System.out.print("La resta entre " + num1 + " y " + num2 + " es " + (num1-num2));
				break;
			case 3:
				System.out.print("La multiplicación entre " + num1 + " y " + num2 + " es " + (num1*num2));
				break;
			case 4:
				System.out.print("La división entre " + num1 + " y " + num2 + " es " + (num1/num2));
				break;
		}
	}

}

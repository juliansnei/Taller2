import java.util.Scanner;
import java.lang.Math;
public class Ejercicio18 {
	public static void main(String[] arg) {
		Scanner scanner = new Scanner(System.in);
		Integer numRandom, pointsUser = 0, poitsMachine = 0;
		String optionMachine = "", optionUser;
		
		System.out.println("--------Bienvenido al juego de Piedra, Papel y Tijeras.------------");
		do {
			numRandom = (int)((Math.random() * 3) + 1);
			switch(numRandom) {
			case 1:
				optionMachine = "piedra";
				break;
			case 2: 
				optionMachine = "papel";
				break;
			case 3:
				optionMachine = "tijeras";
				break;
			}
			System.out.println("Vamos a jugar, escoge entre las tres opciones: \n Escribe 'piedra' para escoger esta opción, \n ó escribe 'papel' ó\n 'tijeras'(con s al final), o solo copia 'salir' para terminar el programa:");
			optionUser = scanner.nextLine();
			if(optionUser.equalsIgnoreCase("salir") || optionUser.equalsIgnoreCase("piedra") || optionUser.equalsIgnoreCase("papel") || optionUser.equalsIgnoreCase("tijeras")) {
				if(optionUser.equalsIgnoreCase("piedra")) {
					if(optionUser.equalsIgnoreCase(optionMachine)) {
						System.out.println("Hay empate, no hay puntos para ninguno");
					} else if(optionMachine.equalsIgnoreCase("tijeras")) {
						System.out.println("Tu piedra destruye las tijeras de la maquina, ganas un punto");
						pointsUser++;
					} else if(optionMachine.equalsIgnoreCase("papel")) {
						System.out.print("Tu piedra queda atrapada en el papel de la maquina, la maquina gana un punto");
						poitsMachine++;
					} 
				} else if(optionUser.equalsIgnoreCase("papel")) {
					if(optionUser.equalsIgnoreCase(optionMachine)) {
						System.out.println("Hay empate, no hay puntos para ninguno");
					} else if(optionMachine.equalsIgnoreCase("tijeras")) {
						System.out.println("Tu papel queda cortado por las tijeras de la maquina, la maquina gana un punto");
						poitsMachine++;
					} else if(optionMachine.equalsIgnoreCase("piedra")) {
						System.out.print("Tu papel atrapa a la piedra de la maquina, ganas un punto");
						pointsUser++;
					} 
				} else if(optionUser.equalsIgnoreCase("tijeras")) {
					if(optionUser.equalsIgnoreCase(optionMachine)) {
						System.out.println("Hay empate, no hay puntos para ninguno");
					} else if(optionMachine.equalsIgnoreCase("papel")) {
						System.out.println("Tus tijeras cortan el papel de la maquina, ganas un punto");
						pointsUser++;
					} else if(optionMachine.equalsIgnoreCase("piedra")) {
						System.out.print("Tus tijeras quedan destrozadas por la piedra de la maquina, la maquina gana un punto");
						poitsMachine++;
					} 
				} else {
					if(pointsUser > poitsMachine) {
						System.out.println("Has ganado con " + pointsUser + " puntos, frente a " + poitsMachine + " de la maquina, ¡Bien Hecho!");
					} else if(pointsUser < poitsMachine) {
						System.out.println("Has perdido con " + pointsUser + " puntos, frente a " + poitsMachine + " de la maquina, Lo siento, suerte a la próxima");
					} else {
						System.out.println("Han quedado empatados.");
					}
					System.out.println("Gracias por jugar en la app de Piedra, Papel y Tijeras vuelve pronto.");
				}
			} else {
				System.out.println("Opción no válida (recuerda que solo estan disponibles las opciones piedra, papel, tijeras o salir)");
			}
			
		} while(!optionUser.equalsIgnoreCase("salir"));
		scanner.close();
	}

}

import java.util.Scanner;

public class Start {
	
	
	public static void main(String[] args) {
		
		Fila fila = new Fila();
		
		Scanner scanner = new Scanner(System.in);
		
		int number = 0;
		
		while(number != 9) {
			try {
				System.out.println(" 1 - Enfileirar um objeto");
				System.out.println(" 2 - Desenfileirar um objeto");
				System.out.println(" 3 - Tamanho da fila");
				System.out.println(" 4 - Primeiro elemento da fila");
				System.out.println(" 5 - Ultimo elemento da fila");
				String numberChosen = scanner.nextLine();
				number = Integer.parseInt(numberChosen);
				
				switch (number) {
					case 1:
						String objeto = scanner.nextLine();
						fila.toQueue(objeto);
						System.out.println("Objeto Inserido");
						break;
					case 2:
						fila.deQueue();
						System.out.println("Objeto retirado");
						break;
					case 3:
						System.out.println("Tamanho da fila: "+fila.queueSize());
						break;
					case 4:
						System.out.println("Primeiro elemento da fila: "+fila.firstElement());
						break;
					case 5:
						System.out.println("Ultimo elemento da fila: "+fila.lastElement());
						break;
					default:
						break;
				}
				
			}catch(NumberFormatException e) {
				System.out.println("Numero invalido");
				number = 0;
			}
		}
		scanner.close();
	}
}


import java.util.Scanner;

public class BuscarMenor {
	
	 public static void main(String[] args) {
	        // Crear un objeto Scanner para leer desde la entrada estándar
	        Scanner scanner = new Scanner(System.in);

	        // Leer el valor de N (cantidad de números a comparar)
	        int N = scanner.nextInt();

	        // Inicializamos una variable para el menor número
	        int menor = Integer.MAX_VALUE;

	        // Leer los N números y encontrar el menor
	        for (int i = 0; i < N; i++) {
	            int numero = scanner.nextInt(); // Leer el número
	            if (numero < menor) {
	                menor = numero; // Actualizamos el menor número
	            }
	        }

	        // Mostrar el menor número
	        System.out.println(menor);

	        // Cerrar el scanner
	        scanner.close();
	    }

}



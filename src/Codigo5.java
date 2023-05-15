//se coloca el import
import java.util.Scanner;

public class Codigo5 {
	
	//Se crea el main
	public static void main(String[] args) {
		
		//Se agrega System.in
		//se modifica todas las s por Scanner
		Scanner Scanner = new Scanner(System.in);
		//Se coloca una  doble comilla en lugar de comilla simple
		
		System.out.println("Introduzca un número: ");
		//se cambia String por int
		String ni = Scanner.nextLine();
		//Se convierte string a int
		int c = Integer.parseInt(ni);
		
		int afo = 0;
		int noAfo = 0;
		
		//Se cambia variable ni por c
		while (c > 0) {
			int digito = c % 10;
			if ((digito == 3) || (digito == 7) || (digito == 8) || (digito == 9)) {
				afo++;
			} else {
				noAfo++;  
			}
			c /= 10;
		}
		//se agrega el Scanner.close
		Scanner.close();
			if (afo > noAfo) {
				//Se modifica println
				System.out.println("El " + ni + " es un número afortunado.");
			} else {
				System.out.println("El " + ni + " no es un número afortunado.");
			}
			
		
		
	}
		
	}
	

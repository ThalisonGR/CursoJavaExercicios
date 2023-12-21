/**
 * 
 */
package EstruturasRepetitivas;

import java.util.Scanner;

/**
 * @author West
 *
 */
public class dowhile {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		double resultFormula = 0.0;
		char repetir;

		do {
			double c = 0.0;

			System.out.print("Digite a temperatura em Celsius: ");
			c = sc.nextDouble();
			resultFormula = (9 * c / 5) + 32.0;
			System.out.print("Equivalente em Fahrenheit: ");
			System.out.print(resultFormula);
			System.out.print("Deseja repetir( s / n): ");
			repetir = sc.next().charAt(0);

		} while (repetir != 'n');

	}

}

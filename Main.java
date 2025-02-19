/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static float Soma(float a, float b) {
		return a + b;
	}

	public static float Sub(float a, float b) {
		return a - b;
	}

	public static float Mult(float a, float b) {
		return a * b;
	}

	public static float Div(float a, float b) {
		return a / b;
	}

	public static void Menu() {
		System.out.println("\nMenu:");
		System.out.println("\n[1] Adição");
		System.out.println("[2] Subtração");
		System.out.println("[3] Multiplicação");
		System.out.println("[4] Divisão");
		System.out.println("[0] Sair\n");
	}


	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		float prim = 0;
		float seg = 0;
		int calc;

		do {
			Menu();
			calc = scan.nextInt();
			if(calc > 0 && calc<5) {
				System.out.println("\nDigite o primeiro número:");
				prim = scan.nextFloat();
				System.out.println("\nDigite o segundo número:");
				seg = scan.nextFloat();
			}

			switch(calc) {

			case 1:
				System.out.printf("\n%.2f + %.2f = %.2f\n", prim, seg, Soma(prim, seg));
				break;

			case 2:
				System.out.printf("\n%.2f - %.2f = %.2f\n", prim, seg, Sub(prim, seg));
				break;

			case 3:
				System.out.printf("\n%.2f * %.2f = %.2f\n", prim, seg, Mult(prim, seg));
				break;

			case 4:
				while (seg == 0) {
					System.out.println("\nImpossível dividir por 0");
					System.out.println("Digite o segundo número:");
					seg = scan.nextInt();
				};
				System.out.printf("\n%.2f / %.2f = %.2f\n", prim, seg, Div(prim, seg));
				break;

			case 0:
				System.out.println("\nSaindo...");
				break;

			default:
				System.out.println("\nInválido, digite outro número");
				break;
			}
		}
		while(calc != 0);

		scan.close();
	}
}

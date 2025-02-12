/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.Scanner;
public class Main
{
 
	public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
	    int prim;
        int seg;
        int res;
        int calc;
	            
        do {
    		System.out.println("\nMenu:");
		    System.out.println("\n[1] Adição");
            System.out.println("[2] Subtração");
            System.out.println("[3] Multiplicação");
            System.out.println("[4] Divisão");
            System.out.println("[0] Sair");
            calc = scan.nextInt();
            
            switch(calc) {
                
            case 1:
                System.out.println("\nDigite o primeiro número:");
                prim = scan.nextInt();
                System.out.println("Digite o segundo número:");
                seg = scan.nextInt();
                res = prim + seg;
                System.out.printf("%d + %d = %d", prim, seg, res);
                break; 
            
            case 2:
                System.out.println("\nDigite o primeiro número:");
                prim = scan.nextInt();
                System.out.println("Digite o segundo número:");
                seg = scan.nextInt();                
                res = prim - seg;
                System.out.printf("%d - %d = %d", prim, seg, res);
                break;
                
            case 3:
                System.out.println("\nDigite o primeiro número:");
                prim = scan.nextInt();
                System.out.println("Digite o segundo número:");
                seg = scan.nextInt();
                res = prim * seg;
                System.out.printf("%d * %d = %d", prim, seg, res);
                break;
                
            case 4:
                System.out.println("\nDigite o primeiro número:");
                prim = scan.nextInt();
                do {
                    System.out.println("Digite o segundo número:");
                    seg = scan.nextInt();
                    if (seg == 0) {
                        System.out.println("Impossível dividir por 0");
                    }
                }
                while (seg == 0);
                res = prim / seg;
                System.out.printf("%d / %d = %d", prim, seg, res);
                break;
                    
            case 0:
                System.out.println("Saindo...");
                break;
                
            default:
                System.out.println("Inválido");
                break;
            }
        } 
        while(calc != 0);
        
		scan.close();
	}
}

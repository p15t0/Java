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
	    float prim = 0;
        float seg = 0;
        float res;
        int calc;
	            
        do {
    		System.out.println("\nMenu:");
		    System.out.println("\n[1] Adição");
            System.out.println("[2] Subtração");
            System.out.println("[3] Multiplicação");
            System.out.println("[4] Divisão");
            System.out.println("[0] Sair\n");
            calc = scan.nextInt();
            
            if(calc > 0 && calc<5) {
                System.out.println("\nDigite o primeiro número:");
                prim = scan.nextFloat();
                System.out.println("\nDigite o segundo número:");
                seg = scan.nextFloat();
            }
            
            switch(calc) {
                
            case 1:
                res = prim + seg;
                System.out.printf("\n%.2f + %.2f = %.2f\n", prim, seg, res);
                break; 
            
            case 2:
                res = prim - seg;
                System.out.printf("\n%.2f - %.2f = %.2f\n", prim, seg, res);
                break;
                
            case 3:
                res = prim * seg;
                System.out.printf("\n%.2f * %.2f = %.2f\n", prim, seg, res);
                break;
                
            case 4:
                while (seg == 0){
                    System.out.println("\nImpossível dividir por 0");
                    System.out.println("Digite o segundo número:");
                    seg = scan.nextInt();
                };
                res = prim / seg;
                System.out.printf("\n%.2f / %.2f = %.2f\n", prim, seg, res);
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

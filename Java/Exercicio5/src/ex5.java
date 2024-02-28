import java.util.Scanner;

public class ex5 {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		double nota1 = sc.nextDouble();
		double nota2 = sc.nextDouble();
		double notafinal = nota1+nota2;
		
		if (notafinal<60) {
			System.out.printf("NOTA FINAL = %.1f%n", notafinal);
			System.out.println("REPROVADO");
		}else {
			System.out.printf("NOTA FINAL = %.1f%n", notafinal);
			System.out.println("APROVADO");
		}
		
		
		sc.close();
	}
}

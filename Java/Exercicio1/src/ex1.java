import java.util.Locale;
import java.util.Scanner;

public class ex1 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double largura = sc.nextDouble();
		double comprimento = sc.nextDouble();
		double valorm2 = sc.nextDouble();
		
		double area =  largura * comprimento;
		double preco =  area * valorm2;
		
		System.out.printf("A area do terreno e %.2f metros quadrados%n", area);
		System.out.printf("O valor total do terreno e de R$ %.2f%n", preco);
		
		
		
		sc.close();
	}
	
}

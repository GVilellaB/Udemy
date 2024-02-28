import java.util.Scanner;
public class ex2 {

	public static void main(String[] args) { 

		Scanner sc = new Scanner(System.in);
		
		
			double A = sc.nextDouble();
			double B = sc.nextDouble();
			double AREA = A*B;
			double PERIMETRO =(2*(A+B));
			double DIAGONAL = Math.sqrt((Math.pow(A,2))+(Math.pow(B,2)));
			
			System.out.printf("AREA = %.4f%n", AREA);
			System.out.printf("PERIMETRO = %.4f%n", PERIMETRO);
			System.out.printf("DIAGONAL = %.4f%n", DIAGONAL);	
		
		
		
		sc.close();
	}
}

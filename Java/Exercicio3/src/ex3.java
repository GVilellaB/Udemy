import java.util.Scanner;
public class ex3 {

	public static void main(String[] args) { 

		Scanner sc = new Scanner(System.in);
		
		
			String nome1 = sc.next();
			int idade1 = sc.nextInt();
			String nome2 = sc.next();
			int idade2 =sc.nextInt();
			double media = (double) (idade1+idade2)/2;
			
			System.out.printf("A idade media entre %s e %s e de %.1f%n", nome1, nome2, media);
					
		
		sc.close();
	}

	
}
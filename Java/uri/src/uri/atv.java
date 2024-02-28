package uri;
import java.io.IOException;
import java.util.Scanner;
import java.util.Locale;
public class atv {	

	public static void main(String[] args) throws IOException{ 
			 Locale.setDefault(Locale.US);
			 Scanner sc = new Scanner(System.in);
	            
	            int N = sc.nextInt();
	            
	            for(int i=1; i<=10; i++) {
	            	int produto = i * N;
	            	System.out.println(i +" x "+ N +" = " + produto);
	            }
	                
	 sc.close();
	    }

	}


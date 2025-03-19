package atividadejava05;

import java.util.Scanner;

public class AtividadeIf2 {

	public static void main(String[] args) {
	
		Scanner lerScanner = new Scanner(System.in);
	    int num;
		
		System.out.println("Digite o número desejado:\n");
        num = lerScanner.nextInt();
       
        
        if (num %2 == 0 && num > 0) {
        	System.out.println("Número %d é PAR E POSITIVO!");
 
        }else if (num %2 == 1 && num > 0){
        	System.out.println("Número %d é ÍMPAR E POSITIVO!");
        	
        }else if (num %2 != 0 && num < 0){
            System.out.println("Número %d é ÍMPAR E NEGATIVO");
            	
        }else if (num %2 == 0 && num < 0){
        	System.out.println("Número %d é PAR E NEGATIVO!");
        }
        
        lerScanner.close();

	}

}

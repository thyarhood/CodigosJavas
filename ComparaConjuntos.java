import java.util.Scanner;

public class ComparaConjuntos {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		int conj_1[];
		conj_1 = new int[5];
		
		int conj_2[];
		conj_2 = new int[10];
		
		int igual = 0,total_igual = 0;
		int nao_igual = 0;
		
		for(int i = 0; i < 5; i++) {
			System.out.printf("Digite o %dº numero do primeiro conjunto: ",i + 1);
			conj_1[i] = sc.nextInt();
		}
		
				System.out.println("");
				
			for(int i = 0; i < 10; i++) {
				System.out.printf("Digite o %dº numero do segundo conjunto: ",i + 1);
				conj_2[i] = sc.nextInt();
			}
			
				System.out.println("");
			
				for(int i = 0; i < 10; i++) {
					igual = 0;
					for(int j = 0; j < 5; j++) {
						if(conj_2[i] == conj_1[j]) {
							igual = 1;
							total_igual = total_igual + 1;
							j = 6;
						}
					}
							if(igual == 0) {
							System.out.println("O numero " + conj_2[i] + " nao esta nos dois conjuntos");
							nao_igual= nao_igual + 1;
							}		
				}
								if(total_igual == 10) {
									System.out.println("Todos os numeros estao nos dois conjuntos");
								}
								sc.close();
									if(nao_igual == 10){
									for(int i = 0; i < 5; i++) {
									System.out.println("O numero " + conj_1[i] + " nao esta nos dois conjuntos");
									}
									}
	}
}

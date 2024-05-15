package aula_6;

import java.util.Scanner;


public class Atividade2 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		int m[][]= new int[4][4];
		int valor=1;
		
		for(int i=0; i < 4; i++) {
			m[i][i]= valor++;
			valor = (int)Math.round(Math.random()*10);
			
		}
		System.out.println("Matriz resultante: ");
		for(int i=0; i<4; i++) {
			for(int j=0; j<4; j++) {
				System.out.print(m[i][j]+"\t");
			}
			System.out.println();

	}

}
}

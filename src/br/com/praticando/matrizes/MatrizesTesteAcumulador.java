package br.com.praticando.matrizes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MatrizesTesteAcumulador {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Tio Sam Uma fun��o recebe um array de n�mero e recebe uma soma. preciso achar
		 * os n�meros que d�o a soma.
		 * 
		 */

		Scanner entrada = new Scanner(System.in);
		List<Integer> matriz = new <Integer>ArrayList();
		Boolean verificador = true;

		while (verificador) {
			System.out.println("Digite um n�mero para matriz desejada");
			matriz.add(Integer.parseInt(entrada.nextLine()));
			System.out.println("Deseja continuar a matriz? true or false?");
			verificador = (Boolean.parseBoolean(entrada.nextLine()));
		}
		System.out.println("Essa � a sua matriz " + matriz);

		System.out.println("Digite o valor da soma a ser verificada: ");
		Integer valorSoma = Integer.parseInt(entrada.nextLine());

		for (int i = 0; i < matriz.size() - 1; i++) {
			for (int j = i+1; j < matriz.size(); j++) {
				if ((matriz.get(i) + matriz.get(j)) == valorSoma) {
					System.out.println(matriz.get(i) + " , " + matriz.get(j));
				} 
			}
		}
	}

}

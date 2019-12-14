package br.com.mytests;

import java.util.ArrayList;
import java.util.List;

public class BaseConverter {
	
	/**
	 * Retrona uma representação da base 2 em forma de String
	 * @param number é um long que é convertido para binário e retorna uma String
	 * @return String
	 */
	public static String decimalToBinarie(long number) {
		List<Long> numBinaries = new ArrayList<>();
		long entryData = 0; // Entrada do usuário
		long aux = 0; // Váriavel para armazenar o valor do módulo
		String binarie = ""; // Váriavel a ser armazenado o número binário

		System.out.println("CONVERSOR DE DECIMAL PARA BINÁRIO");

		entryData = number;

		while (true) {
			
			if (entryData == 1 || entryData == 0) { // Se o número inserido for 1 ou 0 insere na lista
				numBinaries.add(entryData);
				break;
			}
			
			aux = entryData % 2; // atribui o módulo da divisão por 2 na váriavel aux
			numBinaries.add(aux); // adiciona a váriavel a lista
			entryData /= 2; // Divide por 2 e atribui o valor a variavel entrada

		}

		/* Percorre a lista de trás para frente e a concatena */
		for (int i = numBinaries.size() - 1; i >= 0; i--) {
			binarie += numBinaries.get(i);
		}

		return binarie;
	}
	

}

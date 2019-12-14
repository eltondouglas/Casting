package br.com.mytests;

import java.util.ArrayList;
import java.util.List;

public class BaseConverter {
	
	/**
	 * Retrona uma representa��o da base 2 em forma de String
	 * @param number � um long que � convertido para bin�rio e retorna uma String
	 * @return String
	 */
	public static String decimalToBinarie(long number) {
		List<Long> numBinaries = new ArrayList<>();
		long entryData = 0; // Entrada do usu�rio
		long aux = 0; // V�riavel para armazenar o valor do m�dulo
		String binarie = ""; // V�riavel a ser armazenado o n�mero bin�rio

		System.out.println("CONVERSOR DE DECIMAL PARA BIN�RIO");

		entryData = number;

		while (true) {
			
			if (entryData == 1 || entryData == 0) { // Se o n�mero inserido for 1 ou 0 insere na lista
				numBinaries.add(entryData);
				break;
			}
			
			aux = entryData % 2; // atribui o m�dulo da divis�o por 2 na v�riavel aux
			numBinaries.add(aux); // adiciona a v�riavel a lista
			entryData /= 2; // Divide por 2 e atribui o valor a variavel entrada

		}

		/* Percorre a lista de tr�s para frente e a concatena */
		for (int i = numBinaries.size() - 1; i >= 0; i--) {
			binarie += numBinaries.get(i);
		}

		return binarie;
	}
	

}

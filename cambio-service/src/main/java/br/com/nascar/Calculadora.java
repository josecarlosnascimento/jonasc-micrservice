package br.com.nascar;

import java.util.ArrayList;

public class Calculadora{

	public static void main (String[] args){
		
		int soma = 0;
		int ultimoNumero = 0;
		ArrayList<Integer> numeros = new ArrayList<>();
		numeros.add(10);
		numeros.add(50);
		numeros.add(2);
		
		ultimoNumero = numeros.get(numeros.size() - 1);
		
		for (int i = 0; i < numeros.size(); i++) {
			soma += numeros.get(i);
		}
		
		System.out.println(soma / ultimoNumero);
		
	}

}
package br.com.dio.calculadora;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int a, b;
		
		System.out.println("Digite o primeiro valos: ");
		a = scan.nextInt();
		System.out.println("Digite o segundo valos: ");
		b = scan.nextInt();
		
		int soma = soma (a,b);
		int subtracao = subtracao(a,b);
		int divisao = divisao(a,b);
		int multiplicacao = multliplicacao(a,b);
		
		System.out.println("soma " + soma);
		System.out.println("Subtracao "  + subtracao);
		System.out.println("divisão " + divisao);
		System.out.println("multiplicaçaõ " + multiplicacao);
		
	}

	public static int soma(int a, int b) {
		return a + b; 
				
	}
	
	public static int subtracao(int a, int b) {
		return a - b; 
				
	}
	public static int divisao(int a, int b) {
		return a / b; 
				
	}
	public static int multliplicacao(int a, int b) {
		return a * b; 
				
	}
}

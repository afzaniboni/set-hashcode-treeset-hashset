package application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Program2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Set<Integer> cursoA = new HashSet<>();
		Set<Integer> cursoB = new HashSet<>();
		Set<Integer> cursoC = new HashSet<>();

		System.out.print("Quantos alunos temos no curso A? ");
		Integer n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			cursoA.add(sc.nextInt());
		}
		System.out.print("Quantos alunos temos no curso B? ");
		n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			cursoB.add(sc.nextInt());
		}
		System.out.print("Quantos alunos temos no curso C? ");
		n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			cursoC.add(sc.nextInt());
		}

		Set<Integer> resultado = new HashSet<>(cursoA);
		resultado.addAll(cursoB);
		resultado.addAll(cursoC);

		System.out.println("Lista Resultado: " + resultado);
		System.out.println("Total de Estudantes: " + resultado.size());
		sc.close();

	}
}

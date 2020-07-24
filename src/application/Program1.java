package application;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Program1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Set<Integer> cursoA = new TreeSet<>();
		Set<Integer> cursoB = new TreeSet<>();
		Set<Integer> cursoC = new TreeSet<>();
		
		System.out.print("Quantos alunos temos no curso A? ");
		Integer qteA = sc.nextInt();
		for (int i=0; i<qteA; i++) {
			cursoA.add(sc.nextInt());
		}
		System.out.print("Quantos alunos temos no curso B? ");
		Integer qteB = sc.nextInt();
		for (int i=0; i<qteB; i++) {
			cursoB.add(sc.nextInt());
		}		
		System.out.print("Quantos alunos temos no curso C? ");
		Integer qteC = sc.nextInt();
		for (int i=0; i<qteC; i++) {
			cursoC.add(sc.nextInt());
		}				
		
		Set<Integer> resultado = new TreeSet<>(cursoA);
		resultado.addAll(cursoB);
		resultado.addAll(cursoC);
		
		System.out.println("Lista Resultado: " + resultado);
		System.out.println("Total de Estudantes: " + resultado.size());
		sc.close();
		
	}
}

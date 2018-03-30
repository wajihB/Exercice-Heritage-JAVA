package com.heritage.exo1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		String _nom;
		String _prenom;
		int _age;
		
		Scanner sc = new Scanner(System.in);
		Personne personne = new Personne();
		
		System.out.println("Ëntrer le nom");
		String nom = sc.nextLine();
		personne.setNom(nom);
		
		System.out.println("Ëntrer le prénom");
		String prenom = sc.nextLine();
		personne.setPrenom(prenom);
		
		System.out.println("Ëntrer voter age");
		int age = sc.nextInt();
		personne.setAge(age);
		
		String presentation = personne.sePresenter();
		System.out.println(presentation);
		
		Chanteur chanteur = new Chanteur();
		chanteur.setNom(nom);
		chanteur.setPrenom(prenom);
		System.out.println(chanteur.sePresenter());
	}

}

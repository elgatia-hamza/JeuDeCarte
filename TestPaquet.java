package cartes;

import java.util.Scanner;

public class TestPaquet {
	public static void main(String[] args) {
		Paquet paquet = new Paquet();
		MainDeJoueur1 maMain = paquet.creerMain1();
		System.out.println("mon jeu " + maMain);
		Scanner scanner = new Scanner(System.in);
		System.out.print("Entrez une valeur de carte :");
		int valeur = scanner.nextInt();
		System.out.print("Entrez une couleur de carte :");
		String couleur = scanner.next();
		Carte c = new Carte(valeur, couleur);
		if (maMain.contient(c)) {
			System.out.println("La main contient la carte");
		} else
			System.out.println("La main ne contient pas la carte");
	}

}

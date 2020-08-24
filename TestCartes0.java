package cartes;

import java.util.ArrayList;
import java.util.HashSet;

public class TestCartes0 {

	public static void main(String[] args) {
		HashSet<Carte> cartes = new HashSet<Carte>();
		
		cartes.add(new Carte(10, Carte.CARREAU));
		cartes.add(new Carte(1, Carte.COEUR));
		
		if(cartes.contains(new Carte(10, Carte.CARREAU))) {
			System.out.println("Le jeu contient le 10 carreau");
		}else {
			System.out.println("Le jeu ne contient pas le 10 de carreau");
		}
		
		System.out.println(cartes);
		
		MainDeJoueur1 main = new MainDeJoueur1();
		main.add(new Carte(8, Carte.PIQUE));
		main.add(new Carte(2, Carte.TREFLE));
		System.out.println(main);
		for(Carte carte : main) {
			System.out.println(carte);
		}
		
		Paquet paquet = new Paquet();
		System.out.println(paquet);
	}

}

package cartes;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class Paquet {
	private ArrayList<Carte> paquet;
	
	public Paquet() {
		super();
		this.paquet = new ArrayList<Carte>();
		melanger();
	}
	
	public Paquet(Collection<Carte> paquet) {
		super();
		this.paquet = new ArrayList<Carte>(paquet);
	}
	
	private void melanger() {
		String[] couleurs = Carte.couleurs;
		for(int i=1;i<=13;i++) {
			for(String couleur : couleurs) {
				paquet.add(new Carte(i, couleur));
			}
		}
		//Ajouter une carte de joker.
		paquet.add(new Carte(0,"Joker"));
	}
	
	public MainDeJoueur1 creerMain1() {
		MainDeJoueur1 main = new MainDeJoueur1();
		main.add(paquet.remove(1));
		main.add(paquet.remove(2));
		main.add(paquet.remove(3));
		main.add(paquet.remove(4));
		main.add(paquet.remove(5));
		return main;
	}

	@Override
	public String toString() {
		String resultat = "La liste des cartes dans le paquet sont :\n";
		for(Carte carte : paquet) {
			resultat += "\t- "+carte.toString()+".\n";
		}
		
		return resultat;
	}
	

}

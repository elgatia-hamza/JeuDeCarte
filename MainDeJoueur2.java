package cartes;

import java.util.Collection;
import java.util.Iterator;
import java.util.TreeSet;

public class MainDeJoueur2 implements Iterable<Carte>{
	private TreeSet<Carte> main;
	
	public MainDeJoueur2() {
		super();
		this.main = new TreeSet<Carte>();
	}
	
	public MainDeJoueur2(Collection<Carte> main) {
		super();
		this.main = new TreeSet<Carte>(main);
	}
	
	public void add(Carte carte) {
		this.main.add(carte);
	}
	
	public boolean contient(Carte carte) {
		return main.contains(carte);
	}
	
	public boolean estSuite() {
		if(Math.abs(main.first().getValeur() - main.last().getValeur()) == 4) {
			return true;
		}
		String couleur = main.first().getCouleur();
		for (Carte carte : main) {
			if(!carte.getCouleur().equals(couleur))
				return false;
		}
		
		return true;
	}

	@Override
	public String toString() {
		String resultat = "La liste des cartes de joueur 1 sont :\n";
		for(Carte carte : main) {
			resultat += "\t- "+carte.toString()+".\n";
		}
		
		return resultat;
	}

	@Override
	public Iterator<Carte> iterator() {
		return main.iterator();
	}
}

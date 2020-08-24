package cartes;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

public class MainDeJoueur1 implements Iterable<Carte>{
	private HashSet<Carte> main;
	
	public MainDeJoueur1() {
		super();
		this.main = new HashSet<Carte>();
	}
	
	public MainDeJoueur1(Collection<Carte> main) {
		super();
		this.main = new HashSet<Carte>(main);
	}
	
	public void add(Carte carte) {
		this.main.add(carte);
	}
	
	public boolean contient(Carte carte) {
		return main.contains(carte);
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

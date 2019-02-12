package algo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import entite.AbstractGraphe;
import entite.Sommet;

public abstract class AbstractColoration {

	protected AbstractGraphe g;
	protected int nb_couleurs;
	protected Map<Sommet, Integer> affectation_couleurs;
	protected List<Sommet> liste_sommets;
	
	public AbstractColoration(AbstractGraphe g){
		this.g = g;
		this.nb_couleurs = 1;
		this.liste_sommets = this.g.getSommets();
		this.affectation_couleurs = new HashMap<Sommet, Integer>();
	}
	
	public abstract void execute();
	
	public int getNbCouleurs(){
		return this.nb_couleurs;
	}
	
	public Map<Sommet, Integer> getColoration(){
		return this.affectation_couleurs;
	}
	
	public int getMaximumInvitation(){
		int count = Collections.frequency(new ArrayList<Integer>(affectation_couleurs.values()), 1);
		return count;
		}
	
	public Collection<Integer> getInvitationName() {
	    Collection<Integer> result = new ArrayList<Integer>();
	    for(Sommet s : affectation_couleurs.keySet()) {
		    // keySet is a method of Map that returns a Set containing all the keys (and no values).
	        if((affectation_couleurs.get(s) == 1)) 
	            result.add(s.getID());
	    }
	    return result;
	}
}

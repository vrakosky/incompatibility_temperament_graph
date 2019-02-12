package algo;

import java.util.LinkedList;
import java.util.List;

import entite.AbstractGraphe;
import entite.Sommet;
/**
 * Classe modélisant la coloration selon un algorithme naïf de départ.
 * @author Vincent CANDAPPANE
 *
 */
public class Naif extends AbstractColoration{
	
	public Naif(AbstractGraphe g){
		/** Créé une nouvelle instance pour une colorisation de graphe.* 
		 * @param g le graphe à colorer. */
		super(g);
	}
	
	public void execute(){
		// Initialisation des variables
		List<Integer> couleurChoisie = new LinkedList<Integer>();
		int j;
		int size = this.liste_sommets.size();

		// On parcours tout les sommets du graphe
		for(int i = 0 ; i < size ; i++){
			couleurChoisie.clear();
			
			// On cherche les couleurs de ses voisins 
			for(Sommet s : this.liste_sommets.get(i).getVoisins()){
				if(!affectation_couleurs.containsKey(s))
					continue;
				if(couleurChoisie.contains(affectation_couleurs.get(s)))
					continue;
				
				couleurChoisie.add(affectation_couleurs.get(s));
			}
			
			j = 1;
			// On attribue au sommet courant la plus petite couleur non trouvée chez ses voisins
			while(couleurChoisie.contains(j)){
				++j;
			}

			affectation_couleurs.put(this.liste_sommets.get(i), j);
		}
		
		for(Integer i : affectation_couleurs.values())
			if(i > this.nb_couleurs)
				this.nb_couleurs = i;
	}
}

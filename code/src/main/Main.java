package main;

import algo.AbstractColoration;
import algo.Naif;
import algo.WelshPowel;
import entite.AbstractGraphe;
import entite.GrapheAleatoire;
import entite.GraphePredefini;

public class Main {
	
	/*
	 * Simulations et Observations :
	 * 		Graphe(N=50,E=368) :
	 * 			- Naif : 		10 couleurs pour 2ms
	 * 			- Welsh-Powel :	 8 couleurs pour 4ms
	 * 		Graphe(N=50,E=611) :
	 * 			- Naif : 		13 couleurs pour 1ms
	 * 			- Welsh-Powel :	11 couleurs pour 2ms
	 * 		Graphe(N=100,E=1452) :
	 * 			- Naif : 		14 couleurs pour 2ms
	 * 			- Welsh-Powel :	13 couleurs pour 5ms
	 * 		Graphe(N=200,E=5884) :
	 * 			- Naif : 		22 couleurs pour 8ms
	 * 			- Welsh-Powel :	21 couleurs pour 8ms
	 * 		Graphe(N=200,E=9980) :
	 * 			- Naif : 		37 couleurs pour 10ms
	 * 			- Welsh-Powel :	34 couleurs pour 15ms
	 * 		Graphe(N=1000,E=250220) :
	 * 			- Naif : 		126 couleurs pour 52ms
	 * 			- Welsh-Powel :	123 couleurs pour 141ms
	 * 		Graphe(N=5000,E=3126157) :
	 * 			- Naif : 		238 couleurs pour 32ms
	 * 			- Welsh-Powel :	242 couleurs pour 64ms
	 */

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		long deb, fin;
		int nb_couleurs;
		AbstractColoration coloration;

		deb = System.currentTimeMillis();
		//Création de graphe aléatoire avec prise en considération de poids
		//AbstractGraphe g = new GrapheAleatoire(1111, (float) 0.25);
		//Création de graphe prédéfini manuellement
		AbstractGraphe g = new GraphePredefini(11);
		fin = System.currentTimeMillis() - deb;

		System.out.println("----------------------- Création du GRAPHE------------------------");
		System.out.println("La création du graphe a pris " + fin + " ms.");
		System.out.println(g);

		// -------------------- Algorithme naïf ---------------------
		coloration = new Naif(g);

		deb = System.currentTimeMillis();
		coloration.execute();
		nb_couleurs = coloration.getNbCouleurs();
		fin = System.currentTimeMillis() - deb;

		System.out.println("------------------------ Algorithme naïf -------------------------");
		System.out.println("Le calcul naïf de la coloration a pris " + fin + " ms.");
		System.out.println("Coloration du graphe en " + nb_couleurs + " couleurs.");
		System.out.println("Coloration : " + coloration.getColoration());
		System.out.println("Nombre maximal de collègues de travail à inviter : " + coloration.getMaximumInvitation());
		System.out.println("Les "+ coloration.getMaximumInvitation() + " personnes invités au Bowling sont : " + coloration.getInvitationName());
		System.out.println();
		
		// -------------------- Algorithme de WelshPowel ---------------------
		coloration = new WelshPowel(g);

		deb = System.currentTimeMillis();
		coloration.execute();
		nb_couleurs = coloration.getNbCouleurs();
		fin = System.currentTimeMillis() - deb;

		System.out.println("-------------------- Algorithme de WelshPowel --------------------");
		System.out.println("Le calcul de la coloration avec l'algorithme de WelshPowel a pris " + fin + " ms.");
		System.out.println("Coloration du graphe en " + nb_couleurs + " couleurs.");
		System.out.println("Coloration : " + coloration.getColoration());
		System.out.println("Nombre maximal de collègues de travail à inviter : " + coloration.getMaximumInvitation());
		System.out.println("Les "+ coloration.getMaximumInvitation() + " personnes invités au Bowling sont : " + coloration.getInvitationName());
	}
}

package entite;

/**
 * Classe permettant de générer un Graphe aélatoire pour un nombre de sommets et
 * d'arêtes fixés.
 * 
 * @author Vincent CANDAPPANE
 * 
 */
public class GraphePredefini extends AbstractGraphe {

	private int nSommets;

	// =========================================================================================
	// Constructeurs
	// =========================================

	/**
	 * Permet d'initialiser un graphe connaissant son nombre de sommets et
	 * d'arêtes.
	 * 
	 * @param nSommets
	 *            le nombre de sommets du graphe
	 * @param nAretes
	 *            le nombre d'arêtes du graphe.
	 */
	public GraphePredefini(int nSommets) {
		super();
		this.nSommets = nSommets;
		this.generereGrapheAleatoire();
	}

	// =========================================================================================
	// Génération du graphe
	// =========================================

	/**
	 * Génère le graphe aléatoirement. Commence par générer les sommets du
	 * graphe puis génère aléatoirement le nombre d'arêtes voulu.
	 */
	private void generereGrapheAleatoire() {
		// Génération des sommets
		for (int i = 0; i < this.nSommets; i++) {
			this.sommets.add(new Sommet(i));
		}

		// On prédéfini manuellement les combinaisons de sommets selon l'énoncé du problème (20 liaisons sans doublons à créer)
					//Liaison avec A
					Arete A_B = new Arete(this.getSommets().get(0), this.getSommets().get(1));
					Arete A_C = new Arete(this.getSommets().get(0), this.getSommets().get(2));
					Arete A_D = new Arete(this.getSommets().get(0), this.getSommets().get(3));
					Arete A_E = new Arete(this.getSommets().get(0), this.getSommets().get(4));
					Arete A_G = new Arete(this.getSommets().get(0), this.getSommets().get(6));
					Arete A_I = new Arete(this.getSommets().get(0), this.getSommets().get(8));
					Arete A_J = new Arete(this.getSommets().get(0), this.getSommets().get(9));
					Arete A_K = new Arete(this.getSommets().get(0), this.getSommets().get(10));
					this.aretes.add(A_B);
					this.aretes.add(A_C);
					this.aretes.add(A_D);
					this.aretes.add(A_E);
					this.aretes.add(A_G);
					this.aretes.add(A_I);
					this.aretes.add(A_J);
					this.aretes.add(A_K);

					
					//Liaison avec B
					//Arete B_A = new Arete(this.getSommets().get(1), this.getSommets().get(0));
					Arete B_C = new Arete(this.getSommets().get(1), this.getSommets().get(2));
					//this.aretes.add(B_A);
					this.aretes.add(B_C);
					
					//Liaison avec C
					//Arete C_A = new Arete(this.getSommets().get(2), this.getSommets().get(0));
					//Arete C_B = new Arete(this.getSommets().get(2), this.getSommets().get(1));
					Arete C_D = new Arete(this.getSommets().get(2), this.getSommets().get(3));
					//this.aretes.add(C_A);
					//this.aretes.add(C_B);
					this.aretes.add(C_D);
					
					//Liaison avec D
					//Arete D_A = new Arete(this.getSommets().get(2), this.getSommets().get(0));
					//Arete D_C = new Arete(this.getSommets().get(3), this.getSommets().get(2));
					Arete D_E = new Arete(this.getSommets().get(3), this.getSommets().get(4));
					Arete D_F = new Arete(this.getSommets().get(3), this.getSommets().get(5));
					//this.aretes.add(D_A);
					//this.aretes.add(D_C);
					this.aretes.add(D_E);
					this.aretes.add(D_F);
					
					//Liaison avec E
					//Arete E_A = new Arete(this.getSommets().get(4), this.getSommets().get(0));
					//Arete E_D = new Arete(this.getSommets().get(4), this.getSommets().get(3));
					Arete E_F = new Arete(this.getSommets().get(4), this.getSommets().get(5));
					Arete E_G = new Arete(this.getSommets().get(4), this.getSommets().get(6));
					//this.aretes.add(E_A);
					//this.aretes.add(E_D);
					this.aretes.add(E_F);
					this.aretes.add(E_G);
					
					//Liaison avec F
					//Arete F_D = new Arete(this.getSommets().get(5), this.getSommets().get(3));
					//Arete F_E = new Arete(this.getSommets().get(5), this.getSommets().get(4));
					Arete F_G = new Arete(this.getSommets().get(5), this.getSommets().get(6));
					//this.aretes.add(F_D);
					//this.aretes.add(F_E);
					this.aretes.add(F_G);
					
					//Liaison avec G
					//Arete G_A = new Arete(this.getSommets().get(6), this.getSommets().get(0));
					//Arete G_E = new Arete(this.getSommets().get(6), this.getSommets().get(4));
					//Arete G_F = new Arete(this.getSommets().get(6), this.getSommets().get(5));
					Arete G_H = new Arete(this.getSommets().get(6), this.getSommets().get(7));
					Arete G_I = new Arete(this.getSommets().get(6), this.getSommets().get(8));
					Arete G_K = new Arete(this.getSommets().get(6), this.getSommets().get(10));
					//this.aretes.add(G_A);
					//this.aretes.add(G_E);
					//this.aretes.add(G_F);
					this.aretes.add(G_H);
					this.aretes.add(G_I);
					this.aretes.add(G_K);
					
					//Liaison avec H
					//Arete H_G = new Arete(this.getSommets().get(7), this.getSommets().get(6));
					//this.aretes.add(H_G);
					
					//Liaison avec I
					//Arete I_A = new Arete(this.getSommets().get(8), this.getSommets().get(0));
					//Arete I_G = new Arete(this.getSommets().get(8), this.getSommets().get(6));
					Arete I_J = new Arete(this.getSommets().get(8), this.getSommets().get(9));
					Arete I_K = new Arete(this.getSommets().get(8), this.getSommets().get(10));
					//this.aretes.add(I_A);
					//this.aretes.add(I_G);
					this.aretes.add(I_J);
					this.aretes.add(I_K);
					
					//Liaison avec J
					//Arete J_A = new Arete(this.getSommets().get(9), this.getSommets().get(0));
					//Arete J_I = new Arete(this.getSommets().get(9), this.getSommets().get(8));
					//this.aretes.add(J_A);
					//this.aretes.add(J_I);

					//Liaison avec K
					//Arete K_A = new Arete(this.getSommets().get(10), this.getSommets().get(0));
					//Arete K_G = new Arete(this.getSommets().get(10), this.getSommets().get(6));
					//Arete K_I = new Arete(this.getSommets().get(10), this.getSommets().get(8));
					//this.aretes.add(K_A);
					//this.aretes.add(K_G);
					//this.aretes.add(K_I);
					
	}

}

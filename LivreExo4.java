//AlhassaneDialloDBEP4
//exo4

public class LivreExo4 {
    // Variables
    private String titre, auteur;
    private int nbPages;
    private double prix;
    private boolean prixFixe; // Booléen pour vérifier si le prix a été fixé

    // Constructeurs
    public Livre() {
        // Constructeur sans paramètre
        prixFixe = false; // Par défaut, le prix n'est pas fixé
    }

    public Livre(String unAuteur, String unTitre) {
        auteur = unAuteur;
        titre = unTitre;
        prixFixe = false; // Par défaut, le prix n'est pas fixé
    }

    public Livre(String unAuteur, String unTitre, int pages) {
        auteur = unAuteur;
        titre = unTitre;
        nbPages = pages;
        prixFixe = false; // Par défaut, le prix n'est pas fixé
    }

    public Livre(String unAuteur, String unTitre, int pages, double unPrix) {
        auteur = unAuteur;
        titre = unTitre;
        nbPages = pages;
        prix = unPrix;
        prixFixe = true; // Le prix est fixé lors de la création du livre
    }

    // Accesseurs et modificateurs (inchangés par rapport à la réponse précédente)

    // Méthode toString() pour décrire le livre avec indication du prix
    @Override
    public String toString() {
        if (prixFixe) {
            return "Livre : Auteur = '" + auteur + "', Titre = '" + titre + "', Nombre de pages = " + nbPages + ", Prix = " + prix;
        } else {
            return "Livre : Auteur = '" + auteur + "', Titre = '" + titre + "', Nombre de pages = " + nbPages + ", Prix pas encore fixé";
        }
    }

    // Méthode setPrix pour fixer le prix du livre
    public void setPrix(double nouveauPrix) {
        if (!prixFixe) {
            prix = nouveauPrix;
            prixFixe = true; // Marque le prix comme fixé
        } else {
            System.out.println("Erreur : Le prix a déjà été fixé pour ce livre.");
        }
    }

    public static void main(String[] args) {
        // Création de livres avec différents cas de prix fixé ou non
        Livre livre1 = new Livre();
        Livre livre2 = new Livre("Auteur1", "Titre1");
        Livre livre3 = new Livre("Auteur2", "Titre2", 300);
        Livre livre4 = new Livre("Auteur3", "Titre3", 400, 29.99);

        // Tentatives de modification du prix pour certains livres
        livre1.setPrix(15.50); // Fixe le prix pour livre1
        livre2.setPrix(20.75); // Affiche une erreur car le prix pour livre2 a déjà été fixé

        // Affichage des détails des livres
        System.out.println(livre1);
        System.out.println(livre2);
        System.out.println(livre3);
        System.out.println(livre4);
    }
}


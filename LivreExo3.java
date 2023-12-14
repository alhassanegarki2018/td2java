//AlhassaneDialloDBEP4
//exo3
public class LivreExo3 {
    // Variables
    private String titre, auteur;
    private int nbPages;

    // Constructeurs
    public Livre() {
        // Constructeur sans paramètre
    }

    public Livre(String unAuteur, String unTitre) {
        auteur = unAuteur;
        titre = unTitre;
    }

    public Livre(String unAuteur, String unTitre, int pages) {
        auteur = unAuteur;
        titre = unTitre;
        nbPages = pages;
    }

    // Accesseurs et modificateurs (inchangés par rapport à la réponse précédente)

    // Méthode afficheToi() utilisant toString()
    public void afficheToi() {
        System.out.println(toString());
    }

    // Méthode toString() pour décrire le livre
    @Override
    public String toString() {
        return "Livre : " + "Auteur = '" + auteur + "', Titre = '" + titre + "', Nombre de pages = " + nbPages;
    }

    public static void main(String[] args) {
        Livre livre1 = new Livre(); // Création d'un livre sans paramètre
        Livre livre2 = new Livre("Auteur1", "Titre1"); // Création d'un livre avec auteur et titre
        Livre livre3 = new Livre("Auteur2", "Titre2", 300); // Création d'un livre avec auteur, titre et nombre de pages

        // Affichage en utilisant la méthode afficheToi()
        livre1.afficheToi();
        livre2.afficheToi();
        livre3.afficheToi();
    }
}


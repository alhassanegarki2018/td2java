//AlhassaneDialloDBEP4
//exo2
public class LivreExo2 {
    // Variables
    private String titre, auteur;
    private int nbPages;

    // Constructeur
    public Livre(String unAuteur, String unTitre) {
        auteur = unAuteur;
        titre = unTitre;
    }

    // Accesseurs
    public String getTitre() {
        return titre;
    }

    public int getNbPages() {
        return nbPages;
    }

    // Modificateurs
    public void setAuteur(String nouvelAuteur) {
        auteur = nouvelAuteur;
    }

    public void setTitre(String nouveauTitre) {
        titre = nouveauTitre;
    }

    public void setNbPages(int nb) {
        if (nb > 0) {
            nbPages = nb;
        } else {
            System.out.println("Erreur : Le nombre de pages doit être un nombre positif.");
        }
    }

    public static void main(String[] args) {
        Livre livre1 = new Livre("Auteur1", "Titre1");
        Livre livre2 = new Livre("Auteur2", "Titre2");

        // Définition du nombre de pages pour chaque livre
        livre1.setNbPages(200);
        livre2.setNbPages(-50); // Tentative de définir un nombre de pages négatif

        // Affichage du nombre de pages de chaque livre
        System.out.println("Nombre de pages du livre 1 : " + livre1.getNbPages());
        System.out.println("Nombre de pages du livre 2 : " + livre2.getNbPages());

        // Calcul et affichage du nombre total de pages des deux livres
        int totalPages = livre1.getNbPages() + livre2.getNbPages();
        System.out.println("Nombre total de pages des deux livres : " + totalPages);
    }
}


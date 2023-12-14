//AlhassaneDialloDBEP4
//exo1
public class Livre {
    // Variables
    private String titre, auteur;
    private int nbPages; // Ajout du point-virgule manquant

    // Constructeur
    public Livre(String unAuteur, String unTitre) {
        auteur = unAuteur;
        titre = unTitre;
    }

    // Accesseur
    public String getAuteur() {
        return auteur;
    }

    // Modificateur
    public void setNbPages(int nb) { // Correction du nom de la variable
        nbPages = nb; // Correction du nom de la variable
    }

    public static void main(String[] args) {
        Livre livre1 = new Livre("Auteur1", "Titre1");
        Livre livre2 = new Livre("Auteur2", "Titre2");

        System.out.println("Auteur du livre 1 : " + livre1.getAuteur());
        System.out.println("Auteur du livre 2 : " + livre2.getAuteur());
    }
}


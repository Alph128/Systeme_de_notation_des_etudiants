import java.util.ArrayList;

public class Etudiant {
    private String nom;
    private String prenom;
    private ArrayList<Double> notes;

    public Etudiant(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
        this.notes = new ArrayList<>();
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public ArrayList<Double> getNotes() {
        return notes;
    }

    @Override
    public String toString() {
        return "Etudiant{nom='" + nom + "', prenom='" + prenom + "', notes=" + notes + "}";
    }
}
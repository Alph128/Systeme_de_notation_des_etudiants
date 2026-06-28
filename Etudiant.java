import java.util.ArrayList;
public class Etudiant {
    private String nom;
    private String prenomEtudiant;
    private ArrayList<Double> notes;
    public Etudiant(String nom, String prenom) {
        this.nom = nom;
        this.prenomEtudiant = prenom;
        this.notes = new ArrayList<>();
    }
    public String getNom() {
        return nom;
    }
    public String getPrenomEtudiant() {
        return prenomEtudiant;
    }
    public ArrayList<Double> getNotes() {
        return notes;
    }
    public void ajouterNote(double note) {
        notes.add(note);
    }
public double calculerMoyenne() {
        if (notes.isEmpty()) return 0;
        double somme = 0;
        for (double n : notes) somme += n;
        return somme / notes.size();
    }
    @Override
    public String toString() {
        return "Etudiant{nom='" + nom + "', prenom='" + prenomEtudiant + "', notes=" + notes + "}";
    }
}
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
    @Override
    public String toString() {
        return "Etudiant{nom='" + nom + "', prenom='" + prenomEtudiant + "', notes=" + notes + "}";
    }
}
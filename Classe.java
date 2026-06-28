import java.util.ArrayList;

public class Classe {

    private String nomClasse;
    private ArrayList<Etudiant> etudiants;

    public Classe(String nomClasse) {
        this.nomClasse = nomClasse;
        this.etudiants = new ArrayList<>();
    }

    public void ajouterEtudiant(Etudiant etudiant) {
        if (etudiant == null) {
            return;
        }
        etudiants.add(etudiant);
    }

    public int nombreEtudiants() {
        return etudiants.size();
    }

    @Override
    public String toString() {
        return "Classe{nomClasse='" + nomClasse + "', etudiants=" + etudiants + "}";
    }
}
package gestion;

import java.util.ArrayList;

public class GestionEtudiant {
    private ArrayList<Etudiant> etudiants = new ArrayList<>();

    public ArrayList<Etudiant> listE() {
        return this.etudiants;
    }
    
    public void ajouterEtudiant(Etudiant etudiant) {
        etudiants.add(etudiant);
    }
}

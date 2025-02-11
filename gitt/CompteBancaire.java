package exo3;

public class CompteBancaire {
    private String titulaire;
    private double solde;

    public CompteBancaire(String titulaire, double soldeInitial) {
        this.titulaire = titulaire;
        this.solde = soldeInitial;
    }

    public void deposer(double montant) {
        if (montant > 0) {
            solde += montant;
            System.out.println(titulaire + ": " + montant + " a été déposé sur le compte.");
        }
    }

    public void retirer(double montant) {
        if (solde >= montant) {
            solde -= montant;
            System.out.println(titulaire + ": " + montant + " a été retiré du compte.");
        } else {
            System.out.println(titulaire + ": Vous n'avez que " + solde + " sur votre compte.");
        }
    }
}



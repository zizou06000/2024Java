package gestion;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Démarrage Ecole v2");

        GestionEtudiant gestion = new GestionEtudiant();
        Scanner scanner = new Scanner(System.in);
        int menu;

        do {
            System.out.println("\nQue voulez-vous faire ?");
            System.out.println("1 - Voir la liste");
            System.out.println("2 - Ajouter un étudiant");
            System.out.println("3 - Supprimer un étudiant");
            System.out.println("0 - Quitter le programme");
            System.out.print("Votre choix : ");
            menu = scanner.nextInt();
            scanner.nextLine();  // Pour éviter les problèmes de saut de ligne

            switch (menu) {
                case 1:
                    System.out.println("Liste des étudiants :");
                    for (Etudiant e : gestion.listE()) {
                        System.out.println(e.getNom() + " " + e.getPrenom() + " - " + e.getClasse());
                    }
                    break;

                case 2:
                    System.out.print("Nom : ");
                    String nom = scanner.nextLine();
                    System.out.print("Prénom : ");
                    String prenom = scanner.nextLine();
                    System.out.print("Classe : ");
                    String classe = scanner.nextLine();

                    Etudiant nouvelEtudiant = new Etudiant(nom, prenom, classe);
                    gestion.ajouterEtudiant(nouvelEtudiant);
                    System.out.println("Étudiant ajouté avec succès !");
                    break;

                case 3:
                    System.out.println("Suppression non encore implémentée.");
                    break;

                case 0:
                    System.out.println("Fermeture du programme...");
                    break;

                default:
                    System.out.println("Action non reconnue, veuillez réessayer.");
                    break;
            }

        } while (menu != 0);

        scanner.close();
    }
}

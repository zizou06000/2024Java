import java.util.Scanner;

public class Exo2 {
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in); 
        System.out.print("Entrez la couleur : ");
        String couleur = scanner.nextLine();
        scanner.close(); 

        boolean found = false;
        for(String color : Voiture.colorAutorized) {
            if (color.equals(couleur)) {
                found = true;
                break;
            }
        }

        if (found) {
            
            Voiture voiture = new Voiture("Toyota", "Corolla", "Rouge");
            
            
            System.out.println(voiture.getMarque() + " " + voiture.getModele() + " " + voiture.getCouleur());
        } else {
            System.out.println("Erreur dans le choix de la couleur !");
            System.exit(1);
        }
    }
}

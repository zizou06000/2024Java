package exo3;

public class Main3 {
    public static void main(String[] args) {
        CompteBancaire compte = new CompteBancaire("Loïc", 1000);
        
        compte.retirer(500);
        compte.deposer(300);
        compte.retirer(3000);
    }
}

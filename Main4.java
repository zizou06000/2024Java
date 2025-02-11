public class Main4 {
    static String[] cours = {"Dev Java", "Management", "Cyber"};

    public static String getElement(int index) throws ArrayIndexOutOfBoundsException {
        if (index >= cours.length) {
            throw new ArrayIndexOutOfBoundsException("Vous cherchez un élément qui est hors du tableau !");
        }

        return cours[index];
    }

    public static void main(String[] args) {
        try {
            System.out.println(getElement(6));
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Erreur capturée : " + e.getMessage());
        }
    }
}


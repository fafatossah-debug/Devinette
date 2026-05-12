import java.util.Scanner;
import java.util.Random;
public class Devinette {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Génération d'un nombre aléatoire entre 1 et 100
        int nombreSecret = random.nextInt(100) + 1;
        int tentativesMax = 10;
        int essais = 0;
        boolean Gagner = false;

        System.out.println("Bienvenue dans les devinette! J'ai choisi un nombre secret entre 1 et 100.");
        System.out.println("Tu as 10 essais pour le Deviner.");

        //  Création d'une  boucle
        while (essais < tentativesMax) {
            essais++;
            System.out.print("Essai n°" + essais + " - Devine le nombre secret, entre le !! : ");

        }
        //  Lecture de l'entrée de l'utilisateur (Le joueur)

        int devinette = scanner.nextInt();

        //  Comparaison du nombre secret et celui du joueur

        if (devinette == nombreSecret) {
            // Cas de victoire

            Gagner = true;

            //Les indices
        } else if (devinette < nombreSecret) {
            System.out.println("C'est inferieur au nombre secret !");
        } else {
            System.out.println("C'est supérieur au nombre secret!");
        }

    // Résultat en cas de victoire du joueur
        if (Gagner) {
        System.out.println("Félicitations ! Tu as trouvé le nombre secret  " + nombreSecret + " en " + essais + " essais.");
    } else {
        // Résulutat en cas de défaite après 10 essais
        System.out.println("Dommage, tu as épuisé tes 10 essais.");
        System.out.println("Le nombre secret était : " + nombreSecret);
    }

        scanner.close();
}



}

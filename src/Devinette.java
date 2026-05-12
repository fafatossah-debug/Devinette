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

        System.out.println("Bienvenue dans les devinette! J'ai choisi un nombre aléatoire entre 1 et 100.");
        System.out.println("Tu as 10 essais pour le Deviner.");
    }
}

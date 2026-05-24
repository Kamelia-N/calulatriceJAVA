import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continuer = true;

        System.out.println("=== Calculatrice Java ===");

        while (continuer) {
            double nombre1 = lireNombre(scanner, "Entrez le premier nombre : ");
            String operateur = lireOperateur(scanner);
            double nombre2 = lireNombre(scanner, "Entrez le deuxieme nombre : ");

            afficherResultat(nombre1, nombre2, operateur);

            System.out.print("Voulez-vous faire un autre calcul ? (o/n) : ");
            String reponse = scanner.next();
            continuer = reponse.equalsIgnoreCase("o");
        }

        scanner.close();
        System.out.println("Au revoir !");
    }

    private static double lireNombre(Scanner scanner, String message) {
        System.out.print(message);

        while (!scanner.hasNextDouble()) {
            System.out.print("Valeur invalide. Entrez un nombre : ");
            scanner.next();
        }

        return scanner.nextDouble();
    }

    private static String lireOperateur(Scanner scanner) {
        System.out.print("Entrez un operateur (+, -, *, /) : ");
        return scanner.next();
    }

    private static void afficherResultat(double nombre1, double nombre2, String operateur) {
        switch (operateur) {
            case "+":
                System.out.println("Resultat : " + (nombre1 + nombre2));
                break;
            case "-":
                System.out.println("Resultat : " + (nombre1 - nombre2));
                break;
            case "*":
                System.out.println("Resultat : " + (nombre1 * nombre2));
                break;
            case "/":
                if (nombre2 == 0) {
                    System.out.println("Erreur : division par zero impossible.");
                } else {
                    System.out.println("Resultat : " + (nombre1 / nombre2));
                }
                break;
            default:
                System.out.println("Erreur : operateur invalide.");
                break;
        }
    }
}
import java.util.Scanner;

public class PetSoftwareApp {
    private static Scanner scanner = new Scanner(System.in);
    private static Register animalRegister = new Register();

    public static void main(String[] args) {


        while (true)
        {
            showMenu();
            String userInput = scanner.nextLine();

            switch (userInput.toLowerCase()) {
                case "a":
                    registerAnimal();
                    break;
                case "b":
                    removeAnimal();
                    break;
                case "c":
                    animalRegister.showRegister();
                    break;
                case "d":
                    return;
            }
        }
    }

    public static void showMenu() {
        System.out.println("\n╔════════════════════════════════════════╗");
        System.out.println("║                                        ║");
        System.out.println("║    SISTEMA DE REGISTRO VETERINARIO     ║");
        System.out.println("║                                        ║");
        System.out.println("╠════════════════════════════════════════╣");
        System.out.println("║                                        ║");
        System.out.println("║  A. Registrar nuevo animal             ║");
        System.out.println("║  B. Eliminar registro de animal        ║");
        System.out.println("║  C. Ver todos los animales             ║");
        System.out.println("║  D. Salir                              ║");
        System.out.println("║                                        ║");
        System.out.println("╚════════════════════════════════════════╝");
        System.out.print("\n➤ Ingrese una opción: ");
    }

    public static void registerAnimal() {
        System.out.println("¿Qué tipo de animal deseas registrar? (Perro/Gato): ");
        String animalType = scanner.nextLine().trim().toLowerCase();

        switch (animalType.toLowerCase()) {
            case "perro":
                Dog newDog = Dog.createDog();
                animalRegister.addAnimalToRegister(newDog);
                newDog.showInfo();
                break;

            case "gato":
                Cat newCat = Cat.createCat();
                animalRegister.addAnimalToRegister(newCat);
                newCat.showInfo();
                break;

            default:
                System.out.println("\n✗ Tipo de animal no válido.");
                break;
        }
    }

    public static void removeAnimal() {
        System.out.println("\n=== ELIMINAR ANIMAL ===\n");
        System.out.println("─────────────────────────────────────");

        System.out.print("\nIngresa el número del animal a eliminar: ");
        int animalNumber = scanner.nextInt();
        animalRegister.removeAnimalFromRegister(animalNumber);
    }
}

import java.util.Scanner;

public class PetSoftwareApp {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Register animalRegister = new Register();

        while (true)
        {
            showMenu();
            String userInput = scanner.nextLine();

            switch (userInput.toLowerCase()) {
                case "a":
                    break;
                case "b":
                    break;
                case "c":
                    animalRegister.showRegister();
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
        System.out.println("║  D. Buscar animal por nombre           ║");
        System.out.println("║  E. Salir                              ║");
        System.out.println("║                                        ║");
        System.out.println("╚════════════════════════════════════════╝");
        System.out.print("\n➤ Ingrese una opción: ");
    }


}
